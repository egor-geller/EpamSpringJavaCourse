package by.geller.project.toIntStreamImplementation;

import by.geller.project.Entity.MyModule;
import by.geller.project.Implementation.ArrayServiceImp;
import by.geller.project.exeption.EmptyArrayExeption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ArrayServiceImpTest {
    Logger logger = LogManager.getLogger();
    private final ArrayServiceImp serviceImp = new ArrayServiceImp();
    private final MyModule baseArray = new MyModule(new int[]{2, 8, -4, 3, 5, 4});

    @Test
    public void sumOfAllNumbersTest() throws EmptyArrayExeption {
        int sum = serviceImp.sumOfAllNumbers(baseArray);
        System.out.println(sum);
        Assert.assertEquals(sum, 18);
        logger.info("sumOfAllNumbersTest() - Success");
    }

    @Test
    public void averageOfAnArray() throws EmptyArrayExeption {
        int averageOfArray = serviceImp.average(baseArray);
        System.out.println(averageOfArray);
        Assert.assertEquals(averageOfArray, 3);
        logger.info("averageOfAnArray() - Success");
    }

    @Test
    public void changeElementInPositionTest() throws EmptyArrayExeption{
        MyModule copyOfBaseModule = new MyModule(new int[]{2, 8, -4, 3, 5, 4});
        MyModule newArrayOfChangedElement = new MyModule(new int[]{2, 8, -4, 3, 5, 10});
        int elementToChange = 10;
        int position = 5;
        serviceImp.changeElementInPosition(copyOfBaseModule, elementToChange, position);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfChangedElement));
        logger.info("changeElementInPositionTest() - Success");
    }

    @Test
    public void countPositiveNumbersTest() throws EmptyArrayExeption{
        int countPositiveNumbers = serviceImp.countPositiveNumbers(baseArray);
        Assert.assertEquals(countPositiveNumbers, 5);
        logger.info("countPositiveNumbersTest() - Success");
    }

    @Test
    public void countNegativeNumbersTest() throws EmptyArrayExeption{
        int countNegativeNumbers = serviceImp.countNegativeNumbers(baseArray);
        Assert.assertEquals(countNegativeNumbers, 1);
        logger.info("countNegativeNumbersTest() - Success");
    }

    @Test
    public void minimumNumberInArrayTest() throws EmptyArrayExeption{
        int minNumber = serviceImp.min(baseArray);
        Assert.assertEquals(minNumber, -4);
        logger.info("minimumNumberInArrayTest() - Success");
    }

    @Test
    public void maximumNumberInArrayTest() throws EmptyArrayExeption{
        int maxNumber = serviceImp.max(baseArray);
        System.out.println(baseArray);
        Assert.assertEquals(maxNumber, 8);
        logger.info("maximumNumberInArrayTest() - Success");
    }

    @Test
    public void bubbleSortTest() throws EmptyArrayExeption{
        MyModule copyOfBaseModule = new MyModule(new int[]{2, 8, -4, 3, 5, 4});
        MyModule newArrayOfSortedElements = new MyModule(new int[]{-4, 2, 3, 4, 5, 8});
        serviceImp.bubbleSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("bubbleSortTest() - Success");
    }

    @Test
    public void selectionSortTest() throws EmptyArrayExeption{
        MyModule copyOfBaseModule = new MyModule(new int[]{2, 8, -4, 3, 5, 4});
        MyModule newArrayOfSortedElements = new MyModule(new int[]{-4, 2, 3, 4, 5, 8});
        serviceImp.selectionSort(copyOfBaseModule);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("selectionSortTest() - Success");
    }

    //Not with IntStream yet
    @Test
    public void quickSortTest() throws EmptyArrayExeption{
        MyModule copyOfBaseModule = new MyModule(new int[]{2, 8, -4, 3, 5, 4});
        MyModule newArrayOfSortedElements = new MyModule(new int[]{-4, 2, 3, 4, 5, 8});
        serviceImp.quickSort(copyOfBaseModule, 0, 5);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfSortedElements));
        logger.info("quickSortTest() - Success");
    }
}
