package thirdparty;

public class PhoneChargerUSB {
    public void chargeWithUSB(int usbVolts) {
        if (usbVolts == 5) {
            System.out.println("Phone is charging with USB " + usbVolts + "V");
        } else {
            System.out.println("Phone cannot charge with USB " + usbVolts + "V");
        }
    }
}
