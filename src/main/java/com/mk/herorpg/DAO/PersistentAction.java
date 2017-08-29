package com.mk.herorpg.DAO;

import com.mk.herorpg.hero.Action;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "actions")
@Getter @Setter
public class PersistentAction extends Action{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "act")
    private String act;

    public PersistentAction(){}

    public PersistentAction(Action action) {
        act = action.toString();
    }

    @Override
    public String toString() {
        return act;
    }
}
