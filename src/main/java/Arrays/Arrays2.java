package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class Arrays2 {


        public int sumOfArray(int[] arr) {
            int sum = 0;
            for(int n : arr)
                sum += n;
            return sum;
        }


        public double sumOfDoublesArray(double[] arr) {
            double sum = 0;
            for(double n : arr)
                sum += n;
            sum = Double.valueOf(String.format("%2f", sum));
            return sum;
        }

        public int averageOfArray(int[] arr) {
            return sumOfArray(arr)/arr.length;
        }

        public double doubleAverageOfArray(double[] arr) {
            return sumOfDoublesArray(arr)/arr.length;
        }

        public boolean containsValue(int[] arr, int num) {
            for(int n : arr){
                if(n == num)
                    return true;
            }
            return false;
        }

        public int[] reverseArray(int[] arr) {
            int[] revArr = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                revArr[i] = arr[arr.length-i-1];
            }
            return revArr;
        }

        public OddEven getOddEvensOfArray(int[] arr) {
            OddEven oddEven = new OddEven();
            oddEven.countOddsAndEvens(arr);
            return oddEven;
        }


        public int FindIndexOf(int[] arr, int n) {
            for(int i = 0; i<arr.length; i++) {
                if (arr[i] == n)
                    return i;
            }
            return -1;
        }

        public int[] copyArrayByIterator(int[] arr) {
            Integer[] newArray = new Integer[arr.length];
            List<Integer> list = new ArrayList<Integer>();//adding array to the list
            for(int n : arr)
                list.add(n);
            Iterator iterator = list.iterator();

            int index = 0;
            while(iterator.hasNext()){
                newArray[index] = (Integer)iterator.next();
                index++;
            }
            for(int i = 0;i<arr.length;i++){
                arr[i] = newArray[i];
            }
            return arr;
        }


        public int[] copyArrayByLoop(int[] arr) {
            int[] newArr = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                newArr[i] = arr[i];
            }
            return newArr;
        }

        public int[] removeElementFromArray(int[] arr, int num) {
            int[] newArr = new int[arr.length];
            int index = 0;
            for(int i = 0;i<arr.length; i++){
                if(arr[i] != num)
                    newArr[index] = arr[i];
                else
                    continue;
                index++;
            }
            return newArr;
        }

        public int[] insertIntoArrayAt(int[] arr, int number, int i) {
            int[] newArr = new int[arr.length + 1];
            int index = 0;
            for(int j =0; j< arr.length; j++){
                if(j != i)
                    newArr[index] = arr[j];
                else {
                    newArr[index] = number;
                    newArr[index + 1] = arr[j];
                }
                index++;
            }
            return newArr;
        }

        public MaxMin findMaxMin(int[] arr) {
            MaxMin maxMin = new MaxMin();
            maxMin.findMaxMin(arr);
            return maxMin;
        }

        public int[] removeDupesFromArray(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int n : arr) {
                if(!list.contains(n))
                    list.add(n);
            }
            arr = new int[list.size()];
            int index = 0;
            for(int n : list) {
                arr[index] = list.get(index);
                index++;
            }
            //return newArr;
            return arr;
        }

        public int find2ndLargestValueFromArray(int[] arr) {
            int max = Integer.MIN_VALUE;
            int prev = max;
            for(int n : arr){
                if(n > max){
                    prev = max;
                    max = n;
                }
                if(n > prev && n!= max)
                    prev = n;
            }

            return prev;
        }

        public List<Integer> makeMeAnArrayListFromArray(int[] arr) {
            return null;
        }

        public int[] makemeAnArrayFromArrayList(List<Integer> list) {

            int[] arr = new int[list.size()];
            for(int i = 0; i<list.size();i++){
                arr[i] = list.get(i);
            }
            return arr;
        }

        public boolean check2ArraysForEqual(int[] arr, int[] arr2) {

            if(arr.length != arr2.length)
                return false;

            for(int i = 0; i<arr.length;i++){
                if(arr[i] != arr2[i])
                    return false;
            }
            return true;
        }

        public int averageArrayWithoutMaxMin(int[] arr) {
            int sum = 0;
            int count = 0;
            MaxMin maxMin = findMaxMin(arr);
            for(int n: arr){
                if(n!= maxMin.max && n != maxMin.min) {
                    sum += n;
                    count += 1;
                }
            }
            return sum/count;
        }

        public boolean arrayHas65and77(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int n : arr)
                list.add(n);

            if(list.contains(65) && list.contains(77))
                return true;
            else return false;
        }


        public boolean theTotalofTensIs30(int[] arr) {
            int sum = 0;
            for(int n : arr){
                if(n == 10)
                    sum += n;
            }

            if(sum == 30)
                return true;
            else return false;
        }

        public int[] smallestAndSecondSmallest(int[] arr) {
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = smallest;
            for(int n : arr){
                if(n < smallest) {
                    secondSmallest = smallest;
                    smallest = n;
                }
                else if(n < secondSmallest)
                    secondSmallest = smallest;
            }
            return new int[]{smallest, secondSmallest};
        }

        public int[] makeMeACopyPlease(int[] arr) {
            int[] cpyArr = Arrays.copyOf(arr,arr.length);
            int[] revArr = new int[cpyArr.length];
            int index = 0;
            for(int i = arr.length - 1; i >= 0; i--){
                revArr[index] = arr[i];
                index++;
            }
            return revArr;
        }

        public int[] removeLastItemAndCopy(int[] arr) {
            int[] newArr = new int[arr.length-1];
            for(int i = 0;i<arr.length-1;i++){
                newArr[i] = arr[i];
            }
            return newArr;
        }

        public int[] removeFirstItemAndCopy(int[] arr) {
            int[] newArr = new int[arr.length-1];

            for(int i = 1; i<arr.length; i++){
                newArr[i-1] = arr[i];
            }
            return newArr;
        }

        public int[] insertAtStartAndCopy(int[] arr, int n) {
            int[] newArr = new int[arr.length+1];
            newArr[0] = n;
            for(int i = 0; i<arr.length; i++){
                newArr[i+1] = arr[i];
            }
            return newArr;
        }

        public int[] insertAtEndAndCopy(int[] arr, int n) {
            int[] newArr = new int[arr.length+1];
            newArr[newArr.length-1] = n;
            for(int i = 0; i<arr.length; i++){
                newArr[i] = arr[i];
            }
            return newArr;
        }

        public int[] sortArrayIntoEvensThenOdds(int[] arr) {
            Arrays.sort(arr);

            int[] sortedArr = new int[arr.length];
            List<Integer> evens = new ArrayList<>();
            List<Integer> odds = new ArrayList<>();

            for(int i = 0;i<arr.length;i++){
                if(arr[i] %2 == 0)
                    evens.add(arr[i]);
                else
                    odds.add(arr[i]);
            }

            evens.addAll(odds);
            for(int i = 0;i<arr.length;i++){
                sortedArr[i] = evens.get(i);
            }

            return sortedArr;
        }


    }


