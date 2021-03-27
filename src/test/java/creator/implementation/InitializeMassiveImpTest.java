package creator.implementation;

import by.geller.project.Entity.MyModule;
import creater.exeptions.IOExceptionInitArray;
import creater.implementation.InitializeMassiveImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InitializeMassiveImpTest {
    Logger logger = LogManager.getLogger();
    private final InitializeMassiveImp initializeMassiveImp = new InitializeMassiveImp();
    private final MyModule baseArray = new MyModule();

    @Test
    public void initFromTxt() throws IOExceptionInitArray {
        String pathToTxt = "C:\\Users\\egorg\\IdeaProjects\\MyFirstProject\\src\\main\\resources\\read.txt";
        baseArray.setIntegersMethodOfArrays(initializeMassiveImp.readFromFileToMassive(pathToTxt));
        MyModule diffArray = new MyModule(new Integer[]{0,1,2,344444,4,5,6});

        Assert.assertTrue(baseArray.equals(diffArray));
        logger.info("initFromTxt() - Success");
    }

}
