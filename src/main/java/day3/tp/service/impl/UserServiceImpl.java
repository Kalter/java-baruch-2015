package day3.tp.service.impl;

import day3.tp.dao.UserDao;
import day3.tp.domain.Guest;
import day3.tp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Transactional
    @Override
    public Guest register(Guest guest) {
        return userDao.register(guest);
    }

    @Override
    public Guest findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<Guest> findAll() {
        return userDao.findAll();
    }
}
