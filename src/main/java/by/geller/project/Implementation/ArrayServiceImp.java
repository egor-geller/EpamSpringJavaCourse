package by.geller.project.Implementation;

import by.geller.project.Entity.MyModule;
import by.geller.project.exeption.EmptyArrayExeption;
import by.geller.project.inteface.ServicesOfArray;

public class ArrayServiceImp implements ServicesOfArray {
    @Override
    public void changeElementInPosition(MyModule myModule, int changeElementTo, int position) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == position) {
                arr[i] = changeElementTo;
            }
        }
    }

    @Override
    public int sumOfAllNumbers(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int average(MyModule myModule) throws EmptyArrayExeption {
        int sum = sumOfAllNumbers(myModule);
        int[] arr = myModule.getMyArray();
        int avg = sum / arr.length;

        return avg;
    }

    @Override
    public int countPositiveNumbers(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
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
    public int countNegativeNumbers(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int min(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int minimumNumber = arr[0];
        for (int i : arr) {
            if (minimumNumber > i) {
                minimumNumber = i;
            }
        }
        return minimumNumber;
    }

    @Override
    public int max(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
        }

        int maximumNumber = arr[0];
        for (int i : arr) {
            if (maximumNumber < i) {
                maximumNumber = i;
            }
        }
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
    public void quickSort(MyModule myModule, int startingIndexLow, int endingIndexHigh) throws EmptyArrayExeption {
        if (startingIndexLow < endingIndexHigh){
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
    public void selectionSort(MyModule myModule) throws EmptyArrayExeption {
        int[] arr = myModule.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayExeption();
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
