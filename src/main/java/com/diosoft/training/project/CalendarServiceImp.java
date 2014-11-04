package com.diosoft.training.project;

/**
 * Created by oleksandr_khomenko on 28.10.2014.
 */

import com.diosoft.training.project.persistence.model.Event;
import com.diosoft.training.project.persistence.EventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImp implements CalendarService {

    @Autowired
    private EventDAO eventDAO;

    public CalendarServiceImp(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Override
    public void add(Event event) {
        eventDAO.add(event);
    }

    @Override
    public List<Event> listEvent() {
       return eventDAO.listEvent();
    }

    @Override
    public void update(Event event) {
        eventDAO.update(event);
    }

    @Override
    public void remove(Event event) {
       eventDAO.remove(event);

    }


}
