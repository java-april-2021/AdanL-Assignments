public class PuzzlingTest{
public static void main(String[] args) {
    int[] myArray = new int[]{3,5,1,2,7,9,8,13,25,32};
    String[] Names = new String[]{"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
    
    Puzzling PT= new Puzzling();

    System.out.println(PT.firstProblem(myArray));
    PT.NameShuffle(Names);
    PT.Alphabet();
    System.out.println(PT.NumArray());
    System.out.println(PT.sortArray());
    System.out.println(PT.randomString());
    PT.randomStringArr();
    }
}