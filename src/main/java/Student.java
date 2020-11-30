public class Student extends Person {
    int yearsOfStudy;
    double averageScore;

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student() {
        super();
        yearsOfStudy = 0;
        averageScore = 0.0;
    }

    public Student(String firstName, String secondName, String midName) {
        super(firstName, secondName, midName);
        yearsOfStudy = 0;
        averageScore = 0.0;
    }

    public Student(String firstName, String secondName, String midName, int age) {
        super(firstName, secondName, midName, age);
        yearsOfStudy = 0;
        averageScore = 0.0;
    }

    public Student(String firstName, String secondName, String midName,
                   int age, int yearsOfStudy, double averageScore) {
        super(firstName, secondName, midName, age);
        this.yearsOfStudy = yearsOfStudy;
        this.averageScore = averageScore;
    }

    public void print() {
        System.out.println("--- Class Student ---");
        System.out.println("Name: " + firstName + " " + midName + " " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Years of study: " + yearsOfStudy);
        System.out.println("Score: " + averageScore + "\n");
    }
}
