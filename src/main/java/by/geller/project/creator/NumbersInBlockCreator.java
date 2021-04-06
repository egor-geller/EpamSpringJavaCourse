package by.geller.project.creator;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;

public class NumbersInBlockCreator {
    public BlockOfNumbers createBlockWithNumbers(int... values) throws EmptyArrayException {
        BlockOfNumbers blockOfNumbers = new BlockOfNumbers(values.length);

        for (int i = 0; i < values.length; i++) {
            blockOfNumbers.setElementInArray(i, values[i]);
        }
        return blockOfNumbers;
    }
}
