package fr.fdr.projetjo.pojo;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffer;

    private String type;

    private Double price;


}
