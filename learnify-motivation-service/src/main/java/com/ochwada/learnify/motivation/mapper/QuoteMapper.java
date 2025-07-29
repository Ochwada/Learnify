package com.ochwada.learnify.motivation.mapper;


import com.ochwada.learnify.motivation.dto.QuoteDto;
import com.ochwada.learnify.motivation.model.Quote;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.motivation.mapper
 * File: QuoteMapper.java
 * Author: Ochwada
 * Date: Tuesday, 29.Jul.2025, 9:22 AM
 * Description: Utility class for mapping {@link Quote} entities to {@link QuoteDto} data transfer objects.
 * *******************************************************
 */
/**
 * This class helps decouple the persistence layer from the presentation layer by converting entities to
 * DTOs suitable for external consumption (e.g., APIs).
 */

public class QuoteMapper {

    /**
     * Converts a {@link Quote} entity to a {@link QuoteDto}.
     *
     * @param quote the {@link Quote} entity to convert; must not be {@code null}
     * @return a new {@link QuoteDto} containing the quote's text and author
     */
    public static QuoteDto toDto(Quote quote){
        QuoteDto dto =  new QuoteDto();

        dto.setText(quote.getText());
        dto.setAuthor(quote.getAuthor());

        return dto;
    }
}
