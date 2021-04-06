package by.geller.project.implTest;

import by.geller.project.creator.NumbersInBlockCreator;
import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.impl.SortByDiffAlgorithmsServiceImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SortByDiffAlgorithmsServiceImpTest {
    private final SortByDiffAlgorithmsServiceImp sortByDiffAlgorithmsImp = new SortByDiffAlgorithmsServiceImp();

    BlockOfNumbers baseArray;

    Logger logger = LogManager.getLogger();

    @BeforeClass
    public void setNumbers() throws EmptyArrayException {
        NumbersInBlockCreator numbersInBlockCreator = new NumbersInBlockCreator();
        baseArray = numbersInBlockCreator.createBlockWithNumbers(2, 8, -4, 3, 5, 4);
    }

    @Test
    public void bubbleSortTest() throws EmptyArrayException {
        BlockOfNumbers copyOfBaseModule = new BlockOfNumbers(new int[]{2, 8, -4, 3, 5, 4});
        BlockOfNumbers newArrayOfSortedElements = new BlockOfNumbers(new int[]{-4, 2, 3, 4, 5, 8});
        sortByDiffAlgorithmsImp.bubbleSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("bubbleSortTest() - Success");
    }

    @Test
    public void selectionSortTest() throws EmptyArrayException {
        BlockOfNumbers copyOfBaseModule = new BlockOfNumbers(new int[]{2, 8, -4, 3, 5, 4});
        BlockOfNumbers newArrayOfSortedElements = new BlockOfNumbers(new int[]{-4, 2, 3, 4, 5, 8});
        sortByDiffAlgorithmsImp.selectionSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("selectionSortTest() - Success");
    }

    @Test
    public void quickSortTest() throws EmptyArrayException {
        BlockOfNumbers copyOfBaseModule = new BlockOfNumbers(new int[]{2, 8, -4, 3, 5, 4});
        BlockOfNumbers newArrayOfSortedElements = new BlockOfNumbers(new int[]{-4, 2, 3, 4, 5, 8});
        sortByDiffAlgorithmsImp.quickSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("quickSortTest() - Success");
    }
}
