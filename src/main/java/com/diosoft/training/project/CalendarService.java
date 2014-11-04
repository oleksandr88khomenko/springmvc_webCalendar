package com.diosoft.training.project;


import com.diosoft.training.project.persistence.model.Event;

import java.util.List;

/**
 * Created by oleksandr_khomenko on 28.10.2014.
 */
public interface CalendarService {

     List<Event> listEvent();

    void add(Event event);

    void update(Event event);

    void remove(Event event);

//    List<Event> searchByTitle(String title);
//
//    List<Event> searchByDay(Date day);
}