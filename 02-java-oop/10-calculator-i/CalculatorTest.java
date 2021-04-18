public class CalculatorTest{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setInput1(12.5);
        cal.setInput2(10.4);
        cal.setAction('-');
        cal.performOperation();
        cal.getResult();

        cal.setInput1(12.5);
        cal.setInput2(10.4);
        cal.setAction('+');
        cal.performOperation();
        cal.getResult();
    }
}