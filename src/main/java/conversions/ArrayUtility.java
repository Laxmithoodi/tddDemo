package conversions;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ArrayUtility<E>  {
    E[] array;

    public ArrayUtility(E[] array) {
        this.array = array;
    }

    public E[] removeValue(E valueToRemove) {
        List<E> list = new ArrayList<>(Arrays.asList(array));
        List<E> newList = new ArrayList<>();
        Consumer<E> consumer = (n) -> {
            if(n != valueToRemove){
                newList.add(n);
            }
        };
        list.forEach(consumer);

        E[] objs =  (E[]) Array.newInstance(this.array.getClass().getComponentType(), newList.size());

        return (E[]) newList.toArray(objs);
    }

    public E getMostCommonFromMerge(E[] arrayToMerge) {
        List<E> list = new ArrayList<>(Arrays.asList(array));
        list.addAll(Arrays.asList(arrayToMerge));
        HashMap<E, Integer> map = new HashMap<>();
        for(E element : list)
        {
            if(!map.containsKey(element))
                map.put(element, 0);
            else
                map.put(element, map.get(element) + 1);
        }

        int max = 0;
        E maxElement = null;
        for(E element : map.keySet()) {
            if(map.get(element) > max){
                maxElement = element;
                max = map.get(element);
            }
        }
        return maxElement;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        ArrayList<E> list = new ArrayList<>(Arrays.asList(array));
        list.addAll(Arrays.asList(arrayToMerge));



        int count = 0;
        for(E element : list)
            if(element.equals(valueToEvaluate))
                count++;
        return count;
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate) {
        ArrayList<E> list = new ArrayList<>(Arrays.asList(array));
        int count = 0;
        for(E element : list)
            if(element.equals(valueToEvaluate))
                count++;
        return count;
    }
}

