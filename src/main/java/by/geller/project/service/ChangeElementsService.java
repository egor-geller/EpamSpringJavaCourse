package by.geller.project.service;


import by.geller.project.entity.BlockOfNumbers;
import by.geller.project.exception.EmptyArrayException;

public interface ChangeElementsService {

    void changeElementInPosition(BlockOfNumbers array, int elementToChange, int position) throws EmptyArrayException;
}
