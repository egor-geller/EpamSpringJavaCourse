import Entity.MyModule;
import Services.Define;
import Services.Search;
import org.testng.annotations.Test;
import Services.ChangeElements;

@Test
public class FirstTest {
    MyModule myModule = new MyModule(0, null);
    ChangeElements changeElements = new ChangeElements();
    Define define = new Define();
    Search search = new Search();

    @Test
    public void data(){
        int[] arr = {1,45,77,4,2,-1,5};
        myModule.setN(arr.length);
        myModule.setMyArray(arr);
        System.out.println(myModule);

        changeElements.changeElementInPosition(arr, 2, 10);


        System.out.println("Average number is: " + define.average(arr));
        System.out.println("There are " + define.countPositiveNumbers(arr) + " Positive numbers");
        System.out.println("There are " + define.countNegativeNumbers(arr) + " Negative numbers");

        System.out.println("Max number in array is " + search.max(arr));
        System.out.println("Min number in array is " + search.min(arr));

    }
}
