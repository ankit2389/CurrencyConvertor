package com.example.CurrencyConverter.controller;

import com.example.CurrencyConverter.model.ConversionResponse;
import com.example.CurrencyConverter.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //crud operation, create, update, read,delete
@RequestMapping("/api/currency") // api calling
public class CurrencyController {

    @Autowired //dependencies injection method baar baar bana nhi padhe easliy assced ho jaye
    private CurrencyService currencyService; //object creation

    @GetMapping("/convert") //api call hua data aagya, output milta hai postmapping input>output putmapping to add in data, deletemapping to delete in data
    public ConversionResponse convertCurrency(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double amount) {
        return currencyService.getConversion(from, to, amount);
    }
}
