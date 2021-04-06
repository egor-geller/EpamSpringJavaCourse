package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.DefineService;

import java.util.Arrays;

public class DefineStreamServiceImp implements DefineService {
    @Override
    public int sumOfAllNumbers(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int sum = Arrays.stream(arr).sum();
        return sum;
    }

    @Override
    public int average(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        int avg = (int) Arrays.stream(arr).average().getAsDouble();

        return avg;
    }

    @Override
    public int countPositiveNumbers(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int count = (int) Arrays.stream(arr).filter(i -> i >= 0).count();

        return count;
    }

    @Override
    public int countNegativeNumbers(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int count = (int) Arrays.stream(arr).filter(i -> i < 0).count();
        return count;
    }
}
