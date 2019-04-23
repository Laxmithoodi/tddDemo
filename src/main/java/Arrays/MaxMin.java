package Arrays;

public class MaxMin {
    int max;
    int min;

    public void findMaxMin(int[] arr) {
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for(int n : arr){
            if(n > max)
                max = n;
            if(n < min)
                min = n;
        }
    }
}
