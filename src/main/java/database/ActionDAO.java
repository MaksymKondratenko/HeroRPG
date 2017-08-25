package database;

import hero.Action;

import java.util.List;

public interface ActionDAO {

    void writeToDB (Action action);

    List<String> readFromDB();
}
