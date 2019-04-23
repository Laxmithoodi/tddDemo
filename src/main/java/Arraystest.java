import java.util.Collection;
import java.util.Collections;

public class Arraystest {

    public static void main(String[] args) {
        if(true && false && true || false)
            System.out.println("True.");
        else
            System.out.println("False");



        int x[] ={1,4,989,738,8902};
    for(int i=x.length-1; i>=0; i--){
        System.out.println(x[i]);
}
        System.out.println("Sum is " + 3 +6);
        System.out.println( 3 +6 + " Sum is");

    }

        /** print all even numbers
        for (int i = 2; i < 10; i=i+2) {

                System.out.println(i);

        }
    }
}
         **/
 /** Print all numbers divisble by 5

        for(int i=5; i<=100; i=i+5){
            System.out.println(i);
        }
    }


**/

    /**
    public static void main(String[] args) {
        int x[] = {1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6, 311, 1};
       // int y[] = new int[x.length];

        System.out.println(3 +6 + " is the sum");
        for (int i = 0; i < x.length; i++) {

            for (int j = i; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                }
            }
        }

//        for (int i = 0; i < x.length; i++) {
//            System.out.println("Array in descending order ->" + x[i]);
//        }

        int c = 1;
        for (int i = 0; i < x.length-1; i++) {
            if (x[i] != x[i +1]) {
                System.out.println(x[i] + "repeated " + c + "-times");
                c = 1;
            } else {
                c++;
            }
        }
    }
     **/

/**
        public static void main(String[] args) {
            System.out.println("A");
            System.out.print("B");
            System.out.print("C");
            System.out.println("D");
            System.out.println("E");
        }
**/

/**
    public static void main(String[] args){
        int x[] ={1,7774,989,738,8902};

        int s=0;
        for(int i=0; i<x.length; i++){
            if(s<x[i]){
                s=x[i];
            }

        }
        System.out.println(s);
    }
**/
//
//    public static int getMissingNo(int[] test){
//
//       int n= test.length;
//        for (int i = 0; i < n; i++) {
//           if(test[i] !=(i+1))
//               return (i+1);
//
//        }
//        return n+1;
//
//    }
//    }

    }