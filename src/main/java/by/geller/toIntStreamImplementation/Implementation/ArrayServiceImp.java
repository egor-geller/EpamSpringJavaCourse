package by.geller.toIntStreamImplementation.Implementation;

import by.geller.toIntStreamImplementation.Entity.MyModule;
import by.geller.toIntStreamImplementation.exeption.EmptyArrayExeption;
import by.geller.toIntStreamImplementation.inteface.ServicesOfArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayServiceImp implements ServicesOfArray {
    @Override
    public void changeElementInPosition(MyModule myModule, int changeElementTo, int position) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        IntStream.range(0, arr.length).forEach(i -> {
            if (i == position)
            {
                arr[i] = changeElementTo;
            }
        });
    }

    @Override
    public int sumOfAllNumbers(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int sum = Arrays.stream(arr).sum();
        return sum;
    }

    @Override
    public int average(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        int avg = (int) Arrays.stream(arr).average().getAsDouble();

        return avg;
    }

    @Override
    public int countPositiveNumbers(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int count = (int) Arrays.stream(arr).filter(i -> i >= 0).count();

        return count;
    }

    @Override
    public int countNegativeNumbers(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int count = (int) Arrays.stream(arr).filter(i -> i < 0).count();
        return count;
    }

    @Override
    public int min(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int minimumNumber = Arrays.stream(arr).min().getAsInt();
        return minimumNumber;
    }

    @Override
    public int max(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int maximumNumber = Arrays.stream(arr).max().getAsInt();
        return maximumNumber;
    }

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

    //Change to IntStream
    @Override
    public void quickSort(MyModule myModule, int startingIndexLow, int endingIndexHigh) throws EmptyArrayExeption {
        if (startingIndexLow < endingIndexHigh) {
            int[] arr = myModule.getMyArray();

            if (arr.length < 2) {
                throw new EmptyArrayExeption();
            }

            int partitionIndex = partition(arr, startingIndexLow, endingIndexHigh);

            quickSort(myModule, startingIndexLow, partitionIndex - 1);
            quickSort(myModule, partitionIndex + 1, endingIndexHigh);
        }
    }

    @Override
    public void bubbleSort(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int n = arr.length;
        IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        });
    }

    @Override
    public void selectionSort(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int n = arr.length;

        IntStream.range(0, n - 1).flatMap(i -> IntStream.range(i, n - 1)).forEach(j -> {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        });

    }
}
