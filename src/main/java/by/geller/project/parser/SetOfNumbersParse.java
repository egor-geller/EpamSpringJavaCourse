package by.geller.project.parser;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;

public class SetOfNumbersParse {
    public BlockOfNumbers parseFromStringToArray(String line) throws EmptyArrayException {
        String[] separatedArray = line.split("\\D");

        int lengthOfString = separatedArray.length;

        BlockOfNumbers customBlockOfNumbers = new BlockOfNumbers();

        customBlockOfNumbers.setMyArray(new int[lengthOfString]);

        for (int i = 0; i < lengthOfString; i++) {
            customBlockOfNumbers.setElementInArray(i, Integer.parseInt(separatedArray[i]));
        }
        return customBlockOfNumbers;
    }
}
