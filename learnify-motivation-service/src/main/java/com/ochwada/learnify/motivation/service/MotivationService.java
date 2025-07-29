package com.ochwada.learnify.motivation.service;


import com.ochwada.learnify.motivation.dto.QuoteDto;
import com.ochwada.learnify.motivation.mapper.QuoteMapper;
import com.ochwada.learnify.motivation.repository.MotivationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.motivation.service
 * File: MotivationService.java
 * Author: Ochwada
 * Date: Monday, 28.Jul.2025, 5:43 PM
 * Description: {@code QuoteService } class to handle business logic for retrieving and saving Quote
 * *******************************************************
 */
@Service
@RequiredArgsConstructor
public class MotivationService {
    private final MotivationRepository repository;

    public List<QuoteDto> getAllQuote(){
        return  repository.findAll().stream()
                .map(QuoteMapper::toDto).toList();
    }
}
