package by.geller.project.implTest;

import by.geller.project.creator.NumbersInBlockCreator;
import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.ChangeElementsService;
import by.geller.project.service.impl.ChangeElementsServiceImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeElementsServiceImpTest {
    Logger logger = LogManager.getLogger();

    @Test
    public void changeElementInPositionTest() throws EmptyArrayException {
        ChangeElementsService changeElementsService = new ChangeElementsServiceImp();
        NumbersInBlockCreator numbersInBlockCreator = new NumbersInBlockCreator();
        BlockOfNumbers copyOfBaseModule = numbersInBlockCreator.createBlockWithNumbers(2, 8, -4, 3, 5, 4);
        BlockOfNumbers newArrayOfChangedElement = new BlockOfNumbers(new int[]{2, 8, -4, 3, 5, 10});
        int elementToChange = 10;
        int position = 5;
        changeElementsService.changeElementInPosition(copyOfBaseModule, elementToChange, position);
        Assert.assertTrue(copyOfBaseModule.equals(newArrayOfChangedElement));
        logger.info("changeElementInPositionTest() - Success");
    }
}
