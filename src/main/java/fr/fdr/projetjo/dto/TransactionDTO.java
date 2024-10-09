package fr.fdr.projetjo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDTO {

    private Long idTransaction;
    private Double amount;
    private Date dateTransaction;
    private String tokenTransaction;
}
