
public class LinearSearch1 {

    /**
     * Given an array arr[] of n elements, write a function to search a given element x in arr[].
     */


    public static int search(int arr[], int x) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x)
                return i;

        }
        return -1;
    }


    /**
     * Problem: Write a Java program to arrange the elements of an given array of integers where all negative integers appear before all the positive integers.
     * <p>
     * Input: { 2, 5, -55, 8, -72, -1, 53 }
     * <p>
     * Output: { -55, -72, -1, 2, 5, 8, 53 }
     */


      public static int[] sortArray(int[] nonsortedarray) {
          int[] sortedArray = new int[nonsortedarray.length];
          int temp;
          for (int j = 0; j < nonsortedarray.length - 1; j++) {

              for (int i = 0; i < nonsortedarray.length - 1; i++) {
                  if (nonsortedarray[i] > nonsortedarray[i + 1]) {
                      temp = nonsortedarray[i];
                      nonsortedarray[i] = nonsortedarray[i + 1];
                      nonsortedarray[i + 1] = temp;
                      sortedArray = nonsortedarray;
                  }
              }
          }
          return sortedArray;
      }


    public static int[] rearrange(int arr[]) {
        int n = arr.length;

        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;


            }}

            return arr;
    }
}


//        // Create an empty array to store result
//        int temp[] = new int[arr.length];
//
//        // Traversal array and store +ve element in
//        // temp array
//        int j = 0; // index of temp
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] >= 0)
//                temp[j++] = arr[i];
//        }
//        // If array contains all positive or all
//        // negative.
//        //if (j == arr.length || j == 0)
//        //    return;
//
//        // Store -ve element in temp array
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] < 0)
//                temp[j++] = arr[i];
//        }
//
//        // Copy contents of temp[] to arr[]
//        for (int i = 0; i < arr.length - 1; i++)
//            arr[i] = temp[i];



//
//        public static int[]  partitionArray(int[] a, int start, int end){
//        int[] sortedArray1 = new int[a.length];
//        int pIndex = start;
//
//        for (int i = start; i <= end; i++) {
//           if(a[i]<0){
//               swap(a, i, pIndex);
//               pIndex++;
//           }
//        }
//        return sortedArray1;
//    }
//    public static void swap(int[] a, int i, int j) {
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//
//      // return Arrays.toString(a);
//
//    }











//
// public static int[] arrayArrange(int arr[]){
//     int arrSorted[] = new int[arr.length];
//     int count;
//     for(int i=0; i<arr.length-1; i++)
//     {
//         int temp = arr[i];
//         for(int j=0; j<arr.length-1; j++)
//         {
//             if(temp > arr[j]) {
//                 //temp = arr[j];
//                 count = 1;
//                 for(int k=0; k<arrSorted.length-1; k++)
//                 {
//                     if((arrSorted[k] != arr[j]))// && (count == arrSorted.length - 1))
//                         temp = arr[j];
//                     count++;
//                 }
//
//             }
//             /*if(i>0) {
//                 if (temp > arr[j] && arrSorted[i-1] != arr[j])
//                     temp = arr[j];
//             }
//             else
//             {
//                 if(temp > arr[j])
//                     temp = arr[j];
//             }*/
//
//}
//         arrSorted[i] = temp;
//                 }
//                 return  arrSorted;
//                 }
//
//}
