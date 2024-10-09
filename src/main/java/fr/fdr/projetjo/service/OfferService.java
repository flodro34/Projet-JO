package fr.fdr.projetjo.service;

import fr.fdr.projetjo.dto.OfferDTO;
import fr.fdr.projetjo.pojo.Offer;

import java.util.List;


public interface OfferService {
    OfferDTO saveOffer(OfferDTO o);
    OfferDTO updateOffer(OfferDTO o);

    OfferDTO getOffer (Long id);
    List<OfferDTO> getAllOffers();

    void deleteOffer(Offer o);
    void deleteOfferById(Long id);

    OfferDTO convertEntityToDTO(Offer o);
    Offer convertDTOToEntity(OfferDTO offerDTO);
}
