package by.geller.project.implTest;

import by.geller.project.creator.NumbersInBlockCreator;
import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.SearchService;
import by.geller.project.service.impl.SearchStreamServiceImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchStreamServiceImpTest {
    private final SearchService searchService = new SearchStreamServiceImp();

    BlockOfNumbers baseArray;

    Logger logger = LogManager.getLogger();

    @BeforeClass
    public void setNumbers() throws EmptyArrayException {
        NumbersInBlockCreator numbersInBlockCreator = new NumbersInBlockCreator();
        baseArray = numbersInBlockCreator.createBlockWithNumbers(2, 8, -4, 3, 5, 4);
    }

    @Test
    public void minimumNumberInArrayTest() throws EmptyArrayException {
        int minNumber = searchService.min(baseArray);
        Assert.assertEquals(minNumber, -4);
        logger.info("minimumNumberInArrayTest() - Success");
    }

    @Test
    public void maximumNumberInArrayTest() throws EmptyArrayException {
        int maxNumber = searchService.max(baseArray);
        System.out.println(baseArray);
        Assert.assertEquals(maxNumber, 8);
        logger.info("maximumNumberInArrayTest() - Success");
    }
}
