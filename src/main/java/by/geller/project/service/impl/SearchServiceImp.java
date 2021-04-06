package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.SearchService;

public class SearchServiceImp implements SearchService {
    @Override
    public int min(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

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
    public int max(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

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
