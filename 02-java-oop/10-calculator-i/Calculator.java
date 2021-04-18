public class Calculator{

    //attributes
    private char action;
    private double input1;
    private double input2;
    private double result;

    public void Calculator(){

    }

    //GNS

    public void setInput1( double input1){
        this.input1 = input1;
    }

    public void setInput2(double input2){
        this.input2= input2;
    }

    public void setAction(char action){
        this.action=action;
    }

    //methods
    public void performOperation(){
        if( this.action == '-'){
            result = input1 - input2;
        }
        if( this.action =='+'){
            result = input1 + input2;
        }
    }
    public void getResult(){
        System.out.println(result);
    }
}