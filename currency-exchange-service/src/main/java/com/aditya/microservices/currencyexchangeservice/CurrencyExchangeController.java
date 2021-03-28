package com.aditya.microservices.currencyexchangeservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;

    private final CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        log.info("retrieveExchangeValue() called with {} to {}", from, to);
        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to);
        if(currencyExchange == null) {
            throw new RuntimeException("Unable to find data for " + from + " to " + to);
        }
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
