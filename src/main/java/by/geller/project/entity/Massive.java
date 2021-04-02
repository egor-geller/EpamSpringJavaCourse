package by.geller.project.entity;

import by.geller.project.exception.ReadException;

import java.util.Arrays;

public class Massive {
    private int[] firstArray;
    private Integer[] integersMethodOfArrays;

    public Massive() {

    }

    public Massive(int[] array) {
        this.firstArray = array;
    }

    public Massive(Integer[] integers) {
        this.integersMethodOfArrays = integers;
    }

    public int[] getMyArray() {
        return firstArray.clone();
    }

    public Integer[] getIntegersMethodOfArrays() {
        return integersMethodOfArrays.clone();
    }

    public void setMyArray(int[] myArray) {
        this.firstArray = myArray;
    }

    public void setElementInArray(int position, int elementSetTo) throws ReadException {
        if (position < 0 || position > firstArray.length){
            throw new ReadException("Index out of bound");
        }
        firstArray[position] = elementSetTo;
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

    public boolean equals(Massive diffModule) {
        return Arrays.equals(this.getMyArray(), diffModule.getMyArray());
    }
}
