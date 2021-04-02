package by.geller.project.services;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public interface Define {
    public int sumOfAllNumbers(Massive array) throws EmptyArrayException;

    public int average(Massive array) throws EmptyArrayException;

    public int countPositiveNumbers(Massive array) throws EmptyArrayException;

    public int countNegativeNumbers(Massive array) throws EmptyArrayException;
}
