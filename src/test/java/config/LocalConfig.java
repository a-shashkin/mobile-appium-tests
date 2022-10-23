package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/local.properties"})
public interface LocalConfig extends Config {
    String localURL();
    String localApp();
    String localDevice();
    String localOSVersion();
}
