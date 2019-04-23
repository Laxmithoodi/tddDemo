public class Math2 {

    public String trim(String input){ return input.trim();}

    public String reverse(String stringToReverse) {
        StringBuilder sb = new StringBuilder(stringToReverse.length());
        stringToReverse = sb.reverse().toString();
    return stringToReverse;
    }
    }
