package com.ochwada.learnify.motivation.controller;


import com.ochwada.learnify.motivation.dto.QuoteDto;
import com.ochwada.learnify.motivation.service.MotivationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.motivation.controller
 * File: MotivationController.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 5:43 PM
 * Description: This controller handles HTTP requests related to motivational quotes.
 *  It exposes a RESTful endpoint for retrieving all available quotes.
 * *******************************************************
 */

/**
 * The controller uses {@link MotivationService} to interact with the underlying business logic and data access layers.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/quotes")
public class MotivationController {

    /**
     * The service responsible for managing motivational quotes.
     */
    private final MotivationService service;

    /**
     * Retrieves all motivational quotes.
     *
     * @return a list of {@link QuoteDto} representing all quotes available
     */
    @GetMapping
    public List<QuoteDto> getAllQuotes(){
        return service.getAllQuote();
    }
}
