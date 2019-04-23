package Arrays;

public class OddEven {

    public int odds;
    public int evens;

    public OddEven() {
        odds = 0;
        evens = 0;
    }

    public void countOddsAndEvens(int[] arr){
        for(int n : arr){
            if(n%2 == 0)
                evens++;
            else
                odds++;
        }
    }
}
