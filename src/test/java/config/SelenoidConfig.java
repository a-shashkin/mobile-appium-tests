package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/selenoid.properties"})
public interface SelenoidConfig extends Config {
    String selenoidURL();
    String selenoidDevice();
    String selenoidOSVersion();
}
