package by.geller.project.implementation;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.services.SortByDiffAlgorithms;

public class SortByDiffAlgorithmsImp implements SortByDiffAlgorithms {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    @Override
    public void quickSort(Massive massive, int startingIndexLow, int endingIndexHigh) throws EmptyArrayException {
        if (startingIndexLow < endingIndexHigh){
            int[] arr = massive.getMyArray();

            if (arr.length < 2) {
                throw new EmptyArrayException();
            }

            int partitionIndex = partition(arr, startingIndexLow, endingIndexHigh);

            quickSort(massive, startingIndexLow, partitionIndex - 1);
            quickSort(massive, partitionIndex + 1, endingIndexHigh);
        }
    }

    @Override
    public void bubbleSort(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j]  = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void selectionSort(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
