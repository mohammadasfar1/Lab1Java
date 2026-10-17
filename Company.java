package src;
import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
 ArrayList<SmartDevice> devices = new ArrayList<>();

        SmartLight light1 = new SmartLight(1, "Living Room Light", "Philips");
        SmartCamera camera1 = new SmartCamera(2, "Front Door Camera", "Ring");
        SmartFan fan1=new SmartFan(3, "Bedroom Fan", "Dyson");
        WiFiSmartCamera wifiCamera = new WiFiSmartCamera(4, "Backyard Camera", "Arlo");
        devices.add(light1);
        devices.add(camera1);
devices.add(fan1);
devices.add(wifiCamera);
        for (SmartDevice device : devices) {
            device.displayInfo();
            System.out.println();
        }
    System.out.println("Turning on the light...");
        light1.turnOn();
        System.out.println("The camera ...");
        camera1.isRecording = true; 
        camera1.stopRecording();
        System.out.println("Turning on the fan...");
        fan1.turnOn();
        fan1.setSpeed(2);
        System.out.println("The WiFi camera ...");
        wifiCamera.startRecording();
        wifiCamera.connectToNetwork("HomeWiFi");
        System.out.println();

        for (SmartDevice device : devices) {
            device.displayInfo();
            System.out.println();
        }
        System.out.println("The total number of devices is: " + devices.size());
    }
}

