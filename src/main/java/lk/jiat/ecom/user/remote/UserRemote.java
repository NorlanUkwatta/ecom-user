package lk.jiat.ecom.user.remote;

import jakarta.ejb.Remote;
import lk.jiat.ecom.user.dto.UserDTO;

import java.util.List;

@Remote
public interface UserRemote {
    UserDTO getUser(String username);

    UserDTO getUserByEmail(String email);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO);

    void deleteUser(Long id);

    List<UserDTO> getAllUsers();
}
