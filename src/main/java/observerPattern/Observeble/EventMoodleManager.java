package observerPattern.Observeble;

import observerPattern.Observer.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventMoodleManager {

    private final Map<String, List<EventListener>> listeners;

    public EventMoodleManager ( String... eventTypes ) {


        this.listeners = new HashMap<> ( );

        for (String eventType : eventTypes)
            this.listeners.put ( eventType , new ArrayList<> ( ) );
    }

    public void subscribe ( String eventType , EventListener eventListener ) {

        List<EventListener> students = this.listeners.get ( eventType );
        students.add ( eventListener );
    }

    public void unsubscribe ( String eventType , EventListener eventListener ) {

        List<EventListener> users = this.listeners.get ( eventType );
        users.remove ( eventListener );
    }

    public void notify ( String eventType , String displayName) {

        List<EventListener> students = this.listeners.get ( eventType );

        for (EventListener listener : students)
            listener.update ( eventType , displayName);
    }
}
