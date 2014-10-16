package models.DAO;

import java.util.ArrayList;

public abstract interface GenericDAO<ID, T> {
    
    public abstract void create(T entity);
    public abstract T read(ID id);
    public abstract void update(T entity);
    public abstract void delete(T entity);
    public abstract void deleteByID(ID id);
    public ArrayList<T> findAll();
    public ArrayList<T> findAll(int index, int size);

}
