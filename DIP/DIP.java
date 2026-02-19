package SOLID.DIP;

public class DIP {
    public static void main(String[] args) {
        Client c1 = new Client(new sqlDB());
        c1.storeData("Ayushman Verma");
        Client c2 = new Client(new MongoDB());
        c2.storeData("Ayushi Verma");
    }
}

class Client {
    private Database db;

    public Client(Database db) {
        this.db = db;
    }

    public void storeData(String data){
        db.save(data);
    }
}

abstract class Database{
    public abstract void save(String data);
}

class sqlDB extends Database{
    @Override
    public void save(String data) {
        System.out.println(data + " is Saved to SQL Database.");
    }
}

class MongoDB extends Database{
    @Override
    public void save(String data) {
        System.out.println(data + " is Saved to Mongo Database.");
    }
}

