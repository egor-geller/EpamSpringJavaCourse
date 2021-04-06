package by.geller.project.implTest;

import by.geller.project.creator.NumbersInBlockCreator;
import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.DefineService;
import by.geller.project.service.impl.DefineServiceImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DefineServiceImpTest {
    private final DefineService defineService = new DefineServiceImp();
    BlockOfNumbers baseArray;

    Logger logger = LogManager.getLogger();

    @BeforeClass
    public void setNumbers() throws EmptyArrayException {
        NumbersInBlockCreator numbersInBlockCreator = new NumbersInBlockCreator();
        baseArray = numbersInBlockCreator.createBlockWithNumbers(2, 8, -4, 3, 5, 4);
    }

    @Test
    public void sumOfAllNumbersTest() throws EmptyArrayException {
        int sum = defineService.sumOfAllNumbers(baseArray);
        System.out.println(sum);
        Assert.assertEquals(sum, 18);
        logger.info("sumOfAllNumbersTest() - Success");
    }

    @Test
    public void averageOfAnArray() throws EmptyArrayException {
        int averageOfArray = defineService.average(baseArray);
        System.out.println(averageOfArray);
        Assert.assertEquals(averageOfArray, 3);
        logger.info("averageOfAnArray() - Success");
    }

    @Test
    public void countPositiveNumbersTest() throws EmptyArrayException {
        int countPositiveNumbers = defineService.countPositiveNumbers(baseArray);
        Assert.assertEquals(countPositiveNumbers, 5);
        logger.info("countPositiveNumbersTest() - Success");
    }

    @Test
    public void countNegativeNumbersTest() throws EmptyArrayException {
        int countNegativeNumbers = defineService.countNegativeNumbers(baseArray);
        Assert.assertEquals(countNegativeNumbers, 1);
        logger.info("countNegativeNumbersTest() - Success");
    }
}
