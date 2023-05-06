package com.example.springtickets.messages.requests;

import com.example.springtickets.models.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRegisterRequest {

    private String userName;

    private TicketType ticketType;

    private String event;

    private LocalDate eventDate;

}
