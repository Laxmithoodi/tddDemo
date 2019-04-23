

public class Arrays {

    /* Start with 2 int arrays, a and b, each length 2. Consider the sum of the
     * values in each array. Return the array which has the largest sum. In event
     * of a tie, return a.
     */

    public int[] biggerTwo(int[] a, int[] b) {




        return null;
    }


//        //if (a[0]+ a[1]<b[0] +b[1]){
//        //        return b;
//        //}
//
//        //return a;
//
//        String suma;
//        String sumb;
//
//        //a = new int[];
//        // b = new int[];
//        //System.out.println("Enter the first matrix");
//        for (int j = 0; j < 2; j++) {
//            suma = suma + a[j];
//            sumb = sumb + a[j];
//
//
//        }
//        if (suma < suma) {
//            return b;
//        }
//        return a;
//
//    }

    /* Given 2 arrays of ints, a and b, return true if they have the same first
     * element or they have the same last element. Both arrays will be length 1 or
     * more.
     */

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }


/**
    /* Given an int array, return true if the array contains 2 twice, or 3 twice.
     * The array will be length 0, 1, or 2.
     */
//
//
//    public static void main(String s[]) {
//        int arr[] = {2, 3};
//        int add[] = new int[arr.length + 1];
//        for (int i = 0; i < add.length; i++) {
//            if (i == add.length - 1) {
//                add[i] = 4;
//            } else {
//                add[i] = arr[i];
//            }
//            System.out.println(add[i]);
//        }
//    }
}