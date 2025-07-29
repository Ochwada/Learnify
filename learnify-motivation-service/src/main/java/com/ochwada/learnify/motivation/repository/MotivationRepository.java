package com.ochwada.learnify.motivation.repository;


import com.ochwada.learnify.motivation.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * *******************************************************
 * Package: com.ochwada.learnify.motivation.repository
 * File: MotivationRepository.java
 * Author: Ochwada
 * Date: Tuesday, 29.Jul.2025, 9:15 AM
 * Description: Repository interface for managing {@link Quote} entities. Provides CRUD operations and query support
 *  * via Spring Data JPA.
 * *******************************************************
 */


public interface MotivationRepository extends JpaRepository<Quote, Long> {
    /**
     *  Extends {@link JpaRepository}, allowing standard CRUD operations without implementing any methods.
     */
}
