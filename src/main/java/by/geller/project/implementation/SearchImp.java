package by.geller.project.implementation;

import by.geller.project.services.Search;
import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public class SearchImp implements Search {
    @Override
    public int min(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
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
    public int max(Massive massive) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int maximumNumber = arr[0];
        for (int i : arr) {
            if (maximumNumber < i) {
                maximumNumber = i;
            }
        }
        return maximumNumber;
    }
}
