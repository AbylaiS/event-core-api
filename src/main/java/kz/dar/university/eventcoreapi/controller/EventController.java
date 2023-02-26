package kz.dar.university.eventcoreapi.controller;

import kz.dar.university.eventcoreapi.model.EventModel;
import kz.dar.university.eventcoreapi.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private IEventService eventService;

    @PostMapping
    public void createEvent(@RequestBody @Valid EventModel event) {
        eventService.createEvent(event);
    }

    @GetMapping("/all")
    public List<EventModel> getAllEvent() {
        return eventService.getAllEvent();

    }

    @GetMapping("/{eventId}")
    public EventModel getEventById(@PathVariable String eventId) {
        return eventService.getEventById(eventId);
    }

    @PutMapping("/{eventId}")
    public void updateEvent(@PathVariable String eventId, @RequestBody EventModel event) {

        event.setName(eventId);
        event.setOrganization(eventId);
        event.setOrganization(eventId);
        eventService.updateEvent(event);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEventById(@PathVariable String eventId) {

        eventService.deleteEventById(eventId);

    }

}
