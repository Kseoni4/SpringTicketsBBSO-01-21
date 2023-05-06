package com.example.springtickets;

import com.example.springtickets.entities.UserEntity;
import com.example.springtickets.repository.TicketRepository;
import com.example.springtickets.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final UserRepository userRepository;

    private final TicketRepository ticketRepository;

    @PostConstruct
    void generate(){
        createUsers();
    }

    private void createUsers(){
        UserEntity testUser = UserEntity.builder()
                .userId(UUID.randomUUID())
                .registerDate(LocalDate.now())
                .name("Вася")
                .build();

        userRepository.save(testUser);
    }
}
