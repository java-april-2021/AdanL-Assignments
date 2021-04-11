import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Puzzling{

    public static ArrayList firstProblem(int[] myArray) {

        ArrayList<Integer> arrayNew = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<myArray.length;i++){
            sum = sum +myArray[i];
            if(myArray[i]>10)
            arrayNew.add(myArray[i]);
        }
        System.out.println(sum);
        return arrayNew;
    }

    public static void NameShuffle(String[] Names) {
        List<String> list =Arrays.asList(Names);
        Collections.shuffle(list);
        System.out.println(list);
        ArrayList<String> newarray= new ArrayList<String>();
        for(int i =0; i < Names.length;i++){
            if(Names[i].length() > 5)
            newarray.add(Names[i]);
        }
        System.out.println(newarray);
        }
        
    public static void Alphabet() {
        ArrayList<Character> NewAlphabet= new ArrayList<Character>();
        for(char ch='a';ch <='z';ch++){
            NewAlphabet.add(ch);
        }

        System.out.println(NewAlphabet);
        Collections.shuffle(NewAlphabet);
        System.out.println(NewAlphabet);
        System.out.println(NewAlphabet.get(25));
        System.out.println(NewAlphabet.get(0));
        if(isVowel(NewAlphabet.get(0)))
        System.out.println("ITS A VOWEL");
    }
    private static boolean isVowel(char letter) {
		Random r = new Random();
		return (
			letter == 'a' ||
			letter == 'e' ||
			letter == 'i' ||
			letter == 'o' ||
			letter == 'u' ||
			// y is sometimes a vowel lol
			(letter == 'y' && r.nextInt(2) == 1)
			);
	}
    public static String NumArray() {
        int[] randomNum= new int[10];
        int offset=100-55;
        Random r =new Random();
        for(int i =0; i <randomNum.length; i++){
            randomNum[i]= r.nextInt(offset) +55;
        }
        return Arrays.toString(randomNum);
    }
    public static String sortArray() {
        int[] array= new int[10];
        Random r =new Random();
        int offset=100-55;
        for(int i=0;i<array.length;i++){
            array[i]= r.nextInt(offset)+55;
        }
        Arrays.sort(array);
        System.out.println("Lowest Value: "+ array[0]);
        System.out.println("Highest Value: "+ array[9]);
        return Arrays.toString(array);
    }
    public static String randomString() {
        String letters="abcdefghijklmnopqrstuvwxyz";
        String randomstring = "";
        int length=5;
        Random r = new Random();

        char[] text =new char[length];

        for (int i = 0; i < length; i++){
            text[i] = letters.charAt(r.nextInt(26));
        }

        for(int i=0;i<text.length;i++){
            randomstring += text[i];
        }
        
        return randomstring;
    }
    public static void randomStringArr() {

        String[] randomNames= new String[5];

        for(int i =0; i < randomNames.length;i++){

            String letters="abcdefghijklmnopqrstuvwxyz";
            String randomstring = "";
            int length=5;
            Random r = new Random();
            char[] text =new char[length];
            
            for (int k = 0; k < length; k++){
            text[k] = letters.charAt(r.nextInt(26));
            }
            for(int j=0; j < text.length; j++){
            randomstring += text[j];
        }
            randomNames[i]=randomstring;
        }
        System.out.println(Arrays.toString(randomNames));
    }
}