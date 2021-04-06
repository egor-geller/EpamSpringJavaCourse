package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.SortByDiffAlgorithmsService;

public class SortByDiffAlgorithmsServiceImp implements SortByDiffAlgorithmsService {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void quickSortLogic(int[] arr, int startingIndexLow, int endingIndexHigh) throws EmptyArrayException {
        if (arr.length < 2) {
            throw new EmptyArrayException();
        }
        if (startingIndexLow < endingIndexHigh) {
            int partitionIndex = partition(arr, startingIndexLow, endingIndexHigh);

            quickSortLogic(arr, startingIndexLow, partitionIndex - 1);
            quickSortLogic(arr, partitionIndex + 1, endingIndexHigh);
        }
    }

    @Override
    public void quickSort(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        if (blockOfNumbers.getMyArray() == null) {
            throw new EmptyArrayException("Given array is empty");
        }
        int[] array = blockOfNumbers.getMyArray();

        quickSortLogic(array, 0, array.length - 1);

        blockOfNumbers.setMyArray(array);

    }

    @Override
    public void bubbleSort(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        blockOfNumbers.setMyArray(arr);
    }

    @Override
    public void selectionSort(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = temp;
        }
        blockOfNumbers.setMyArray(arr);
    }
}
