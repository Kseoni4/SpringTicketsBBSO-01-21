package com.example.springtickets.service;

import com.example.springtickets.messages.requests.TicketRegisterRequest;

public interface TicketService {

    public void register(TicketRegisterRequest registerRequest);

}
