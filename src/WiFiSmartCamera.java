package src;

public class WiFiSmartCamera extends SmartCamera implements WiFiConnection {
    private boolean isConnected;
    private String networkName;

    public WiFiSmartCamera(int id, String name, String brand) {
        super(id, name, brand);
        this.isConnected = false;
    }

   

    @Override
    public void connectToNetwork(String networkName) {
        if (isConnected) {
            System.out.println( " is already connected to " + this.networkName);
        } else {
            this.isConnected = true;
            this.networkName = networkName;
            System.out.println(" connected to Wi-Fi network: " + this.networkName);
        }
    }

    @Override
    public void disconnectFromNetwork() {
        if (!isConnected) {
            System.out.println(" is not connected to any network.");
        } else {
            System.out.println(" disconnected from Wi-Fi network: " + this.networkName);
            this.isConnected = false;
            this.networkName = null;
        }
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    public String getNetworkName() {
        return networkName;
    }

    

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wi-Fi Status: " + (isConnected ? "Connected to " + networkName : "Disconnected"));
        System.out.println("------------------------------------");
    }
}