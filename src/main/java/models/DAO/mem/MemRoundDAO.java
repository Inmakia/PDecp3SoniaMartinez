package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Integer, Round> implements RoundDAO {

    @Override
    protected Integer getID(Round round) {
        return round.getId();
    }


}
