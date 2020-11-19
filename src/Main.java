import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();
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

        UsersDB.addParticipant(p1);
        UsersDB.addParticipant(p2);

        Organiser organiser = new Organiser(
                1,
                "msoft",
                "password",
                "Microsoft",
                "USA");

        UsersDB.addOrganiser(organiser);
        try {
            authentication.loginParticipant("manav", "password");
            authentication.loginParticipant("gaurav", "password");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
