package com.example.springtickets.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate registerDate;

    @OneToMany
    @JoinColumn(name = "userId")
    private List<TicketEntity> tickets;
}
