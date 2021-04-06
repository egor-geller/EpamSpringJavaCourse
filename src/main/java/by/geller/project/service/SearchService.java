package by.geller.project.service;

import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;

public interface SearchService {
    int min(BlockOfNumbers array) throws EmptyArrayException;

    int max(BlockOfNumbers array) throws EmptyArrayException;
}
