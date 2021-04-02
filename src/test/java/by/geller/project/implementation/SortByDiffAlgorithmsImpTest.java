package by.geller.project.implementation;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortByDiffAlgorithmsImpTest {
    private final SortByDiffAlgorithmsImp sortByDiffAlgorithmsImp = new SortByDiffAlgorithmsImp();

    Logger logger = LogManager.getLogger();

    private final Massive baseArray = new Massive(new int[]{2, 8, -4, 3, 5, 4});

    @Test
    public void bubbleSortTest() throws EmptyArrayException {
        Massive copyOfBaseModule = new Massive(new int[]{2, 8, -4, 3, 5, 4});
        Massive newArrayOfSortedElements = new Massive(new int[]{-4, 2, 3, 4, 5, 8});
        sortByDiffAlgorithmsImp.bubbleSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("bubbleSortTest() - Success");
    }

    @Test
    public void selectionSortTest() throws EmptyArrayException {
        Massive copyOfBaseModule = new Massive(new int[]{2, 8, -4, 3, 5, 4});
        Massive newArrayOfSortedElements = new Massive(new int[]{-4, 2, 3, 4, 5, 8});
        sortByDiffAlgorithmsImp.selectionSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("selectionSortTest() - Success");
    }

    @Test
    public void quickSortTest() throws EmptyArrayException {
        Massive copyOfBaseModule = new Massive(new int[]{2, 8, -4, 3, 5, 4});
        Massive newArrayOfSortedElements = new Massive(new int[]{-4, 2, 3, 4, 5, 8});
        sortByDiffAlgorithmsImp.quickSort(copyOfBaseModule, 0, 5);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("quickSortTest() - Success");
    }
}
