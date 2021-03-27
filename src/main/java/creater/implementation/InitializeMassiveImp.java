package creater.implementation;

import creater.exeptions.IOExceptionInitArray;
import creater.someInterfaces.initializeMassiveInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class InitializeMassiveImp implements initializeMassiveInterface {
    @Override
    public Integer[] readFromFileToMassive(String path) throws IOExceptionInitArray {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                if (line.matches(".+\\d+.*\\s*([a-z]*)$")) {
                    String[] newStringArray = line.split("\\D");
                    int lengthOfStringArray = newStringArray.length;

                    for (String s : newStringArray) {
                        if (s.isEmpty()) {
                            lengthOfStringArray--;
                        }
                    }

                    Integer[] newNumericInt = new Integer[lengthOfStringArray];
                    int count = 0;

                    for (String s : newStringArray) {
                        if (!s.isEmpty()) {
                            newNumericInt[count] = Integer.parseInt(s);
                            count++;
                        }

                    }
                    return newNumericInt;
                }
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            throw new IOExceptionInitArray();
        }

        return null;
    }
}
