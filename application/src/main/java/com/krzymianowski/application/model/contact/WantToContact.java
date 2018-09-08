package com.krzymianowski.application.model.contact;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "want_to_contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WantToContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "want_to_contact_id")
    private int id;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 30)
    @Column(name = "last_name")
    private String lastName;

    @Email
    @NotNull
    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @NotNull
    @Size(min = 30)
    @Column(name = "message")
    private String message;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contact_state_id")
    private ContactState state;

    @Column(name = "add_date")
    private LocalDate addDate;

}
