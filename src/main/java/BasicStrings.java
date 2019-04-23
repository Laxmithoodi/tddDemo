public class BasicStrings {

 //flipConcat should concatenate string1 to the end of string2.
    public String flipConcat(String string1, String string2) {
     return string2+string1;
 }

    //getChar should get the index character of string.
    public char getChar(String string, int index) {
        return string.charAt(index);
    }


 //   iCantSee should return a String of whitespace the same length as string.

    public String iCantSee(String string) {
        String blind = "";
        for (int i = 0; i < string.length(); i++) {
             blind += " ";

        }
        return blind;
    }

// loudAndClear should return a String that is the equivalent of string with all uppercase letters.

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

//reverseCase should return the string but switches the casing of alphabetical characters.

    public String reverseCase(String string){
        String result ="";

        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                char temp = (char)(string.charAt(i) + 32);
                result += temp;
            }
            else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                char temp = (char)(string.charAt(i) - 32);
                result += temp;
            }
            else {
                result += string.charAt(i);
            }
        }
        return result;
    }
 //oneAtATime should merge the inputs one character at a time and return that String.

    public String oneAtATime(String string1, String string2) {
        int longer = Math.max(string1.length(), string2.length());
        String result = "";
        for (int i = 0; i < longer; i++) {
            if(i < string1.length()){
                result += string1.charAt(i);
            }
            if(i < string2.length()){
                result += string2.charAt(i);
            }
        }
        return result;
    }




}
