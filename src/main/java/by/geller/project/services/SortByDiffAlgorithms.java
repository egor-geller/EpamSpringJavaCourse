package by.geller.project.services;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public interface SortByDiffAlgorithms {
    public void quickSort(Massive array, int low, int high) throws EmptyArrayException;

    public void bubbleSort(Massive array) throws EmptyArrayException;

    public void selectionSort(Massive array) throws EmptyArrayException;
}
