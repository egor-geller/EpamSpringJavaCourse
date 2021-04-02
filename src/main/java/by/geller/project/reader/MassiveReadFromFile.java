package by.geller.project.reader;

import by.geller.project.entity.Massive;
import by.geller.project.exception.ReadException;
import by.geller.project.parser.MassiveParse;
import by.geller.project.validator.MassiveValidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MassiveReadFromFile {
    public int[] readMassive(String path) throws ReadException{
        BufferedReader reader;
        MassiveValidator massiveValidator = new MassiveValidator();
        Massive newNumericInt = new Massive();

        if (path.isEmpty()){
            throw new ReadException("Path to file is empty");
        }

        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                if (massiveValidator.isValidMassive(line)) {
                    MassiveParse massiveParse = new MassiveParse();
                    newNumericInt = massiveParse.parseFromStringToMassive(line);
                    break;
                }
                line = reader.readLine();
            }
            reader.close();

            int lengthOfNewMassive = newNumericInt.getMyArray().length;

            if (lengthOfNewMassive <= 0) {
                throw new ReadException("Array is empty: " + lengthOfNewMassive);
            }

        } catch (FileNotFoundException e) {
            throw new ReadException("File is not found: " + path);
        } catch (IOException e) {
            throw new ReadException("File is not readable");
        }
        return newNumericInt.getMyArray();
    }
}
