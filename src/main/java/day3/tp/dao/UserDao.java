package day3.tp.dao;

import day3.tp.domain.Guest;

import java.util.List;

public interface UserDao {

    Guest register(Guest guest);

    Guest findById(Long id);

    List<Guest> findAll();
}
