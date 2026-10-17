package src;
public abstract class SmartDevice {
 private final int deviceID ;   
private String devicename;
private String DeviceBrand;
private int TotalDevices;

public SmartDevice(int deviceID, String devicename, String DeviceBrand) {
    this.deviceID = deviceID;
    this.devicename = devicename;
    this.DeviceBrand = DeviceBrand;
   
}

public void displayInfo() {
        System.out.println("ID: " + deviceID + " | Name: " + devicename + " | Brand: " + DeviceBrand + " | Total Devices: " + TotalDevices);
    }



}