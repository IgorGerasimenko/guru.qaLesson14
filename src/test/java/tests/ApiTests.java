package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;


public class ApiTests {

    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);

    @Test
    public void apiConfigTest() {
        System.out.println("baseUrl: " + apiConfig.baseUrl());
        System.out.println("token: " + apiConfig.token());
    }
}



