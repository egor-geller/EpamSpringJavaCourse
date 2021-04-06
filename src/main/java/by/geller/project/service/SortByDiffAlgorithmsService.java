package by.geller.project.service;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;

public interface SortByDiffAlgorithmsService {
    void quickSort(BlockOfNumbers array) throws EmptyArrayException;

    void bubbleSort(BlockOfNumbers array) throws EmptyArrayException;

    void selectionSort(BlockOfNumbers array) throws EmptyArrayException;
}
