public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String newstr = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                return null;
            }
            else {
                newstr = newstr + str1.charAt(i);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                return null;
            }
            else {
                newstr = newstr + str2.charAt(i);
            }
        }
        return newstr;
    }
    public Integer getIndexOrNull(String str1, char chr1) {
        
    }
    public Integer getIndexOrNull(String str1, String str2) {
        
    }
    public String concatSubstring(String str1, int num1, int num2, String str2) {
        
    }
}