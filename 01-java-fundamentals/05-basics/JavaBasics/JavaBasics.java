import java.util.ArrayList;
import java.util.Arrays;
public class JavaBasics{
    public static void printNum(){
        for(int i=1;i<=255;i++){
            System.out.println(i);
        }
    }
    public static void count(){
        int sum =0;
        for(int i=0;i<=255;i++){
            sum = sum+i;
            System.out.println("New Number: "+i +" Sum: "+ sum);
        }
    }
    public static void oddPrint(){
        for(int i=0;i<=255;i++){
            if(i % 2 == 1)
            System.out.println(i);
        }
    }
    public static void loop(){
        int[] myArray= new int[]{1,3,5,7,9,13};
        for(int num : myArray){
        System.out.println(num);
        }
    }
    public static int max(int[] myArray){
        int max = myArray[0];
        for(int value : myArray){
            if(max < value)
            max = value;
        }
        return max;
    }
    public static double average(int[] myArray){
        double sum=0;
        for(int value :myArray){
            sum = sum + value;
        }
        double avg= sum/myArray.length;
        return avg;
    }
    public static void oddArr() {
        ArrayList<Integer> oddNums = new ArrayList<Integer>(); 
        for(int i=1;i<=255;i++){
            if(i %2 ==1)
            oddNums.add(i);
        }
        System.out.println(oddNums);
    }
    public static int greaterThan(int[] myArray) {
        int Y =5;
        int Count=0;
        for(int value : myArray){
            if(value>5)
            Count=Count+1;
        }
        return Count;
    }
    public static String squared(int[] myArray2) {
        for(int i=0;i<myArray2.length;i++){
            myArray2[i]=myArray2[i]*myArray2[i];
        }
        return Arrays.toString(myArray2);
    }
    public static String noNegs(int[] myArray4) {
        for(int i=0; i<myArray4.length;i++){
            if(myArray4[i]<0)
            myArray4[i]=0;
        }
        return Arrays.toString(myArray4);
    }
    public static ArrayList maxMinAvg(int[] myArray5) {
        ArrayList<Object> arrayNew= new ArrayList<Object>();
        int sum=0;
        int max=myArray5[0];
        int min =myArray5[0];
        for(int i=0; i < myArray5.length; i++){
            sum= sum + myArray5[i];
            if(max < myArray5[i])
                max = myArray5[i];
            if(min > myArray5[i])
                min = myArray5[i];
        }
        double avg=sum/myArray5.length;
        arrayNew.add(max);
        arrayNew.add(min);
        arrayNew.add(avg);
        return arrayNew;
    }
    public static String shift(int [] myArray3) {
        for(int i =1;i<myArray3.length;i++){
            myArray3[i-1] = myArray3[i];
        }
        myArray3[myArray3.length-1]=0;
        return Arrays.toString(myArray3);
    }
    
}
