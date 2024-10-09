package fr.fdr.projetjo.dto;

import fr.fdr.projetjo.pojo.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Long idUser;
    private String username;
    private String lastname;
    private String firstname;
    private String email;
    private String password;
    private String tokenUser;
    private boolean isAdmin;
    private List<Ticket> tickets;
}
