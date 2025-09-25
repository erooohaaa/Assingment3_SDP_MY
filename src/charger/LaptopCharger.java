package charger;

public class LaptopCharger implements DeviceCharger {
    @Override
    public void chargeDevice(int volts) {
        if (volts == 220) {
            System.out.println("Laptop is charging with " + volts + "V");
        } else {
            System.out.println("Laptop cannot charge with " + volts + "V");
        }
    }
}
