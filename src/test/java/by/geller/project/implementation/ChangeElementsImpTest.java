package by.geller.project.implementation;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.services.ChangeElements;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeElementsImpTest {
    Logger logger = LogManager.getLogger();

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
}
