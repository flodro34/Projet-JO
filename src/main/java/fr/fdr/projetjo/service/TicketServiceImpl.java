package fr.fdr.projetjo.service;

import fr.fdr.projetjo.dto.OfferDTO;
import fr.fdr.projetjo.dto.TicketDTO;
import fr.fdr.projetjo.pojo.Offer;
import fr.fdr.projetjo.pojo.Ticket;
import fr.fdr.projetjo.pojo.User;
import fr.fdr.projetjo.repository.OfferRepository;
import fr.fdr.projetjo.repository.TicketRepository;
import fr.fdr.projetjo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public TicketDTO saveTicket(TicketDTO t) {

        return convertEntityToDTO(ticketRepository.save(convertDTOToEntity(t)));
    }

    @Override
    public TicketDTO updateTicket(TicketDTO t) {

        return convertEntityToDTO(ticketRepository.save(convertDTOToEntity(t)));
    }

    @Override
    public void deleteTicket(Ticket t) {
        ticketRepository.delete(t);
    }

    @Override
    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);

    }

    @Override
    public TicketDTO getTicket(Long id) {
        return convertEntityToDTO(ticketRepository.findById(id).get());
    }

    @Override
    public List<TicketDTO> getAllTickets() {

        return ticketRepository.findAll().stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    public List<TicketDTO> getAllTicketsByTokenUser(String tokenUser) {
        return ticketRepository.findAllByTokenUser(tokenUser).stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Ticket> findByUser(Long idUser) {
        User user = userRepository.findById(idUser).orElse(null);
        return ticketRepository.findByUser(user);
    }

    @Override
    public List<Ticket> findByOffer(Long idOffer) {
        Offer offer = offerRepository.findById(idOffer).orElse(null);
        return ticketRepository.findByOffer(offer);
    }

    @Override
    public TicketDTO convertEntityToDTO(Ticket ticket) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        TicketDTO ticketDTO = modelMapper.map(ticket, TicketDTO.class);

        return ticketDTO;

//        TicketDTO ticketDTO= new TicketDTO();
//        ticketDTO.setIdTicket(t.getIdTicket());
//        ticketDTO.setTokenTicket(t.getTokenTicket());
//        ticketDTO.setUser(t.getUser());
//        ticketDTO.setOffer(t.getOffer());
//        ticketDTO.setTokenUser(t.getTokenUser());
//        ticketDTO.setTokenTransaction(t.getTokenTransaction());
//
//        return ticketDTO;

//        return TicketDTO.builder()
//                .idTicket(t.getIdTicket())
//                .tokenTicket(t.getTokenTicket())
//                .tokenUser(t.getTokenUser())
//                .tokenTransaction(t.getTokenTransaction())
//                //.user(t.getUser())
//                //.offer(t.getOffer())
//                .typeOffer(t.getOffer().getType())
//                .build();

    }

    @Override
    public Ticket convertDTOToEntity(TicketDTO ticketDTO) {

        Ticket ticket = new Ticket();
        ticket = modelMapper.map(ticketDTO, Ticket.class);
        return ticket;

//        Ticket ticket = new Ticket();
//
//        ticket.setIdTicket(ticketDTO.getIdTicket());
//        ticket.setTokenTicket(ticketDTO.getTokenTicket());
//        ticket.setUser(ticketDTO.getUser());
//        ticket.setOffer(ticketDTO.getOffer());
//        ticket.setTokenUser(ticketDTO.getTokenUser());
//        ticket.setTokenTransaction(ticketDTO.getTokenTransaction());
//
//        return ticket;

    }
}
