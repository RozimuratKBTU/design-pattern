package Adapter;

public class DatabaseRun {
    public static void main(String[] args) {
        Database database = new AdapterDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
