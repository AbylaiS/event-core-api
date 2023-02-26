package kz.dar.university.eventcoreapi.service;

import kz.dar.university.eventcoreapi.model.EventModel;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EventService implements IEventService {

    private static final HashMap<String, EventModel> eventMap = new HashMap<>();

    static {
        EventModel event = new EventModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString());
        eventMap.put(event.getName(), event);


    }


    @Override
    public void createEvent(EventModel event) {
        eventMap.put(event.getName(), event);

    }

    @Override
    public List<EventModel> getAllEvent() {
        return eventMap.values().stream().toList();
    }

    @Override
    public EventModel getEventById(String eventId) {
        return eventMap.get(eventId);

    }

    @Override
    public void updateEvent(EventModel event) {
        String eventId = event.getName();
        String eventId1 = event.getOrganization();
        String eventId2 = event.getPlace();
        eventMap.put(eventId, event);
        eventMap.put(eventId1, event);
        eventMap.put(eventId2, event);

    }

    @Override
    public void deleteEventById(String eventId) {

        eventMap.remove(eventId);

    }
}
