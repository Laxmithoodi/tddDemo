public class Strings1 {

    /**  /* Given 2 non-negative ints, a and b, return their sum, so long as the sum
     * has the same number of digits as a. If the sum has more digits than a,
     * just return a without b.
     * a, b ; 2+3 = 5 - return sum; sum =10- return a
     */


    public static int sumlimit(int a, int b){
        int sum = a+b ;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if(sumLength == aLength)
            return sum;
        else
        return a;
    }

/**
    /* Given a string str, if the string starts with "f" return "Fizz". If the
     * string ends with "b" return "Buzz". If both the "f" and "b" conditions are
     * true, return "FizzBuzz". In all other cases, return the string unchanged.
 *
 *
     */

    public  String fizzString(String str) {
        if (str.length() > 0 &&
                str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
        return "FizzBuzz";

        if (str.length() > 0 && str.charAt(0) == 'f')
        return "Fizz";

        if (str.length() > 0 && str.charAt(str.length() - 1) == 'b')
        return "Buzz";
        return str;
    }

/**
    /* Given an int n, return the string form of the number followed by "!". So
     * the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz"
     * instead of the number, and if the number is divisible by 5 use "Buzz", and
     * if divisible by both 3 and 5, use "FizzBuzz".
     */
    public String fizzString2(int n) {

        if (n % 15 == 0)
            return "FizzBuzz";
        if (n % 3 == 0)
            return "Fizz";
        if (n % 5 == 0)
            return "Buzz!";
        return String.valueOf(n) + "!";
  }

 /**   /* Given three ints, a b c, return true if two or more of them have the same
     * rightmost digit. The ints are non-negative.
     */

    public boolean lastdigit(int a, int b, int c){

        return (a % 10 == b%10) || (b % 10 == c%10 ) || (a % 10 == c%10);

    }

    }

