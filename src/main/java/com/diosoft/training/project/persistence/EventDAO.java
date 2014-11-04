package com.diosoft.training.project.persistence;

import com.diosoft.training.project.persistence.model.Event;

import java.util.List;

/**
 * Created by oleksandr_khomenko on 28.10.2014.
 */
public interface EventDAO {

    List<Event> listEvent();

    void add(Event event);

    void update(Event event);

    void remove(Event event);

//    Map<UUID,Event>
//    Map<String, List<UUID>>
//    Map<Date, List<UUID>>


}
