package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="users")
public class Usuario {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="user_name")
    private String userName;
    @Column(name="password_hash")
    private String passwordHash;

    public Usuario(String userName, String passwordHash) {
        this.userName = userName;
        this.passwordHash = passwordHash;
    }

}
