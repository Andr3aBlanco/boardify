package com.boardify.boardify.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table( name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String username;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String accountStatus;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles = new ArrayList<>();



    // AUTH ends here
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String country;
    private String state;
    private String zipCode;
    private String phone;

    private String stripeToken;
    private int subscriptionType;
    private String subscriptionEnd;
    private int won;
    private int joined;

    @OneToMany(mappedBy = "player")
    private Set<TournamentPlayer> tournamentPlayers;
}
