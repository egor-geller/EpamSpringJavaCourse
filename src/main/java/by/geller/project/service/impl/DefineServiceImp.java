package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.DefineService;

public class DefineServiceImp implements DefineService {
    @Override
    public int sumOfAllNumbers(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int average(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int sum = sumOfAllNumbers(blockOfNumbers);
        int[] arr = blockOfNumbers.getMyArray();
        int avg = sum / arr.length;

        return avg;
    }

    @Override
    public int countPositiveNumbers(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countNegativeNumbers(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }
}
