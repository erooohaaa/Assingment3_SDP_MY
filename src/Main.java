import adapter.USBChargerAdapter;
import charger.DeviceCharger;
import charger.LaptopCharger;
import thirdparty.PhoneChargerUSB;

public class Main {
    public static void main(String[] args) {

        DeviceCharger laptop = new LaptopCharger();
        laptop.chargeDevice(220);


        DeviceCharger phone = new USBChargerAdapter(new PhoneChargerUSB());
        phone.chargeDevice(220);
    }
}
