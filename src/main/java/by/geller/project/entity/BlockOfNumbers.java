package by.geller.project.entity;

import by.geller.project.exception.EmptyArrayException;

import java.util.Arrays;

public class BlockOfNumbers {
    private int[] firstArray;

    public BlockOfNumbers() {

    }

    public BlockOfNumbers(int[] array) {
        this.firstArray = array;
    }

    public BlockOfNumbers(int lengthOfNumbersInBlock) throws EmptyArrayException {
        if (lengthOfNumbersInBlock < 0) {
            throw new EmptyArrayException("Invalid array length: " + lengthOfNumbersInBlock);
        }
        firstArray = new int[lengthOfNumbersInBlock];
    }

    public int[] getMyArray() {
        return firstArray.clone();
    }

    public void setMyArray(int[] myArray) {
        this.firstArray = myArray;
    }

    public void setElementInArray(int position, int elementSetTo) throws EmptyArrayException {
        if (position < 0 || position > firstArray.length) {
            throw new EmptyArrayException("Index out of bound");
        }
        firstArray[position] = elementSetTo;
    }

    @Override
    public String toString() {
        return "Module{" +
                "myArray=" + Arrays.toString(firstArray) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockOfNumbers diff = (BlockOfNumbers) o;
        return this.firstArray == diff.firstArray;
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }
}
