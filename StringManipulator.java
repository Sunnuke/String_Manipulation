public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String newstr = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                ;
            }
            else {
                newstr = newstr + str1.charAt(i);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                ;
            }
            else {
                newstr = newstr + str2.charAt(i);
            }
        }
        return newstr;
    }
    public Integer getIndexOrNull(String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return i;
            }
        }
        return null;
    }
    public Integer getIndexOrNull(String str1, String str2) {
        int sub = str1.indexOf(str2);
        if (sub == -1) {
            return null;
        }
        else{
            return sub;
        }
    }
    public String concatSubstring(String str1, int num1, int num2, String str2) {
        String sub = "";
        for (int i = num1; i < num2; i++) {
            sub = sub + Character.toString(str1.charAt(i));
        }
        return sub + str2;
    }
}