package com.example.StudentCardMappingDemo.repository;

import com.example.StudentCardMappingDemo.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}
