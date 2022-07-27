package StudentProfile;

public class Main {
    public static void main(String[] args) {
        StudentProfile AlenaK = new StudentProfile("Alena", "Krasheninnikova", "SOftware Dev", 500, 2022 );
        StudentProfile Pooja = new StudentProfile("Pooja", "Svatth", "Chemical Engineering", 500, 2010);

        int graduation_yearAlena = AlenaK.increment();
        System.out.println(graduation_yearAlena);

        System.out.println(AlenaK.firstname + " " + AlenaK.lastname + " " + AlenaK.major + " " + AlenaK.GPA + " " + AlenaK.graduation_year);



    }

}
