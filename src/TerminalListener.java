import java.util.Scanner;

public class TerminalListener {
    private String command = "";
    private final Scanner scanner = new Scanner(System.in);
    public void listen() {
        do {
            System.out.print(">>> ");
            command = scanner.nextLine();
            switch (command) {
                case "login":
                    if (Authentication.getLoggedInUser() != null) {
                        System.out.println(Authentication.getLoggedInUser().getUsername() +
                                " is logged in right now. Logout and try logging in again.");
                        break;
                    }
                    System.out.print(">>> Are you an Organizer/Participant: ");
                    String type = scanner.nextLine().trim().toLowerCase();
                    if (validType(type)) {
                        loginUser(type);
                    }
                    break;

                case "logout":
                    Authentication.logout();
                    break;

                case "exit":
                    System.out.println("--------------------------------");
                    System.out.println("Thank you for using this System!");
                    System.out.println("--------------------------------");
                    break;
            }
        } while (!command.equals("exit"));
    }

    private boolean validType(String type) {
        if (!type.equals("participant") && !type.equals("organizer")) {
            System.err.print("! -- Enter valid type -- !");
            return false;
        }
        return true;
    }

    private void loginUser(String type) {
        System.out.print(">>> Username: ");
        String username = scanner.nextLine();
        System.out.print(">>> Password: ");
        String password = scanner.nextLine();
        try {
            if (type.equals("participant"))
                Authentication.loginParticipant(username, password);
            else
                Authentication.loginOrganiser(username, password);
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
