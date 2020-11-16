import java.util.ArrayList;

public class UsersDB {
    private static final ArrayList<Participant> participants = new ArrayList<>();
    private static final ArrayList<Organiser> organisers = new ArrayList<>();

    public static Participant getParticipant(int id) {
        for (Participant participant : participants) {
            if (participant.getUserId() == id)
                return participant;
        }
        return null;
    }

    public static Participant getParticipant(String username) {
        for (Participant participant : participants) {
            if (participant.getUsername().equals(username))
                return participant;
        }
        return null;
    }

    // This method assumes that the participant is present for sure
    private static int getParticipantIndex(int id) {
        for (int i = 0; i < participants.size(); i++) {
            if (participants.get(i).getUserId() == id)
                return i;
        }
        return -1;
    }

    public static boolean updateParticipant(int id, Participant p) {
        if (!participantExists(id)) {
            System.err.println("Participant with id: " + id + " does not exist.");
            return false;
        }
        else {
            int participantIndex = getParticipantIndex(id);
            participants.remove(participantIndex);
            participants.add(participantIndex, p);
        }
        return true;
    }

    public static void addParticipant(Participant p) {
        if (participantExists(p.getUserId())) {
            System.err.println("Participant with id: " + p.getUserId() + " already exists.");
            return;
        }
        participants.add(p);
    }

    private static boolean participantExists(int id) {
        return getParticipant(id) != null;
    }

    public static boolean deleteParticipant(int id) {
        if (!participantExists(id)) {
            System.err.println("Participant with id: " + id + " not found. Cannot be deleted");
            return false;
        }
        else {
            participants.remove(getParticipantIndex(id));
            return true;
        }
    }

    public static void printParticipants() {
        System.out.println("ID\tUsername\tFirst Name\tLast Name\tGender\tDOB\t\t\tCategory");
        for (Participant participant : participants) {
            System.out.println(
                    participant.getUserId() + "\t" +
                    participant.getUsername() + "\t\t" +
                    participant.getFirstName() + "\t\t" +
                    participant.getLastName() + "\t\t" +
                    participant.getGender() + "\t\t" +
                    participant.getDob() + "\t" +
                    participant.getCategory() + "\t"
                    );
        }
    }

    public static Organiser getOrganiser(int id) {
        for (Organiser organiser : organisers) {
            if (organiser.getOrganiserId() == id)
                return organiser;
        }
        return null;
    }

    public static Organiser getOrganiser(String username) {
        for (Organiser organiser : organisers) {
            if (organiser.getUsername().equals(username))
                return organiser;
        }
        return null;
    }

    // This method assumes that the organiser is present for sure
    private static int getOrganiserIndex(int id) {
        for (int i = 0; i < organisers.size(); i++) {
            if (organisers.get(id).getOrganiserId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static boolean updateOrganiser(int id, Organiser o) {
        if (!organiserExists(id)) {
            System.err.println("Organiser with id: " + id + " does not exist.");
            return false;
        }
        else {
            int organiserIndex = getOrganiserIndex(id);
            organisers.remove(organiserIndex);
            organisers.add(organiserIndex, o);
        }
        return true;
    }

    public static void addOrganiser(Organiser o) {
        if (organiserExists(o.getOrganiserId())) {
            System.err.println("Participant with id: " + o.getOrganiserId() + " already exists.");
            return;
        }
        organisers.add(o);
    }

    private static boolean organiserExists(int id) {
        return getOrganiser(id) != null;
    }

    public static boolean deleteOrganiser(int id) {
        if (!organiserExists(id)) {
            System.err.println("Organiser with id: " + id + " not found. Cannot delete.");
            return false;
        }
        else {
            organisers.remove(getOrganiserIndex(id));
            return true;
        }
    }

    public static void printOrganisers() {
        System.out.println("ID\tUsername\tName\t\tLocation\tEvents Conducted");
        for (Organiser organiser : organisers) {
            System.out.println(
                    organiser.getOrganiserId() + "\t" +
                            organiser.getUsername() + "\t\t" +
                            organiser.getOrganiserName() + "\t\t" +
                            organiser.getOrganiserLocation() + "\t\t\t" +
                            organiser.getEventsConducted()
            );
        }
    }
}
