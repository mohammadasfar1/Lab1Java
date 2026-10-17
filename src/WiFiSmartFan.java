package src;

public class WiFiSmartFan extends SmartFan implements WiFiConnection {
    private boolean isConnected;
    private String networkName;

    public WiFiSmartFan(int id, String name, String brand) {
        super(id, name, brand);
    }

    @Override
    public void connectToNetwork(String networkName) {
        this.isConnected = true;
        this.networkName = networkName;
        System.out.println( " connected to " + this.networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        this.isConnected = false;
        System.out.println( " disconnected from Wi-Fi."+ this.networkName);
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wi-Fi Status: " + (isConnected ? "Connected to " + networkName : "Disconnected"));
        System.out.println("------------------------------------");
    }
}