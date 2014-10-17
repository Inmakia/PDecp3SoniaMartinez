package models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<ID, T> implements GenericDAO<ID, T> {

    private Map<ID, T> database = new HashMap<ID, T>();

    public void create(T entity) {
        assert !this.database.containsKey(this.getID(entity));
        this.database.put(this.getID(entity), entity);
    }

    public T read(ID id) {
        assert !this.database.containsKey(id);
        return this.database.get(id);
    }

    public void update(T entity) {
        assert this.database.containsKey(this.getID(entity));
        this.database.put(this.getID(entity), entity);
    }

    public void delete(T entity) {
        assert this.database.containsKey(this.getID(entity));
        this.database.remove(entity);
    }

    public void deleteByID(ID id) {
        assert this.database.containsKey(id);
        this.database.remove(id);
    }

    public ArrayList<T> findAll() {
        return new ArrayList<T>(this.database.values());
    }

    public ArrayList<T> findAll(int index, int size) {
        assert index + size + 1 <= this.database.size();
        return new ArrayList<T>(new ArrayList<T>(this.database.values()).subList(index, index + size));
    }

    protected abstract ID getID(T entity);

}
