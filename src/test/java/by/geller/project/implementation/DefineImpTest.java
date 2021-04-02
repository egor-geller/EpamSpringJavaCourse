package by.geller.project.implementation;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.services.ChangeElements;
import by.geller.project.services.Define;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefineImpTest {
    private final Define define = new DefineImp();

    Logger logger = LogManager.getLogger();

    private final Massive baseArray = new Massive(new int[]{2, 8, -4, 3, 5, 4});

    @Test
    public void sumOfAllNumbersTest() throws EmptyArrayException {
        int sum = define.sumOfAllNumbers(baseArray);
        System.out.println(sum);
        Assert.assertEquals(sum, 18);
        logger.info("sumOfAllNumbersTest() - Success");
    }

    @Test
    public void averageOfAnArray() throws EmptyArrayException {
        int averageOfArray = define.average(baseArray);
        System.out.println(averageOfArray);
        Assert.assertEquals(averageOfArray, 3);
        logger.info("averageOfAnArray() - Success");
    }

    @Test
    public void changeElementInPositionTest() throws EmptyArrayException {
        ChangeElements changeElements = new ChangeElementsImp();
        Massive copyOfBaseModule = new Massive(new int[]{2, 8, -4, 3, 5, 4});
        Massive newArrayOfChangedElement = new Massive(new int[]{2, 8, -4, 3, 5, 10});
        int elementToChange = 10;
        int position = 5;
        changeElements.changeElementInPosition(copyOfBaseModule, elementToChange, position);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfChangedElement));
        logger.info("changeElementInPositionTest() - Success");
    }

    @Test
    public void countPositiveNumbersTest() throws EmptyArrayException {
        int countPositiveNumbers = define.countPositiveNumbers(baseArray);
        Assert.assertEquals(countPositiveNumbers, 5);
        logger.info("countPositiveNumbersTest() - Success");
    }

    @Test
    public void countNegativeNumbersTest() throws EmptyArrayException {
        int countNegativeNumbers = define.countNegativeNumbers(baseArray);
        Assert.assertEquals(countNegativeNumbers, 1);
        logger.info("countNegativeNumbersTest() - Success");
    }
}
