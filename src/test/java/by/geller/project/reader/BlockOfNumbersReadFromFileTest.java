package by.geller.project.reader;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockOfNumbersReadFromFileTest {
    private final ReadSetOfNumbersFromFile readSetOfNumbersFromFile = new ReadSetOfNumbersFromFile();
    private final BlockOfNumbers baseArray = new BlockOfNumbers();
    Logger logger = LogManager.getLogger();

    @Test
    public void readRightArrayTest() throws EmptyArrayException {
        String pathToTxt = "C:\\Users\\egorg\\IdeaProjects\\MyFirstProject\\src\\main\\resources\\read.txt";
        int[] array = readSetOfNumbersFromFile.readMassive(pathToTxt);
        baseArray.setMyArray(array);
        BlockOfNumbers diffArray = new BlockOfNumbers(new int[]{0, 1, 2, 344444, 4, 5, 6});

        Assert.assertTrue(baseArray.equals(diffArray));
        logger.info("readRightArrayTest() - Success");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void readWrongArrayTest() throws EmptyArrayException {
        String pathToTxt = "C:\\Users\\egorg\\IdeaProjects\\MyFirstProject\\src\\main\\resources\\readWrong.txt";
        int[] array = readSetOfNumbersFromFile.readMassive(pathToTxt);
    }

}
