package src;

public interface WiFiConnection {
    
    void connectToNetwork(String networkName);
    void disconnectFromNetwork();
    boolean isConnected();
}
