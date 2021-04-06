package by.geller.project.service.impl;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;
import by.geller.project.service.SearchService;

import java.util.Arrays;

public class SearchStreamServiceImp implements SearchService {
    @Override
    public int min(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int minimumNumber = Arrays.stream(arr).min().getAsInt();
        return minimumNumber;
    }

    @Override
    public int max(BlockOfNumbers blockOfNumbers) throws EmptyArrayException {
        int[] arr = blockOfNumbers.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        int maximumNumber = Arrays.stream(arr).max().getAsInt();
        return maximumNumber;
    }
}
