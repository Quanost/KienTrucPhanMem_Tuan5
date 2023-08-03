package org.example.Singleton.DemoConection_Singleton;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    @Column( name = "user_email")
    private String userEmail;
    @Column( name = "user_name")
    private String userName;
    @Column( name = "user_password")
    private String userPassword;
    public User() {

    }
}
