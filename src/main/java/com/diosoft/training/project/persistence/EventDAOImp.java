package com.diosoft.training.project.persistence;

import com.diosoft.training.project.persistence.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by oleksandr_khomenko on 29.10.2014.
 */
@Repository
public class EventDAOImp implements EventDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Event> listEvent() {
        return null;
    }

    @Override
    public void add(Event event) {

    }

    @Override
    public void update(Event event) {

    }

    @Override
    public void remove(Event event) {

    }
}
