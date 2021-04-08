public class Tests{
    public static void main(String [] args) {

        Strings manipulator = new Strings();

        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); 

        char letter = 'o';
        Integer a = manipulator.IndexOrNull("Coding", letter);
        Integer b = manipulator.IndexOrNull("Hello World", letter);
        Integer c = manipulator.IndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); 

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer e = manipulator.IndexOrNull(word, subString);
        Integer d = manipulator.IndexOrNull(word, notSubString);
        System.out.println(e);
        System.out.println(d); 

        String words = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(words); 

    }
}