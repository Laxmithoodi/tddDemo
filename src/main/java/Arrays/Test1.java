package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test1 {

        public static String getMiddleElement(String[] values) {

            return values[Math.round((values.length - 1) / 2)];
        }

        public static String[] removeMiddleElement(String[] values) {
            List<String> vals = new ArrayList<>(Arrays.asList(values));
            vals.remove(Math.round((values.length - 1) / 2));
            return vals.toArray(new String[0]);
        }

        public static String getLastElement(String[] values) {
            return values[values.length-1];
        }

    public static String[] removeLastElement(String[] values) {
        List<String> vals = new ArrayList<>(Arrays.asList(values));
        vals.remove(Math.round(values.length - 1));
        return vals.toArray(new String[0]);
    }

}

