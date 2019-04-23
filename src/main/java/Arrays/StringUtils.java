package Arrays;

    public class StringUtils {
        /**
         * @param string - String to capitalize
         * @return - input String with first character capitalized
         */
        public static String capitalizeFirstChar(String string) {
            String firstChar = new Character(string.charAt(0)).toString();
            return string.replaceFirst(firstChar, firstChar.toUpperCase());
        }

        /**
         * @param numberOfRepeats - number of times to repeat this string
         * @param val             - value of string to repeat
         * @return - `personSequence` concatenated with itself `numberOfRepeats` times
         */
        public static String repeatString(int numberOfRepeats, String val) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < numberOfRepeats; i++) {
                sb.append(val);
            }
            return sb.toString();
        }

        /**
         * @param s the String to pad
         * @param n the padding amount
         * @return the padded-left String
         */
        public static String padLeft(Object s, int n) {
            return String.format("%1$" + n + "s", s);
        }


        /**
         * @param s the String to pad
         * @param n the padding amount
         * @return the padded-left String
         */
        public static String padRight(String s, int n) {
            return padLeft(s, -n);
        }

        /**
         * @param str string to check
         * @return true if `str` is a palindrome
         */
        public static boolean isPalindromeIgnoreCase(String str) {
            return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        }
    }



    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(i == indexToCapitalize)
                    sb.append(Character.toUpperCase(str.charAt(i)));
                else
                    sb.append(str.charAt(i));
            }
            return sb.toString();
        }

        public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
            baseString = baseString.toLowerCase();
            for(int i=0;i< baseString.length();i++)
            {
                if(i == indexOfString && baseString.charAt(i) == characterToCheckFor)
                    return true;
                if(i> indexOfString)
                    break;
            }
            return false;
        }
    public static Boolean hasVowels(String word) {
        word = word.toLowerCase();
        return StringUtils.containsAny(word, 'a','e','i','o','u');
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                return i;
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
            return true;
        return false;
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
            return true;
        return false;
    }




    public static Character getMiddleCharacter(String string) {
        return string.charAt((string.length() - 1) / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        Character character = Character.toUpperCase(getMiddleCharacter(str));
        StringBuilder sb = new StringBuilder(str);
        int middle = (sb.length() - 1) / 2;
        sb.deleteCharAt(middle);
        sb.insert(middle, character);
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Character character = Character.toLowerCase(getMiddleCharacter(str));
        StringBuilder sb = new StringBuilder(str);
        int middle = (sb.length() - 1) / 2;
        sb.deleteCharAt(middle);
        sb.insert(middle, character);
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        // str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
       /* for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;*/

        // If no duplicate characters encountered,
        // return true
        str = str.toLowerCase();

        for(int i=1;i<str.length() - 1;i++){
            if(str.charAt(i-1) == str.charAt(i) || str.charAt(i) == str.charAt(i+1))
                return true;
        }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
//        char prev = '\0';
//        int k = 0;
//        char[] chars = str.toCharArray();
//
//        for (int i = 0; i < str.length(); i++)
//        {
//            if (prev != chars[i]) {
//                chars[k++] = chars[i];
//                prev = chars[i];
//            }
//        }

        //      return new String(chars).substring(0, k);


       /* List<Character> list = new ArrayList<>();
        int index =0;
        for(int i=0;i<str.length();i++){
            if(list.isEmpty() || list.get(index) != str.charAt(i)) {
                list.add(str.charAt(i));
                index++;
            }
        }


        return list.toArray(new Character[0]).toString();*/

        for(int i=0;i<str.length();i++){
            if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1))
            {

            }
        }



        return null;
    }

//    public static String invertCasing(String str) {
//
//        return org.apache.commons.lang3.StringUtils.swapCase(str);
//    }
}
