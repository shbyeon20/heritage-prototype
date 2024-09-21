package com.zerobase.heritageprototype;

import com.zerobase.heritageprototype.geolocation.GoogleApi;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeritagePrototypeApplication {

    public static void main(String[] args) {
        //SpringApplication.run(HeritagePrototypeApplication.class, args);

        GoogleApi heritageApi = new GoogleApi();
        for (int i = 0; i < 40; i++) {
            System.out.println(heritageApi.externalAPI(i));

        }
    }

}

