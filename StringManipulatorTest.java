public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        // trimAndConcat(String str1, String str2)
        String trim = manipulator.trimAndConcat("    Hello     ", "     World    ");
        System.out.println("trimAndConcat: " + trim);

        // getIndexOrNull(String word, char letter)
        int index = manipulator.getIndexOrNull("Hello World", 'o');
        System.out.println("getIndexOrNull: " + index);

        // getIndexOrNull(String str1, String str2)
        int index2 = manipulator.getIndexOrNull("Human", "man");
        System.out.println("Second getIndexOrNull: " + index2);

        // concatSubstring(String str1, int num1, int num2, String str2)
        String concat = manipulator.concatSubstring("Human", 2, 5, "kind");
        System.out.println("concatSubstring: " + concat);
    }
}