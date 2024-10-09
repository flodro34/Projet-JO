package fr.fdr.projetjo.repository;

import fr.fdr.projetjo.pojo.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface OfferRepository extends JpaRepository<Offer, Long > {

}
