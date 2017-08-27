package com.mk.herorpg.DAO;

import com.mk.herorpg.config.HibernateConnector;
import com.mk.herorpg.hero.Action;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Setter
public class DBReader extends Action {
    @Autowired
    @Qualifier("hibernateConnector")
    private HibernateConnector hConnector;

    public void read(){
        List<Action> ls = hConnector.read();
        System.out.println("#   Actions");
        for(int i = 0; i < ls.size(); i++)
            System.out.println(i + 1 + ":  " + ls.get(i));
    }

    @Override
    public String toString(){
        return "Recalling, what was doing";
    }
}
