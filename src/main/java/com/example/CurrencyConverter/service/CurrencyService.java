package com.example.CurrencyConverter.service;

import com.example.CurrencyConverter.model.ConversionResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service //annotation
public class  CurrencyService {

    @Value("${currency.api.base-url}")
    private String apiUrl;

    @Value("${currency.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public ConversionResponse getConversion(String from, String to, double amount) {
        String url = String.format("%s/%s", apiUrl, from);

        // Make API call
        ConversionResponse response = restTemplate.getForObject(url, ConversionResponse.class);

        // Calculate the converted amount
        if (response != null && response.getRates().containsKey(to)) {
            double rate = response.getRates().get(to);
            double convertedAmount = rate * amount;
            response.setConvertedAmount(convertedAmount);
        }
        return response;
    }
}
