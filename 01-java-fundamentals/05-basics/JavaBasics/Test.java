public class Test{
public static void main(String[] args) {
        JavaBasics JB= new JavaBasics();
        int[] myArray= new int[]{1,3,5,7,9,13};
        int[] myArray2= new int[]{1,5,10,-2};
        int[] myArray3= new int[]{1, 5, 10, 7, -2};
        int[] myArray4= new int[]{2,7,-3,6,8,-5, 12,-2};
        int[] myArray5= new int[]{221,721,123,90,83,-56, 125,-200};
        JB.printNum();
        JB.count();
        JB.oddPrint();
        JB.loop();
        System.out.println(JB.max(myArray));
        System.out.println(JB.average(myArray));
        JB.oddArr();
        System.out.println(JB.greaterThan(myArray));
        System.out.println(JB.squared(myArray2));
        System.out.println(JB.noNegs(myArray4));
        System.out.println(JB.maxMinAvg(myArray5));
        System.out.println(JB.shift(myArray3));
    }
}
