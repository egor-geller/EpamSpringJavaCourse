package by.geller.project.implementation;

import by.geller.project.services.Define;
import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public class DefineImp implements Define {
    @Override
    public int sumOfAllNumbers(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

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
    public int average(Massive massive) throws EmptyArrayException {
        int sum = sumOfAllNumbers(massive);
        int[] arr = massive.getMyArray();
        int avg = sum / arr.length;

        return avg;
    }

    @Override
    public int countPositiveNumbers(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

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
    public int countNegativeNumbers(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

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
