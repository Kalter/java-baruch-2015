package day3.tp.dao.impl;

import com.google.common.collect.ImmutableMap;
import day3.tp.dao.AbstractDAO;
import day3.tp.dao.UserDao;
import day3.tp.domain.Guest;
import day3.tp.util.QueryManager;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends AbstractDAO<Guest> implements UserDao {

    public UserDAOImpl() {
        super(Guest.class);
    }

    @Override
    public Guest register(Guest guest) {
        String sql = QueryManager.getQuery("day03/sql/insertGuest.ftl", ImmutableMap.of("guest", guest));
        Long id = save(sql);
        guest.setId(id);
        return guest;
    }

}
