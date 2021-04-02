package by.geller.project.parser;

import by.geller.project.entity.Massive;
import by.geller.project.exception.ReadException;

public class MassiveParse {
    public Massive parseFromStringToMassive(String line) throws ReadException {
        String[] separatedMassive = line.split("\\D");

        int lengthOfString = separatedMassive.length;

        Massive customMassive = new Massive();

        customMassive.setMyArray(new int[lengthOfString]);

        for (int i = 0; i < lengthOfString; i++) {
            customMassive.setElementInArray(i, Integer.parseInt(separatedMassive[i]));
        }
        return customMassive;
    }
}
