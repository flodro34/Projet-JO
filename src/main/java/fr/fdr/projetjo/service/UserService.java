package fr.fdr.projetjo.service;

import fr.fdr.projetjo.dto.UserDTO;
import fr.fdr.projetjo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);

    User saveWithToken(User user);
    //User findUserByToken(String tokenUser);

    UserDTO getUser (Long id);
    List<UserDTO> getAllUsers();

    void deleteUser(User u);
    void deleteUserById(Long id);

    boolean isValidTokenUser(String tokenUser);

    User authenticate(String username, String password);


    User findByUsername(String username);

    //User registerUser(RegistrationRequest request);
    public void sendEmailUser(User u, String code);
    public User validateToken(String code);

    UserDTO convertEntityToDTO(User u);
    User convertDTOToEntity(UserDTO userDTO);


}