public class Arrays_Pracday2 {


    public static int indexEle(int[] arr , int index){
        int len = arr.length;
        int i =0;


    if(arr == null){
        return -1;
    }
    while (i<len){
        if(arr[i] == index) {
            return i;
        } else i = i=1;
        }

        return -1;
    }


    public static void main(String[] args) {



        // average value of array elements

        int[] arr = new int[] { 10, 20, 2, 4, 2};

        int sum=0;
        for( int i=0; i<arr.length; i++)
            sum+= arr[i];
        double avg = sum/arr.length;
        System.out.println(avg);


        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(indexEle(my_array, 56));



    }





}