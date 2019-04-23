public class Math1 {

    public class MathUtilities {

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Integer add(int baseValue, int difference) {
            return baseValue + difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Long add(long baseValue, long difference) {
            return baseValue + difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Short add(short baseValue, short difference) {

            int x = (int) baseValue;
            int y = (int) difference;
            int z = x + y;
            short o = (short) z;

            return o;

            // int x = baseValue;
            // int y = difference;
            // int z = x + y;
            // short o = z;

        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Byte add(byte baseValue, byte difference) {
            int x = (int) baseValue;
            int y = (int) difference;
            int z = x + y;
            byte o = (byte) z;

            return o;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Float add(float baseValue, float difference) {
            return baseValue + difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Double add(double baseValue, double difference) {
            return baseValue + difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Integer subtract(int baseValue, int difference) {
            return baseValue - difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Long subtract(long baseValue, long difference) {
            return baseValue - difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Short subtract(short baseValue, short difference) {
            int x = (int) baseValue;
            int y = (int) difference;
            int z = x - y;
            short o = (short) z;

            return o;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Byte subtract(byte baseValue, byte difference) {
            int x = (int) baseValue;
            int y = (int) difference;
            int z = x - y;
            byte o = (byte) z;

            return o;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Float subtract(float baseValue, float difference) {
            return baseValue - difference;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Double subtract(double baseValue, double difference) {
            return baseValue - difference;
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Integer divide(int dividend, int divisor) {
            return (dividend / divisor);
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Long divide(long dividend, long divisor) {
            return (dividend / divisor);
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Short divide(short dividend, short divisor) {
            int x = (int) dividend;
            int y = (int) divisor;
            int z = x / y;
            short o = (short) z;

            return o;
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Byte divide(byte dividend, byte divisor) {
            int x = (int) dividend;
            int y = (int) divisor;
            int z = x / y;
            byte o = (byte) z;

            return o;
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Float divide(float dividend, float divisor) {
            return (dividend / divisor);
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Double divide(double dividend, double divisor) {
            return (dividend / divisor);
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Integer multiply(int multiplicand, int multiplier) {
            return (multiplicand * multiplier);
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Long multiply(long multiplicand, long multiplier) {
            return (multiplicand * multiplier);
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Short multiply(short multiplicand, short multiplier) {
            int x = (int) multiplicand;
            int y = (int) multiplier;
            int z = x * y;
            short o = (short) z;

            return o;
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Byte multiply(byte multiplicand, byte multiplier) {
            int x = (int) multiplicand;
            int y = (int) multiplier;
            int z = x * y;
            byte o = (byte) z;

            return o;
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Float multiply(float multiplicand, float multiplier) {
            return (multiplicand * multiplier);
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Double multiply(double multiplicand, double multiplier) {
            return (multiplicand * multiplier);
        }

        /**
         * @return true
         */
        public Boolean returnTrue() {
            return true;
        }

        /**
         * @return false
         */
        public Boolean returnFalse() {
            return false;
        }

    }

    public class PredicateUtilities {
        /**
         * @param x
         * @param y
         * @return true if `x` is greater than `y`
         */
        public Boolean isGreaterThan(int x, int y) {
            return (x > y);
        }

        /**
         * @param x
         * @param y
         * @return true if `x` is less than `y`
         */
        public Boolean isLessThan(int x, int y) {
            return (x < y);
        }

        /**
         * @param x
         * @param y
         * @return true if `x` is greater than or equal to `y`
         */
        public Boolean isGreaterThanOrEqualTo(int x, int y) {
            return (x >= y);
        }

        /**
         * @param x
         * @param y
         * @return true if `x` is less than or equal to `y`
         */
        public Boolean isLessThanOrEqualTo(int x, int y) {
            return (x <= y);
        }
    }
    public class StringUtilities {
        /**
         * @return `Hello World` as a string
         */
        public String getHelloWorld() {
            return "Hello World";
        }

        /**
         * @param firstSegment a string to be added to
         * @param secondSegment a string to add
         * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
         */
        public String concatenation(String firstSegment, String secondSegment){
            return firstSegment + secondSegment;
        }

        /**
         * @param firstSegment a string to be added to
         * @param secondSegment a string to add
         * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
         */
        public String concatenation(int firstSegment, String secondSegment){
            return firstSegment + secondSegment;
        }

        /**
         * @param input a string to be manipulated
         * @return the first 3 characters of `input`
         */
        public String getPrefix(String input){
            return input.substring(0, 3);
        }

        /**
         * @param input a string to be manipulated
         * @return the last 3 characters of `input`
         */
        public String getSuffix(String input){
            return input.substring(2);
        }

        /**
         * @param inputValue the value to be compared
         * @param comparableValue the value to be compared against
         * @return the equivalence of two strings, `inputValue` and `comparableValue`
         */
        public Boolean compareTwoStrings(String inputValue, String comparableValue){
            return inputValue.equals(comparableValue);
        }

        /**
         * @param inputValue the value input from user
         * @return the middle character of `inputValue`
         */
        public Character getMiddleCharacter(String inputValue){
            return inputValue.charAt(3);
        }

        /**
         * @param spaceDelimitedString a string, representative of a sentence, containing spaces
         * @return the first sequence of characters
         */
        public String getFirstWord(String spaceDelimitedString){
            return spaceDelimitedString.split(" ")[0];
        }

        /**
         * @param spaceDelimitedString a string delimited by spaces
         * @return the second word of a string delimited by spaces.
         */
        public String getSecondWord(String spaceDelimitedString){
            return spaceDelimitedString.split(" ")[1];
        }

        /**
         * @param stringToReverse
         * @return an identical string with characters in reverse order.
         */
        public String reverse(String stringToReverse){
            StringBuilder sb = new StringBuilder(stringToReverse);
            stringToReverse = sb.reverse().toString();
            return stringToReverse;
        }

        /**
         * @param input
         * @return an identical string with spaces removed.
         */
        public String removeWhitespace(String input){
            return input.replaceAll(" ", "");
        }

        /**
         * @param input
         * @return an identical string with spaces in the front and end removed.
         */
        public String trim(String input){
            return input.trim();
        }
    }
}
