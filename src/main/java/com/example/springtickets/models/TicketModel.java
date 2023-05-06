package com.example.springtickets.models;


import com.example.springtickets.models.enums.TicketType;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class TicketModel {

    private final UUID ticketId;

    private final String event;

    private final LocalDate eventDate;

    private final UserModel ticketOwner;

    private final TicketType ticketType;

    private boolean isRedeemed;


}
