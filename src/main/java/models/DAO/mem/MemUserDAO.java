package models.DAO.mem;

import models.DAO.UserDAO;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<Integer, User> implements UserDAO {

    @Override
    protected Integer getID(User user) {
        return user.getId();
    }

}
