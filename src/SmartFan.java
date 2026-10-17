package src;
public class SmartFan extends SmartDevice  {
   private boolean isTurnedOn; 
   private int speed;
   
   public SmartFan(int deviceid,String devicename,String devicebrand )
   {
    super(deviceid, devicename, devicebrand);
this.isTurnedOn=false;
this.speed=0;
   }
    
   public void turnOn()
   {
if(isTurnedOn)
    {
        
        System.out.println( "Fan is already turned on.");
    } else {
        isTurnedOn = true;
        speed=1;
        System.out.println("Fan is now turned on.");
    }

   }

   public void turnoff()
   {
if(!isTurnedOn)
    {
        System.out.println("Fan is already turned off.");
    } else {
        isTurnedOn = false;
        speed=0;
        System.out.println("Fan is now turned off.");
    }

   }

public void setSpeed(int newSpeed)
{
if(isTurnedOn)
    {
        if(newSpeed>=1 && newSpeed<=3)
        {
            speed=newSpeed;
            System.out.println("Fan speed set to " + speed);
        } else {
            System.out.println("Invalid speed. Please set a speed between 1 and 3.");
        }
    } else {
        System.out.println("Fan is turned off. Please turn it on before setting the speed.");
    }
}
public boolean isOn() {
        return isTurnedOn;
    }
public void displayInfo() 
{
        System.out.println("Smart Fan Info:");
        super.displayInfo();
        System.out.println("Fan Status: " + (isTurnedOn ? "On" : "Off") + " | Speed: " + speed);
    }
}

