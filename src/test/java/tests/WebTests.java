package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;


public class WebTests {

    @Test
    void webConfigTest() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        System.out.println("browserName: " + webConfig.getBrowserName());
        System.out.println("browserVersion: " + webConfig.getBrowserVersion());
        System.out.println("isRemote: " + webConfig.isRemote());
    }
}