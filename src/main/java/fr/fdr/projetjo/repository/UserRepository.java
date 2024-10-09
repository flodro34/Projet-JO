package fr.fdr.projetjo.repository;

import fr.fdr.projetjo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    Optional<User> findByEmail(String email);
    //User findUserByToken(String tokenUser);

    User findByUsernameAndPassword(String username, String password);

}
