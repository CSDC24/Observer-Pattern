import observerPattern.Observeble.EventMoodle;
import observerPattern.Observeble.EventTypes;
import observerPattern.Observer.EventListenerImpl;
import observerPattern.Student;

public class Main {

    /**
     * John Doe follow to 3 Events and unfollow to one Event
     **/

    public static void main ( String[] args ) {

        EventMoodle eventMoodle = new EventMoodle ( "Prof. Gradinger" );

        Student student = new Student ( "John Doe" );

        EventListenerImpl eventListenerImpl = new EventListenerImpl ( student );

        eventMoodle.follow ( EventTypes.ZOOM_MEETING , eventListenerImpl );
        eventMoodle.follow ( EventTypes.FILES , eventListenerImpl );
        eventMoodle.follow ( EventTypes.GRADES , eventListenerImpl );

        eventMoodle.unfollow ( EventTypes.GRADES , eventListenerImpl );

        eventMoodle.publishFiles ( );
        eventMoodle.shareGrades ( );
        eventMoodle.startLiveStream ( );


    }
}
