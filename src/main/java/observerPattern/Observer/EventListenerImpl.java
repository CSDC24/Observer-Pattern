package observerPattern.Observer;

import observerPattern.Observeble.EventTypes;
import observerPattern.Student;

import java.util.Objects;

public class EventListenerImpl implements EventListener {

    public Student student;
    public String generatedEventTypeMessage;

    public EventListenerImpl ( Student student ) {

        this.student = student;
    }

    @Override
    public void update ( String eventType , String teacher ) {

        if (Objects.equals ( eventType , EventTypes.ZOOM_MEETING )) {
            generatedEventTypeMessage = " Started new ";
        } else if (Objects.equals ( eventType , EventTypes.FILES )) {
            generatedEventTypeMessage = " Shared new ";
        } else if (Objects.equals ( eventType , EventTypes.GRADES )) {
            generatedEventTypeMessage = " Grades are online ";
        }

        System.out.println ( " Dear " + this.student.getStudentName ( ) + ", " + teacher + generatedEventTypeMessage + eventType);

    }
}
