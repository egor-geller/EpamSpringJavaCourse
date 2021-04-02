package by.geller.project.reader;

import by.geller.project.entity.Massive;
import by.geller.project.exception.ReadException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MassiveReadFromFileTest {
    Logger logger = LogManager.getLogger();
    private final MassiveReadFromFile massiveReadFromFile = new MassiveReadFromFile();
    private final Massive baseArray = new Massive();

    @Test
    public void readMassiveTest() throws ReadException {
        String pathToTxt = "C:\\Users\\egorg\\IdeaProjects\\MyFirstProject\\src\\main\\resources\\read.txt";
        int[] array = massiveReadFromFile.readMassive(pathToTxt);
        baseArray.setMyArray(array);
        Massive diffArray = new Massive(new int[]{0,1,2,344444,4,5,6});

        Assert.assertTrue(baseArray.equals(diffArray));
        logger.info("readMassiveTest() - Success");
    }

}
