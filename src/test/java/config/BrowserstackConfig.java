package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/browserstack.properties"})
public interface BrowserstackConfig extends Config {

    String browserstackURL();
    String browserstackUsername();
    String browserstackPassword();
    String browserstackApp();
    String browserstackDevice();
    String browserstackOSVersion();
}
