package by.geller.project.Services;

import java.util.Arrays;

public class Search {
    public int min(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
