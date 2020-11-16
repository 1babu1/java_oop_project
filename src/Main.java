import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Participant p1 = new Participant(
                1,
                "manav",
                "password",
                "Manav",
                "Patnaik",
                'M',
                date,
                "Student"
                );
        Participant p2 = new Participant(
                2,
                "gaurav",
                "password",
                "Gaurav",
                "Patnaik",
                'M',
                LocalDate.now(),
                "Manager"
        );

//        UsersDB.addParticipant(p1);
//        UsersDB.printParticipants();
//        UsersDB.addParticipant(p2);
//        UsersDB.printParticipants();

        Organiser organiser = new Organiser(
                1,
                "msoft",
                "password",
                "Microsoft",
                "USA");

        UsersDB.addOrganiser(organiser);
        UsersDB.printOrganisers();
    }
}
