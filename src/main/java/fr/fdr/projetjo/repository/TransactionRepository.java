package fr.fdr.projetjo.repository;

import fr.fdr.projetjo.pojo.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}
