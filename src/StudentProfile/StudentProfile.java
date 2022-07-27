package StudentProfile;

public class StudentProfile {
    String firstname;
    String lastname;
    String major;
    double GPA;
    int graduation_year;

    public StudentProfile(String firstname, String lastname, String major, double GPA, int graduation_year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.GPA = GPA;
        this.graduation_year = graduation_year;
    }

    public int increment() {
        return (this.graduation_year + 1);
    }

    }

