package fr.fdr.projetjo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;

    private Double amount;

    private Date dateTransaction;

    private String tokenTransaction;

    public Transaction(Double amount, Date dateTransaction, String tokenTransaction) {
        this.amount = amount;
        this.dateTransaction = dateTransaction;
        this.tokenTransaction = tokenTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", amount=" + amount +
                ", dateTransaction=" + dateTransaction +
                ", tokenTransaction='" + tokenTransaction + '\'' +
                '}';
    }
}
