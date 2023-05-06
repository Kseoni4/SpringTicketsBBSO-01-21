package com.example.springtickets.controllers;

import com.example.springtickets.messages.requests.TicketRegisterRequest;
import com.example.springtickets.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
@Slf4j
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    //localhost:8080/ticket/ticket_reg
    @PostMapping("/ticket_reg")
    HttpStatus ticketRegister(@RequestBody TicketRegisterRequest ticketRegisterRequest){
        log.info(ticketRegisterRequest.toString());
        ticketService.register(ticketRegisterRequest);
        return HttpStatus.OK;
    }

}
