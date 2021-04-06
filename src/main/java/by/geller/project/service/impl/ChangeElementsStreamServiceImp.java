package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.ChangeElementsService;

import java.util.stream.IntStream;

public class ChangeElementsStreamServiceImp implements ChangeElementsService {

    @Override
    public void changeElementInPosition(BlockOfNumbers blockOfNumbers, int elementToChange, int position) throws EmptyArrayException {
        int[] array = blockOfNumbers.getMyArray();

        if (array.length < 2 || position > array.length) {
            throw new EmptyArrayException("Length or position are not valid: array length: "
                    + array.length + " position: " + position);
        }

        IntStream.range(0, array.length).forEach(i -> {
            if (i == position) {
                array[i] = elementToChange;
            }
        });
        blockOfNumbers.setMyArray(array);
    }
}
