package fr.fdr.projetjo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OfferDTO {

    private Long idOffer;
    private String type;
    private Double price;
}