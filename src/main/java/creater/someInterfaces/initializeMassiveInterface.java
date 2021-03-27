package creater.someInterfaces;

import creater.exeptions.IOExceptionInitArray;

import java.io.IOException;

public interface initializeMassiveInterface {
    Integer[] readFromFileToMassive(String path) throws IOException;
}
