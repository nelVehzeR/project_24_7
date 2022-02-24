public class Main {
    public static void main(String[] args) {
        University psuti = new University(
                "PSUTI",
                "Поволжский государственный университет телекоммуникаций и информатики",
                "ПГУТИ",
                1953,
                StudyProfile.Spec.IT.getSpec()
        );

        Student s1 = new Student(
                "Яйцев Зайцеслав Ильич",
                "PSUTI",
                4,
                0.3f
        );

        System.out.println(psuti.toString());
        System.out.println(s1.toString());
    }
}
