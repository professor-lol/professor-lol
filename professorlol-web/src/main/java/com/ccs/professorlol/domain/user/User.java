package com.ccs.professorlol.domain.user;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;//google email

    @Column(unique = true)
    private String lolId;//lol id

    @Column
    @NotBlank
    private String name;

    @Column
    private String picture;

    @Builder(builderMethodName = "createBuilder")
    public User(String email, String lolId, @NotBlank String name, String picture) {
        this.email = email;
        this.lolId = lolId;
        this.name = name;
        this.picture = picture;
    }
}
