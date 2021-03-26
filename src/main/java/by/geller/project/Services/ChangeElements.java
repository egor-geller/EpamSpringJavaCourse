package by.geller.project.Services;


public class ChangeElements{

    public void changeElementInPosition(int[] arr, int position, int changeElementTo){
        for (int i = 0; i < arr.length; i++){
            if (i == position){
                arr[i] = changeElementTo;
            }
        }
    }
}
