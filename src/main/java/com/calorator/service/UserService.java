package com.calorator.service;

import com.calorator.dto.UserDTO;

import java.util.List;

public interface UserService {
    void save(UserDTO userDTO);
    UserDTO findById(Long id);
    UserDTO findByName(String name);
    void update(UserDTO userDTO);
    List<UserDTO> findAll();
    void delete(Long id);
}
