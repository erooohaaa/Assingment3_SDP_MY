package adapter;

import charger.DeviceCharger;
import thirdparty.PhoneChargerUSB;

public class USBChargerAdapter implements DeviceCharger {

    private final PhoneChargerUSB phoneCharger;

    public USBChargerAdapter(PhoneChargerUSB phoneCharger) {
        this.phoneCharger = phoneCharger;
    }

    @Override
    public void chargeDevice(int volts) {

        int usbVolts = convertToUSB(volts);
        phoneCharger.chargeWithUSB(usbVolts);
    }

    private int convertToUSB(int volts) {
        return 5;
    }
}
