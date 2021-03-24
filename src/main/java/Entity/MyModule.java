package Entity;

import java.util.Arrays;

public class MyModule {
    private int n;
    private int[] myArray;

    public MyModule(int i, int[] arr){
        this.n = i;
        this.myArray = arr;
    }

    public int getN() {
        return n;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    @Override
    public String toString() {
        return "Module{" +
                "n=" + n +
                ", myArray=" + Arrays.toString(myArray) +
                '}';
    }
}
