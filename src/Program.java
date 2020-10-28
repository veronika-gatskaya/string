import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String first = "Quality";
        String second = "Assurance";
        String third = "qUaLiTy";
        String text = "Veronika is going to be SDET";
        List<String> strings = List.of("Java", "123JavaScript", "JavaSE", "HTML", "C#");
        length(first, second);
        joinFirstChars(first, second);
        splitString(text);
        compareString(third, first);
        findJava(strings);
    }

    public static void length(String first, String second) {
        System.out.println("First string length: " + first.length() + "; " + "Value: " + first + "; " + "Second string length: " + second.length() + "; " + "Value: " + second);
    }

    public static void joinFirstChars(String first, String second) {
        System.out.println(first.charAt(0) + " " + second.substring(0,1));
        String output = String.join("", first.substring(0,1), second.substring(0,1));
        System.out.println(output);
    }

    public static void splitString(String first) {
        List<String> words = Arrays.asList(first.split(" "));
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void compareString(String first, String second) {
        System.out.println(first.equals(second));
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(first.compareTo(second));
        System.out.println(first.toLowerCase().equals(second.toLowerCase()));
        System.out.println(first.toUpperCase().equals(second.toUpperCase()));

    }

    public static void findJava(List<String> words) {
        for(String word : words) {
            if (word.matches("(\\w)*(Java)(\\w)*")) {
                System.out.println(word);
            }
        }
    }

}
