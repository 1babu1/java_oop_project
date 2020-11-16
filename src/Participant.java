import java.time.LocalDate;
import java.util.Date;

public class Participant extends AuthUser {
    private int userId;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dob;
    private String category;

    public Participant(int userId, String username, String password, String firstName, String lastName, char gender, LocalDate dob, String category) {
        super(username, password);
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.category = category;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant other = (Participant) o;
        return userId == other.userId &&
                gender == other.gender &&
                getUsername().equals(other.getUsername()) &&
                getPassword().equals(other.getPassword()) &&
                firstName.equals(other.firstName) &&
                lastName.equals(other.lastName) &&
                dob.equals(other.dob) &&
                category.equals(other.category);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "userId=" + userId +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", category='" + category + '\'' +
                '}';
    }
}
