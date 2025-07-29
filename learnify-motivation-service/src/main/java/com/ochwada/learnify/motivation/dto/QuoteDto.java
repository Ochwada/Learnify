package com.ochwada.learnify.motivation.dto;


import lombok.Data;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.motivation.dto
 * File: QuoteDto.java
 * Author: Ochwada
 * Date: Tuesday, 29.Jul.2025, 9:18 AM
 * Description: Data Transfer Object (DTO) for transferring quote data between layers (e.g., Controller <-> Service).
 * *******************************************************
 */

@Data
public class QuoteDto {
    /**
     * The content of the motivational quote.
     */
    private String text;

    /**
     * The author of the quote.
     */
    private String author;
}
