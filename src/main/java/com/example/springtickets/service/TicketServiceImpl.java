package com.example.springtickets.service;

import com.example.springtickets.dao.UserDao;
import com.example.springtickets.entities.TicketEntity;
import com.example.springtickets.entities.UserEntity;
import com.example.springtickets.messages.requests.TicketRegisterRequest;
import com.example.springtickets.repository.TicketRepository;
import com.example.springtickets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    private final UserDao userDao;
    @Override
    public void register(TicketRegisterRequest registerRequest) {
        TicketEntity ticket = TicketEntity.builder()
                .userId(
                        userDao.getUserIdByName(registerRequest.getUserName())
                )
                .ticketType(registerRequest.getTicketType())
                .eventName(registerRequest.getEvent())
                .eventDate(registerRequest.getEventDate())
                .isRedeemed(false).build();

        TicketEntity savedTicket = ticketRepository.save(ticket);

        log.info("Зарегистрирован билет: {}", savedTicket);
    }
}
