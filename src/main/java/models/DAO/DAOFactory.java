package models.DAO;

public abstract class DAOFactory {

    private static DAOFactory factory;
    
    public DAOFactory() {
        
    }

    public static DAOFactory getDAOFactory() {
        assert factory != null;
        return factory;
    }
    
    public static void setDAOFactory(DAOFactory f) {
        factory = f;
    }

    public abstract UserDAO getUserDAO();

    public abstract RoundDAO getRoundDAO();
}
