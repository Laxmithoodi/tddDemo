
import java.lang.reflect.Array;
 import java.util.ArrayList;
import java.util.Arrays;
public class ArrayUtili <S> {

//
//    S[] inputArray;
//    S[] mergerArray;
//
//    public ArrayUtility(S[] inputArray) {
//        this.inputArray = inputArray;
//
//        //S[] temp = (S[]) new Object[length];(creating a new generic array)
//    }
//
//    public int getNumberOfOccurrences(S valueToEvaluate) {
//        int countOccurence = 0;
//        for (S element : inputArray) {
//            if (element.equals(valueToEvaluate)) {
//                countOccurence++;
//            }
//        }
//
//        return countOccurence;
//    }
//
//
//
//    public S[] removeValue(S valueToRemove)
//    {
//        Integer removed = getNumberOfOccurrences(valueToRemove);
//        S[] array = (S[])Array.newInstance(inputArray.getClass().getComponentType(), inputArray.length-removed);
//        int count = 0;
//        for (int i = 0; i < inputArray.length; i++) {
//            if (!inputArray[i].equals(valueToRemove)) {
//                array[count] = inputArray[i];
//                count++;
//            }
//        }
//        return array;
//
//    }
//
//    public Integer countDuplicatesInMerge(S[] newArray, S valueToEvaluate ) {
//
//        Integer count=0;
//        mergerArray = (S[]) new Object[inputArray.length+newArray.length];
//        System.arraycopy(inputArray, 0,mergerArray, 0,inputArray.length);
//        System.arraycopy(newArray,0,mergerArray, inputArray.length,newArray.length);
//        for (S element : mergerArray) {
//            if(element.equals(valueToEvaluate))
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public S getMostCommonFromMerge(S[] newArray)
//    {
//        mergerArray = (S[]) new Object[inputArray.length+newArray.length];
//        System.arraycopy(inputArray, 0,mergerArray, 0,inputArray.length);
//        System.arraycopy(newArray,0,mergerArray, inputArray.length,newArray.length);
//        S mostcommonElement=mergerArray[0];
//        int mostcommonElementOccurences=0;
//        for(S element :mergerArray)
//        {
//            if(getNumberOfOccurrences(element)>mostcommonElementOccurences)
//            {
//                mostcommonElement=element;
//                mostcommonElementOccurences=getNumberOfOccurrences(element);
//            }
//        }
//        return mostcommonElement;
//    }
//}
//
//
//import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.LinkedList;
//        import java.util.List;
//
///**
// * Created by leon on 3/6/18.
// */
//public class ArrayUtility<T> {
//
//
//
//
//    private T[] inputArray;
//
//
//    public ArrayUtility(T[] inputArray) {
//        this.inputArray = inputArray;
//    }
//
//
//    ArrayList<T> newArray = new ArrayList<>();
//
//
//    public int countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
//
//        newArray.addAll(Arrays.asList(arrayToMerge));
//        newArray.addAll(Arrays.asList(this.inputArray));
//
//        int counter = 0;
//
//        for(int i = 0; i < newArray.size(); i++){
//
//            if(newArray.get(i).equals(valueToEvaluate)){
//                counter++;
//            }
//
//        }
//
//        return counter;
//
//    }
//
//
//
//
//
//
//
//    public T getMostCommonFromMerge(T[] arrayToMerge) {
//
//        newArray.addAll(Arrays.asList(this.inputArray));
//        newArray.addAll(Arrays.asList(arrayToMerge));
//
//
//        int count = 1, tempCount;
//
//        T mostCommon = newArray.get(0);
//
//        T temp;
//
//        for (int i = 0; i < (newArray.size() - 1); i++)
//        {
//            temp = newArray.get(i);
//            tempCount = 0;
//            for (int j = 1; j < newArray.size(); j++)
//            {
//                if (temp == newArray.get(j))
//                    tempCount++;
//            }
//            if (tempCount > count)
//            {
//                mostCommon = temp;
//                count = tempCount;
//            }
//        }
//
//
//        return mostCommon;
//    }
//
//
//
//
//
//
//
//
//    public Integer getNumberOfOccurrences(T valueToEvaluate) {
//
//
//        Integer counter = 0;
//
//
//        for(int i = 0; i < inputArray.length; i++){
//
//            if(inputArray[i].equals(valueToEvaluate)){
//                counter++;
//            }
//
//        }
//
//        return counter;
//    }
//
//
//
//
//
//
//
//
//
//
//
//    public T[] removeValue(T valueToRemove) {
//
//        //Convert to String and manipulating
////        String str = inputArray.toString();
////
////        boolean checkContains = str.contains((CharSequence) valueToRemove);
////
////        if(checkContains = true){
////            str = str.replace((CharSequence) valueToRemove, "");
////        }
////
////        T[] returnValue = str;
//
//
//        //Convert to arrayList and manipulating
////        ArrayList<T> newArray = new ArrayList<>();
////
////        newArray.remove(valueToRemove);
////
////
////        T[] returnValue = newArray.toArray();
//
//
//
//        List<T> returnValue = new LinkedList<>(Arrays.asList(inputArray));
//
//
//        for(int i = 0; i < returnValue.size(); i++){
//            if(returnValue.get(i).equals(valueToRemove)){
//                returnValue.remove(i);
//            }
//        }
//
//
//        //return (T[]) returnValue.toArray();
//        return returnValue.toArray(Arrays.copyOf(inputArray, returnValue.size()));
//
//
//    }
//
//












}
