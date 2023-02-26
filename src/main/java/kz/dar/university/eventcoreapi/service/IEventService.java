package kz.dar.university.eventcoreapi.service;

import kz.dar.university.eventcoreapi.model.EventModel;

import java.util.List;

public interface IEventService {
    void createEvent(EventModel event);

    List<EventModel> getAllEvent();

    EventModel getEventById(String eventId);

    void updateEvent(EventModel event);

    void deleteEventById(String eventId);
}
