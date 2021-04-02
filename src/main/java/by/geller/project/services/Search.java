package by.geller.project.services;

import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public interface Search {
    public int min(Massive array) throws EmptyArrayException;

    public int max(Massive array) throws EmptyArrayException;
}
