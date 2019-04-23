import static org.junit.Assert.*;
  import org.junit.After;
  import org.junit.Before;
   import org.junit.Test;
public class Math1Test {

//
//    /**
//     * The test class StringUtilitiesTest.
//     *
//     * @author  (your name)
//     * @version (a version number or a date)
//     *//**
//    public class StringUtilitiesTest {
//        private StringUtilities stringUtilities;
//        /**
//         * Sets up the test fixture.
//         *
//         * Called before every test case method.
//         */
//        @Before
//        public void setUp()
//        {
//            stringUtilities = new StringUtilities();
//        }
//
//        /**
//         * Tears down the test fixture.
//         *
//         * Called after every test case method.
//         */
//        @After
//        public void tearDown()
//        {
//        }
//
//        @Test
//        public void getHelloWorldTest() {
//            // : Given
//            String expected = "Hello World";
//
//            // : When
//            String actual = stringUtilities.getHelloWorld();
//
//            // : Then
//            assertEquals(expected, actual);
//
//        }
//
//        @Test
//        public void concatenationStringTest(){
//            // : Given
//            String one = "Hello";
//            String two = " Java";
//            String expected = "Hello Java";
//
//            // : When
//            String actual = stringUtilities.concatenation(one,two);
//
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//
//        @Test
//        public void concatenationStringAndIntegerTest(){
//            // : Given
//            int one = 1;
//            String two = " Java";
//            String expected = "1 Java";
//
//            // : When
//            String actual = stringUtilities.concatenation(one,two);
//
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void substringBeginTest(){
//            // : Given
//            String input = "Hello";
//            String expected = "Hel";
//
//            // : When
//            String actual = stringUtilities.getPrefix(input);
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void substringEndTest(){
//            // : Given
//            String input = "Hello";
//            String expected = "llo";
//
//            // : When
//            String actual = stringUtilities.getSuffix("Hello");
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void compareToTestEquals(){
//            // : Given
//            String inputValue = "Zipcode";
//            String comparableValue = "Zipcode";
//
//            // : When
//            boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);
//
//            // : Then
//            assertTrue(actual);
//        }
//
//
//        @Test
//        public void compareToTestNotEquals(){
//            // : Given
//            String inputValue = "Zipcode";
//            String comparableValue = "Zipcodee";
//
//            // : When
//            boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);
//
//            // : Then
//            assertFalse(actual);
//        }
//
//        @Test
//        public void getTheMiddleChar1(){
//            // : Given
//            String input = "Zipcode";
//            Character expected = 'c';
//
//            // : When
//            Character actual = stringUtilities.getMiddleCharacter(input);
//
//            // : Then
//            assertEquals(expected.toString(), actual.toString());
//        }
//
//
//        @Test
//        public void getTheMiddleChar2(){
//            // : Given
//            String input = "Zipcoder";
//            Character expected = 'c';
//
//            // : When
//            Character actual = stringUtilities.getMiddleCharacter(input);
//
//            // : Then
//            assertEquals(expected.toString(), actual.toString());
//        }
//
//
//        @Test
//        public void getTheFirstWord(){
//            // : Given
//            String input = "Zipcode Wilmington";
//            String expected = "Zipcode";
//
//            // : When
//            String actual = stringUtilities.getFirstWord(input);
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//
//        @Test
//        public void getTheSecondWord(){
//            // : Given
//            String input = "Zipcode Wilmington";
//            String expected = "Wilmington";
//
//            // : When
//            String actual = stringUtilities.getSecondWord(input);
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void reverseThem(){
//            // : Given
//            String input = "Zipcode Wilmington";
//            String expected = "notgnimliW edocpiZ";
//
//
//            // : When
//            String actual = stringUtilities.reverse(input);
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void removeWhitespace(){
//            // : Given
//            String input = "It's a beautiful day in this neighborhood";
//            String expected = "It'sabeautifuldayinthisneighborhood";
//
//            // : When
//            String actual = stringUtilities.removeWhitespace(input);
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void trimWhitespaceInTheBegginningAndEnd(){
//            // : Given
//            String input = "    Zipcode Wilmington ";
//            String expected = "Zipcode Wilmington";
//
//            // : When
//            String actual = stringUtilities.trim(input);
//
//            // : Then
//            assertEquals(expected, actual);
//        }
//    }
//
//import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//    /**
//     * The test class MathUtilitiesTest.
//     *
//     * @author  (your name)
//     * @version (a version number or a date)
//     */
//    public class MathUtilitiesTest
//    {
//        private MathUtilities primativeTypes;
//
//        /**
//         * Sets up the test fixture.
//         *
//         * Called before every test case method.
//         */
//        @Before
//        public void setUp(){
//            primativeTypes = new MathUtilities();
//        }
//
//        /**
//         * Tears down the test fixture.
//         *
//         * Called after every test case method.
//         */
//        @After
//        public void tearDown()
//        {
//        }
//
//
//
//        @Test
//        public void testAdditions() {
//            // : Given
//            int baseValue = 20;
//            int addedValue = 7;
//            int expected = 27;
//            // : When
//            int actual = primativeTypes.add(baseValue, addedValue);
//            // : Then
//            assertEquals(expected,actual);
//        }
//        @Test
//        public void testAdditions1() {
//            // : Given
//            long baseValue = 228437266;
//            long difference = 228437265;
//            long expected = 456874531;
//            // : When
//            long actual = primativeTypes.add(baseValue, difference);
//            // : Then
//            assertEquals(expected,actual);
//        }
//        @Test
//        public void testAdditions2() {
//            // : Given
//            short baseValue = 16384;
//            short addedValue = 7;
//            short expected = 16391;
//            // : When
//            short actual = primativeTypes.add(baseValue, addedValue);
//            // : Then
//            assertEquals(expected,actual);
//        }
//
//        @Test
//        public void testAdditions4() {
//            // : Given
//            byte baseValue = 63;
//            byte addedValue = 64;
//            byte expected = 127;
//            // : When
//            byte actual = primativeTypes.add(baseValue, addedValue);
//            // : Then
//            assertEquals(expected,actual);
//        }
//        @Test
//        public void testAdditions5() {
//            // : Given
//            float baseValue = 750.585F;
//            float addedValue = 795.000F;
//            float expected = 1545.585F;
//            // : When
//            float actual = primativeTypes.add(baseValue, addedValue);
//            // : Then
//            assertEquals(expected,actual, 0);
//        }
//
//        @Test
//        public void testAdditions6() {
//            // : Given
//            double baseValue = 225.25;
//            double addedValue = 231;
//            double expected = 456.25;
//            // : When
//            double actual = primativeTypes.add(baseValue,addedValue);
//            // : Then
//            assertEquals(expected,actual, 0);
//        }
//
//        @Test
//        public void testSubtractions(){
//            // : Given
//            int baseValue = 20;
//            int difference = 7;
//            int expectedInt = 13;
//            // : When
//            int actualInt = primativeTypes.subtract(baseValue,difference);
//            // : Then
//            assertEquals(expectedInt,actualInt);
//        }
//        @Test
//        public void testSubtractions1() {
//            // : Given
//            long baseValue = 228437266;
//            long difference = 228437265;
//            long expectedLong = 1;
//            // : When
//            long actualLong = primativeTypes.subtract(baseValue, difference);
//            // : Then
//            assertEquals(expectedLong,actualLong);
//        }
//        @Test
//        public void testSubtractions2() {
//            // : Given
//            short baseValue = 16384;
//            short difference = 16383;
//            short expectedShort = 1;
//            // : When
//            short actualShort = primativeTypes.subtract(baseValue, difference);
//            // : Then
//            assertEquals(expectedShort,actualShort);
//        }
//        @Test
//        public void testSubtractions3() {
//            // : Given
//            byte baseValue = 63;
//            byte difference = 64;
//            byte expectedByte = -1;
//            // : When
//            byte actualByte = primativeTypes.subtract(baseValue, difference);
//            // : Then
//            assertEquals(expectedByte,actualByte);
//        }
//        @Test
//        public void testSubtractions4() {
//            // : Given
//            float baseValue = 750.585F;
//            float difference = 795.0F;
//            float expectedFloat = -44.415F;
//            // : When
//            float actualFloat = primativeTypes.subtract(baseValue,difference);
//            // : Then
//            assertEquals(expectedFloat,actualFloat, 0.005);
//        }
//        @Test
//        public void testSubtractions5() {
//            // : Given
//            double baseValue = 225.25;
//            double difference = 231;
//            double expectedDouble = -5.75;
//            // : When
//            double actualDouble = primativeTypes.subtract(baseValue, difference);
//            // : Then
//            assertEquals(expectedDouble,actualDouble, 0);
//        }
//
//        @Test
//        public void testDivision(){
//            // : Given
//            int dividend = 20;
//            int divisor = 2;
//            int expectedInt = 10;
//            // : When
//            int actualInt = primativeTypes.divide(dividend, divisor);
//            // : Then
//            assertEquals(expectedInt,actualInt);
//        }
//        @Test
//        public void testDivision1() {
//            // : Given
//            int dividend = 20000000;
//            int divisor = 1000;
//            long expectedLong = 20000;
//            // : When
//            long actualLong = primativeTypes.divide(dividend, divisor);
//            // : Then
//            assertEquals(expectedLong,actualLong);
//        }
//        @Test
//        public void testDivision2() {
//            // : Given
//            short dividend = 2;
//            short divisor = 1;
//            short expectedShort = 2;
//            // : When
//            short actualShort = primativeTypes.divide(dividend, divisor);
//            // : Then
//            assertEquals(expectedShort,actualShort);
//
//        }
//        @Test
//        public void testDivision3() {
//            // : Given
//            byte dividend = 64;
//            byte divisor = 32;
//            byte expectedByte = 2;
//            // : When
//            byte actualByte = primativeTypes.divide(dividend, divisor);
//            // : Then
//            assertEquals(expectedByte,actualByte);
//        }
//        @Test
//        public void testDivision4() {
//            // : Given
//            float dividend = 7.5F;
//            float divisor = 3;
//            float expectedFloat = 2.50F;
//            // : When
//            float actualFloat = primativeTypes.divide(dividend,divisor);
//            // : Then
//            assertEquals(expectedFloat,actualFloat, 0);
//        }
//        @Test
//        public void testDivision5() {
//            // : Given
//            double dividend = 5.0;
//            double divisor = 4.0;
//            double expectedDouble = 1.25;
//            // : When
//            double actualDouble = primativeTypes.divide(dividend,divisor);
//            // : Then
//            assertEquals(expectedDouble,actualDouble, 0);
//        }
//
//        @Test
//        public void testMultiplication(){
//            // : Given
//            int multiplicand = 5;
//            int multiplier = 2;
//            int expectedInt = 10;
//            // : When
//            int actualInt = primativeTypes.multiply(multiplicand,multiplier);
//            // : Then
//            assertEquals(expectedInt,actualInt);
//        }
//        @Test
//        public void testMultiplication1() {
//            // : Given
//            long multiplicand = 20;
//            long multiplier = 1000;
//            long expectedLong = 20000;
//            // : When
//            long actualLong = primativeTypes.multiply(multiplicand, multiplier);
//            // : Then
//            assertEquals(expectedLong, actualLong);
//        }
//        @Test
//        public void testMultiplication2() {
//            // : Given
//            short multiplicand = 2;
//            short multiplier = 1;
//            short expectedShort = 2;
//            // : When
//            short actualShort = primativeTypes.multiply(multiplicand, multiplier);
//            // : Then
//            assertEquals(expectedShort, actualShort);
//        }
//        @Test
//        public void testMultiplication3() {
//            // : Given
//            byte multiplicand = 16;
//            byte multiplier = 14;
//            byte expectedByte = -32;
//            // : When
//            byte actualByte = primativeTypes.multiply(multiplicand, multiplier);
//            // : Then
//            assertEquals(expectedByte, actualByte);
//        }
//        @Test
//        public void testMultiplication4() {
//            // : Given
//            float multiplicand = 2.5F;
//            float multiplier = 1;
//            float expectedFloat = 2.50F;
//            // : When
//            float actualFloat =  primativeTypes.multiply(multiplicand,multiplier);
//            // : Then
//            assertEquals(expectedFloat, actualFloat, 0);
//        }
//        @Test
//        public void testMultiplication5() {
//            // : Given
//            double multiplicand = 3.25;
//            double multiplier = 3.0;
//            double expectedDouble = 9.75;
//            // : When
//            double actualDouble = primativeTypes.multiply(multiplicand,multiplier);
//            // : Then
//            assertEquals(expectedDouble, actualDouble, 0);
//        }
//
//        @Test
//        public void testReturnTrue(){
//            // : Given
//            // : When
//            // : Then
//            assertTrue(primativeTypes.returnTrue());
//        }
//
//        @Test
//        public void testReturnFalse(){
//            // : Given
//            // : When
//            // : Then
//            assertFalse(primativeTypes.returnFalse());
//        }
//
//    }
//
//import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//    /**
//     * The test class PredicateUtilitiesTest.
//     *
//     * @author  (your name)
//     * @version (a version number or a date)
//     */
//    public class PredicateUtilitiesTest
//    {
//        private PredicateUtilities math;
//
//        /**
//         * Sets up the test fixture.
//         *
//         * Called before every test case method.
//         */
//        @Before
//        public void setUp()
//        {
//            math = new PredicateUtilities();
//        }
//
//        @Test
//        public void testGreaterThanTrue() {
//            // : Given
//            int greaterValue = 450;
//            int lesserValue = 350;
//
//
//            // : When
//            boolean outcome = math.isGreaterThan(greaterValue, lesserValue);
//
//            // : Then
//            assertTrue(outcome);
//        }
//
//
//        @Test
//        public void testGreaterThanFalse() {
//            // : Given
//            int greaterValue = 350;
//            int lesserValue = 350;
//
//            // : When
//            boolean outcome = math.isGreaterThan(greaterValue, lesserValue);
//
//            // : Then
//            assertFalse(outcome);
//        }
//
//
//        @Test
//        public void testLessThanTrue() {
//            // : Given
//            int greaterValue = 450;
//            int lesserValue = 350;
//
//            // : When
//            boolean outcome = math.isLessThan(greaterValue, lesserValue);
//
//            // : Then
//            assertFalse(outcome);
//        }
//
//
//        @Test
//        public void testLessThan1() {
//            // : Given
//            int greaterValue = 450;
//            int lesserValue = 350;
//
//            // : When
//            boolean outcome = math.isLessThan(greaterValue, lesserValue);
//
//            // : Then
//            assertFalse(outcome);
//        }
//
//
//        @Test
//        public void testLessOrEqual1() {
//            // : Given
//            int greaterValue = 3;
//            int lesserValue = 3;
//
//            // : When
//            boolean outcome = math.isLessThanOrEqualTo(greaterValue, lesserValue);
//
//            // : Then
//            assertTrue(outcome);
//        }
//
//        @Test
//        public void testLessOrEqual2() {
//            // : Given
//            int greaterValue = 3;
//            int lesserValue = 6;
//
//            // : When
//            boolean outcome = math.isLessThanOrEqualTo(greaterValue, lesserValue);
//
//            // : Then
//            assertTrue(outcome);
//        }
//
//        @Test
//        public void testGreaterOrEqual1() {
//            // : Given
//            int greaterValue = 4;
//            int lesserValue = 4;
//
//            // : When
//            boolean outcome = math.isGreaterThanOrEqualTo(greaterValue, lesserValue);
//
//            // : ThenP
//            assertTrue(outcome);
//        }
//
//
//        @Test
//        public void testGreaterOrEqual2() {
//            // : Given
//            int greaterValue = 8;
//            int lesserValue = 15;
//
//            // : When
//            boolean outcome = math.isGreaterThanOrEqualTo(greaterValue, lesserValue);
//
//            // : Then
//            assertFalse(outcome);
//        }
//    }
}
