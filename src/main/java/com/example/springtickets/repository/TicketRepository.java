package com.example.springtickets.repository;

import com.example.springtickets.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, UUID> {

    Optional<TicketEntity> findByTicketId(UUID ticketId);

    List<TicketEntity> findAllByEventName(String eventName);

    List<TicketEntity> findAllByUserId(UUID userId);
}
