package by.geller.project.inteface;

import by.geller.project.Entity.MyModule;
import by.geller.project.exeption.EmptyArrayExeption;

public interface ServicesOfArray {
    void changeElementInPosition(MyModule myModule, int changeElementTo, int position) throws EmptyArrayExeption;

    int sumOfAllNumbers(MyModule myModule) throws EmptyArrayExeption;

    int average(MyModule myModule) throws EmptyArrayExeption;

    int countPositiveNumbers(MyModule myModule) throws EmptyArrayExeption;

    int countNegativeNumbers(MyModule myModule) throws EmptyArrayExeption;

    int min(MyModule myModule) throws EmptyArrayExeption;

    int max(MyModule myModule) throws EmptyArrayExeption;

    void quickSort(MyModule myModule, int low, int high) throws EmptyArrayExeption;

    void bubbleSort(MyModule myModule) throws EmptyArrayExeption;

    void selectionSort(MyModule myModule) throws EmptyArrayExeption;


}
