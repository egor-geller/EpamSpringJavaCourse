package by.geller.project.Entity;

import java.util.Arrays;

public class MyModule {
    private int[] firstArray;
    private Integer[] integersMethodOfArrays;

    public MyModule() {

    }

    public MyModule(int[] array) {
        this.firstArray = array;
    }

    public MyModule(Integer[] integers) {
        this.integersMethodOfArrays = integers;
    }

    public int[] getMyArray() {
        return firstArray;
    }

    public Integer[] getIntegersMethodOfArrays() {
        return integersMethodOfArrays;
    }

    public void setMyArray(int[] myArray) {
        this.firstArray = myArray;
    }

    public void setIntegersMethodOfArrays(Integer[] integersMethodOfArrays) {
        this.integersMethodOfArrays = integersMethodOfArrays;
    }

    @Override
    public String toString() {
        return "Module{" +
                "myArray=" + Arrays.toString(firstArray) +
                '}';
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

    public boolean equals(MyModule diffModule) {
        return Arrays.equals(this.getMyArray(), diffModule.getMyArray());
    }
}
