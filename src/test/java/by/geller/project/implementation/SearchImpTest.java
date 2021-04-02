package by.geller.project.implementation;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.services.Search;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchImpTest {
    private final Search search = new SearchImp();

    Logger logger = LogManager.getLogger();

    private final Massive baseArray = new Massive(new int[]{2, 8, -4, 3, 5, 4});

    @Test
    public void minimumNumberInArrayTest() throws EmptyArrayException {
        int minNumber = search.min(baseArray);
        Assert.assertEquals(minNumber, -4);
        logger.info("minimumNumberInArrayTest() - Success");
    }

    @Test
    public void maximumNumberInArrayTest() throws EmptyArrayException {
        int maxNumber = search.max(baseArray);
        System.out.println(baseArray);
        Assert.assertEquals(maxNumber, 8);
        logger.info("maximumNumberInArrayTest() - Success");
    }
}
