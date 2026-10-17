package src;
public class SmartCamera extends SmartDevice {
    boolean isRecording;
    public SmartCamera(int deviceID, String devicename, String DeviceBrand) {
    super(deviceID, devicename, DeviceBrand);
    }
public void startRecording() {
        if (isRecording) {
            System.out.println(" is already recording.");
        } else {
            this.isRecording = true;
            System.out.println(" start recording now.");
        }
    }

    public void stopRecording() {
        if (!isRecording) {
            System.out.println(" is already stopped.");
        } else {
            this.isRecording = false;
            System.out.println(" stopped recording now.");
        }
    }
    public boolean isRecording() {
        return isRecording;
    }
@Override 
public void displayInfo() {
        System.out.println("Smart Camera Info:");
        super.displayInfo();
        System.out.println("Recording Status: " + (isRecording ? "Recording" : "Not Recording"));
    }

}
