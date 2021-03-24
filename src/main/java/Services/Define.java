package Services;

public class Define {
    public int sumOfAllNumbers(int[] arr){
        int sum = 0;
        for (int i :
                arr) {
            sum += i;
        }
        return sum;
    }

    public int average(int[] arr){
        int sum = sumOfAllNumbers(arr);
        return sum / arr.length;
    }

    public int countPositiveNumbers(int[] arr){
        int count = 0;
        for (int i :
                arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeNumbers(int[] arr){
        int count = 0;
        for (int i :
                arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }
}
