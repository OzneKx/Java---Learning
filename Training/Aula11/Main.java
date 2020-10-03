package Training.Aula11;

public class Main {
  public static void main(String[] args) {
    Teacher t1 = new Teacher();
    t1.setName("Kenzo");
    t1.setAge(19);
    t1.setGender("M");

    Student s1 = new Student();
    s1.setName("Mauricio");
    s1.setAge(19);
    s1.setGender("M");
    s1.setCourse("IT");

    Bursar b1 = new Bursar();
    b1.setName("Albuquerque");
    b1.setAge(19);
    b1.setGender("M");
    b1.setScholarship(12.5f); 
    b1.payTuition();

    System.out.println(t1.toString());
    System.out.println(s1.toString());
    System.out.println(b1.toString());
  }
}
