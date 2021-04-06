package by.geller.project.service;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;

public interface DefineService {
    int sumOfAllNumbers(BlockOfNumbers array) throws EmptyArrayException;

    int average(BlockOfNumbers array) throws EmptyArrayException;

    int countPositiveNumbers(BlockOfNumbers array) throws EmptyArrayException;

    int countNegativeNumbers(BlockOfNumbers array) throws EmptyArrayException;
}
