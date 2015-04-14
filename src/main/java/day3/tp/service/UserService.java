package day3.tp.service;

import day3.tp.domain.Guest;

import java.util.List;

public interface UserService {
    Guest register(Guest guest);

    Guest findById(Long id);

    List<Guest> findAll();
}
