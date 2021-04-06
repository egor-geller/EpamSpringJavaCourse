package by.geller.project.reader;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.parser.SetOfNumbersParse;
import by.geller.project.validator.SequenceOfNumbersValidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSetOfNumbersFromFile {
    public int[] readMassive(String path) throws EmptyArrayException {
        SequenceOfNumbersValidator sequenceOfNumbersValidator = new SequenceOfNumbersValidator();
        BlockOfNumbers newNumericInt = new BlockOfNumbers();

        if (path.isEmpty()) {
            throw new EmptyArrayException("Path to file is empty");
        }

        if (!path.matches("(.*\\\\\\w+.txt)$")) {
            throw new EmptyArrayException("Extension is not valid");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                if (sequenceOfNumbersValidator.isValidMassive(line)) {
                    SetOfNumbersParse setOfNumbersParse = new SetOfNumbersParse();
                    newNumericInt = setOfNumbersParse.parseFromStringToArray(line);
                    break;
                }
                line = reader.readLine();
            }

            int lengthOfNewArray = newNumericInt.getMyArray().length;

            if (lengthOfNewArray <= 0) {
                throw new EmptyArrayException("Array is empty: " + lengthOfNewArray);
            }

        } catch (FileNotFoundException e) {
            throw new EmptyArrayException("File is not found: " + path);
        } catch (IOException e) {
            throw new EmptyArrayException("File has not read anything");
        }
        return newNumericInt.getMyArray();
    }
}
