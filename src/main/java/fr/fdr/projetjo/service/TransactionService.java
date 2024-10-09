package fr.fdr.projetjo.service;

import fr.fdr.projetjo.dto.TransactionDTO;
import fr.fdr.projetjo.pojo.Transaction;

import java.util.List;

public interface TransactionService {

    TransactionDTO saveTransaction(TransactionDTO t);
    TransactionDTO updateTransaction(TransactionDTO t);

    TransactionDTO getTransaction(Long id);
    List<TransactionDTO> getAllTransactions();

    void deleteTransaction(Transaction t);
    void deleteTransactionById(Long id);


    TransactionDTO convertEntityToDTO(Transaction t);
    Transaction convertDTOToEntity(TransactionDTO TransactionDTO);
}
