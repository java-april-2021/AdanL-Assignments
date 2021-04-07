public class FizzBuzz {
    public String fizzbuzz(int number){
    if  (number % 3 == 0 && number % 5==0) {
        return"FizzBuzz";
    }if( number % 3 == 0) {
        return "Buzz";
    }if( number % 5 == 0) {
        return "Fizz";
    }
    return Integer.toString(number);
}
    public void Tester(){
        for(int i= 0; i< 100;i++){
        String result = fizzbuzz(i);
        System.out.println("Number " + i + " Result; " +result);
        }

    }

}