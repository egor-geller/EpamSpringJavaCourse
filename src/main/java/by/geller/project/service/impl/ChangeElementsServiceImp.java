package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.ChangeElementsService;

public class ChangeElementsServiceImp implements ChangeElementsService {
    @Override
    public void changeElementInPosition(BlockOfNumbers blockOfNumbers, int changeElementTo, int position) throws EmptyArrayException {
        int[] array = blockOfNumbers.getMyArray();

        if (array.length < 2 || position > array.length) {
            throw new EmptyArrayException("Length or position are not valid: array length: "
                    + array.length + " position: " + position);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == position) {
                array[i] = changeElementTo;
                blockOfNumbers.setMyArray(array);
            }
        }
    }
}
