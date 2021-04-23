public abstract class Phone {
    //attributes
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    //constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // getters and setters 
    public String getVersionNumber(){
        return this.versionNumber;
    }
    public void setVersionNumber(String versionNumber){
        this.versionNumber = versionNumber;
    }

    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }
    public void setBatteryPercentage(int batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }

    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getRingTone(){
        return this.ringTone;
    }
    public void setRingTone(String ringTone){
        this.ringTone = ringTone;
    }

    public abstract void displayInfo();


}