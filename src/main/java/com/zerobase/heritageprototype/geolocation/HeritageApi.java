package com.zerobase.heritageprototype.geolocation;

import org.springframework.web.reactive.function.client.WebClient;


public class HeritageApi {

    public String externalAPI(int pageNum){

    WebClient client = WebClient.create("https://www.khs.go.kr");
    String response = client.get()
            .uri("/cha/SearchKindOpenapiList" +
                    ".do?pageUnit=20&pageIndex="+pageNum+"&ccbaCncl=N")
            .retrieve()
            .bodyToMono(String.class)
            .block();  // Synchronous call, use `block()` in non-reactive code

        return response;
    }

}
