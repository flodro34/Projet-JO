package fr.fdr.projetjo.service;

import fr.fdr.projetjo.dto.TicketDTO;
import fr.fdr.projetjo.pojo.Ticket;

import java.util.List;

public interface TicketService {
    TicketDTO saveTicket(TicketDTO t);
    TicketDTO updateTicket(TicketDTO t);

    TicketDTO getTicket (Long id);
    List<TicketDTO> getAllTickets();
    List<TicketDTO> getAllTicketsByTokenUser(String tokenUser);

    void deleteTicket(Ticket t);
    void deleteTicketById(Long id);

    List<Ticket> findByUser(Long idUser);
    List<Ticket> findByOffer(Long idOffer);

    TicketDTO convertEntityToDTO(Ticket t);
    Ticket convertDTOToEntity(TicketDTO ticketDTO);
}
