# Adapter Pattern Example: Device Chargers

## 🎯 Description
This project demonstrates the use of the **structural Adapter design pattern** with a real-life analogy of device charging.  

- The client code expects the method `chargeDevice(int volts)`.  
- **LaptopCharger** works directly with 220V.  
- **PhoneChargerUSB** requires USB 5V.  

The adapter `USBChargerAdapter` solves this problem: it accepts 220V but delivers only 5V to the phone.  
Thus, the client code works uniformly and is unaware of the conversion happening inside.  

---

## 🛠 Project Structure
```plaintext
src/
├── Main.java
├── charger/
│   ├── DeviceCharger.java
│   └── LaptopCharger.java
├── thirdparty/
│   └── PhoneChargerUSB.java
└── adapter/
    └── USBChargerAdapter.java

## ▶️ Example Output
Laptop is charging with 220V
Phone is charging with USB 5V
