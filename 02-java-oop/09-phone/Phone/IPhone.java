public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Welcome to your Iphone";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Version Number: "+ this.getVersionNumber());
        System.out.println("Battery is at " +this.getBatteryPercentage());
        System.out.println("Your carrier is: " + this.getCarrier());
        System.out.println("RingTone: "+ this.getRingTone());           
    }
}
