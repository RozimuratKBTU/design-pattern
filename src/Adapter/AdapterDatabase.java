package Adapter;

public class AdapterDatabase extends JavaApp implements Database{
    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void remove() {
        removeObject();
    }

    @Override
    public void insert() {
        saveObject();
    }
}
