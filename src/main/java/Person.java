public class Person {
    //Внутреннее состояние объекта Person
    String firstName;
    String secondName;
    String midName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        firstName = "";
        secondName = "";
        midName = "";
        age = 0;
    }

    public Person(String firstName, String secondName, String midName) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.midName = midName;

        age = 0;
    }

    public Person(String firstName, String secondName, String midName, int age) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.midName = midName;

        this.age = age;
    }

    public void print() {
        System.out.println("--- Class Person ---");
        System.out.println("Name: " + firstName + " " + midName + " " + secondName);
        System.out.println("Age: " + age + "\n");
    }
}
