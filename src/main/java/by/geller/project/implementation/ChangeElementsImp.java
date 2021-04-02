package by.geller.project.implementation;

import by.geller.project.services.ChangeElements;
import by.geller.project.entity.Massive;
import by.geller.project.exception.EmptyArrayException;

public class ChangeElementsImp implements ChangeElements {
    @Override
    public void changeElementInPosition(Massive massive, int changeElementTo, int position) throws EmptyArrayException {
        int[] arr = massive.getMyArray();

        if (arr.length < 2) {
            throw new EmptyArrayException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == position) {
                arr[i] = changeElementTo;
            }
        }
    }
}
