public interface SmartDeviceFactory {
    Bulb createBulb(); //each factory creates a Bulb
    Lock createLock(); //each factory creates a Lock
}