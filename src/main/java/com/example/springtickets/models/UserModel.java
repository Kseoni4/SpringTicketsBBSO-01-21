package com.example.springtickets.models;


import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserModel {

    private final UUID userId;

    private final String userName;

    private final LocalDate registerDate;

    private List<TicketModel> ownedTickets;


}
