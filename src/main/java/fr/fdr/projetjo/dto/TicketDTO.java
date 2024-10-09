package fr.fdr.projetjo.dto;

import fr.fdr.projetjo.pojo.Offer;
import fr.fdr.projetjo.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDTO {

    private Long idTicket;
    private Offer typeOffer;
    private Date date;
    private String tokenTicket;
    private String tokenUser;
    private String tokenTransaction;
    private User user;
}
