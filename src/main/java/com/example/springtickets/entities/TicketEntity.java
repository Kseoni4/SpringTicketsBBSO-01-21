package com.example.springtickets.entities;

import com.example.springtickets.models.enums.TicketType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "ticket")
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ticketId;

    @Column(nullable = false)
    private LocalDate eventDate;

    @Column(nullable = false)
    private String eventName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TicketType ticketType;

    @Column(nullable = false)
    private UUID userId;

    private boolean isRedeemed;

}
