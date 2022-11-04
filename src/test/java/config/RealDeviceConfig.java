package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/realdevice.properties"})
public interface RealDeviceConfig extends Config {
    String realdeviceURL();
    String realdeviceDevice();
    String realdeviceOSVersion();
}
