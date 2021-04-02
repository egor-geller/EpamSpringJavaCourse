package by.geller.project.services;


import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public interface ChangeElements{

    public void changeElementInPosition(Massive array, int elementToChange, int position) throws EmptyArrayException;
}
