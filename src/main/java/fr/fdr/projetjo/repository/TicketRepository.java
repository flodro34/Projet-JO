package fr.fdr.projetjo.repository;

import fr.fdr.projetjo.pojo.Ticket;
import fr.fdr.projetjo.pojo.Offer;
import fr.fdr.projetjo.pojo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAllByTokenUser(String tokenUser);

    List<Ticket> findByUser(User user);

    List<Ticket> findByOffer(Offer offer);


}
