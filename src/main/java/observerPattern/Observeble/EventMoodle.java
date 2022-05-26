package observerPattern.Observeble;

import observerPattern.Observer.EventListenerImpl;

public class EventMoodle {

    private String displayName;
    private EventMoodleManager eventMoodleManager;

    public EventMoodle ( String displayName ) {

        this.displayName = displayName;
        this.eventMoodleManager = new EventMoodleManager ( EventTypes.ZOOM_MEETING , EventTypes.FILES, EventTypes.GRADES );

    }

    public void follow ( String eventType , EventListenerImpl listener ) {
        this.eventMoodleManager.subscribe ( eventType , listener );
    }

    public void unfollow ( String eventType , EventListenerImpl listener ) {
        this.eventMoodleManager.unsubscribe ( eventType , listener );
    }

    public void startLiveStream ( ) {
        this.eventMoodleManager.notify ( EventTypes.ZOOM_MEETING , this.displayName );
    }

    public void publishFiles ( ) {
        this.eventMoodleManager.notify ( EventTypes.FILES , this.displayName );
    }

    public void shareGrades ( ){
        this.eventMoodleManager.notify ( EventTypes.GRADES, this.displayName);
    }
}
