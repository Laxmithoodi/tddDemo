

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraystest1<S> {


    S[] inputArray;
    S[] mergerArray;

    public Arraystest1(S[] inputArray){
        this.inputArray = inputArray;
    }
//S[] temp = (S[]) new Object[length];(creating a new generic array)

    public int getNumberOfOccurrences(S valueToEvaluate){

       int countOccurence =0;
       for(S element : inputArray){
           if(element.equals(valueToEvaluate)){
               countOccurence++;
           }
       }
       return countOccurence;


//        public S[] removeValue(S[] valueToRemove){
//
//            Integer removed = getNumberOfOccurrences(valueToRemove);
//            S[] array = (S[])Array.newInstance(inputArray.getClass().getComponentType(), inputArray.length-removed);
//            int count =0;
//            for (int i=0; i<inputArray.length; i++){
//                if(!inputArray[i].equals(valueToRemove))){
//                array[count] = inputArray[i];
//                count++;
//                }
//            }
//        return array;
//        }


    }



}
