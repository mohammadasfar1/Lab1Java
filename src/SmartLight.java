package src;

public class SmartLight extends SmartDevice {
    boolean isTurnedOn;

     public SmartLight(int deviceID, String devicename, String DeviceBrand) {
    super(deviceID, devicename, DeviceBrand);
    isTurnedOn = false; 
    }

  public void turnOn()
  {
if(isTurnedOn)
    {
        System.out.println("Light is already turned on.");
    } else {
        isTurnedOn = true;
        System.out.println("Light is now turned on.");
    }

  }  

    public void turnOff()
    {
if(!isTurnedOn)
    {
        System.out.println("Light is already turned off.");
    } else {
        isTurnedOn = false;
        System.out.println("Light is now turned off.");
    }
    }

public boolean isOn() {
        return isTurnedOn;
    }

    @Override 
    public void displayInfo() {
        System.out.println("Smart Light Info:");
        super.displayInfo();
        System.out.println("Light Status: " + (isTurnedOn ? "On" : "Off"));
    }
}
