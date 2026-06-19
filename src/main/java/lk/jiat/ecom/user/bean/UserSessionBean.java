package lk.jiat.ecom.user.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ecom.user.dto.UserDTO;
import lk.jiat.ecom.user.remote.UserRemote;

import java.util.List;

@Stateless
public class UserSessionBean implements UserRemote {

    @Override
    public UserDTO getUser(String username) {
        return new UserDTO();
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return new UserDTO();
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return new UserDTO();
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return new UserDTO();
    }

    @Override
    public void deleteUser(Long id) {
        System.out.println("UserSessionBean: deleteUser");
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
