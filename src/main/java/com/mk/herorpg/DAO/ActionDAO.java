package com.mk.herorpg.DAO;

import com.mk.herorpg.hero.Action;

import java.util.List;

public interface ActionDAO {

    void writeToDB (Action action);

    List<String> readFromDB();
}
