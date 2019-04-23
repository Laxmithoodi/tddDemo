package Arrays;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


    public class ArrayUtility<SomeType> {
        private final SomeType[] array;

        public ArrayUtility(SomeType[] array) {
            this.array = array;
        }

        public SomeType findOddOccurringValue() {
            Map<SomeType, Long> counts =
                    (Map<SomeType, Long>) Stream.of(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            Set<SomeType> numbers = counts.keySet();
            for(SomeType n: numbers){
                if(counts.get(n) % 2!= 0)
                    return n;
            }

            return null;
        }

        public SomeType findEvenOccurringValue() {
            Map<SomeType, Long> counts =
                    (Map<SomeType, Long>) Stream.of(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            Set<SomeType> numbers = counts.keySet();
            for(SomeType n: numbers){
                if(counts.get(n) % 2 == 0)
                    return n;
            }
            return null;
        }

        public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
            Map<SomeType, Long> counts =
                    (Map<SomeType, Long>) Stream.of(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            Set<SomeType> numbers = counts.keySet();
            for(SomeType n: numbers){
                if(n.equals(valueToEvaluate))
                    return Math.toIntExact(counts.get(n));
            }
            return null;
        }

        public SomeType[] filter(Function<SomeType, Boolean> predicate) {
            return (SomeType[]) Stream.of(array).filter((Predicate<? super SomeType>) predicate).toArray();
        }
    }

}
