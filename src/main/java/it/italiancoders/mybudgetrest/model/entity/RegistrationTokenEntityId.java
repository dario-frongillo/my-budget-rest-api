package it.italiancoders.mybudgetrest.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationTokenEntityId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String token;

    private String username;
}
