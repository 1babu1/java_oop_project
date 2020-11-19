public class Authentication {
    private AuthUser loggedInUser = null;

    public AuthUser getLoggedInUser() {
        return loggedInUser;
    }

    public void loginParticipant(String username, String password) {
        Participant participant = UsersDB.getParticipant(username);
        if (loggedInUser == null) {
            if (participant == null) {
                throw new IllegalArgumentException("User with username does not exist");
            } else if (!participant.getPassword().equals(password)) {
                throw new IllegalArgumentException("Invalid password");
            } else {
                System.out.println("Successfully logged in: " + username);
                loggedInUser = participant;
            }
        } else {
            System.out.println(loggedInUser.getUsername() + " is logged in right now.");
        }
    }

    public void logout() {
        loggedInUser = null;
    }

    public void loginOrganiser(String username, String password) {
        Organiser organiser = UsersDB.getOrganiser(username);
        if (loggedInUser == null) {
            if (organiser == null) {
                throw new IllegalArgumentException("Organiser with the username does not exist");
            } else if (!organiser.getPassword().equals(password)) {
                throw new IllegalArgumentException("Invalid password");
            } else {
                System.out.println("Successfully logged in: " + username);
                loggedInUser = organiser;
            }
        } else {
            System.out.println(loggedInUser.getUsername() + " is logged in right now");
        }
    }

}
