package Training.Aula10;

public class Main {
  public static void main(String[] args) {
    // Intancing objects
    Person p1 = new Person();
    Student p2 = new Student();
    Teacher p3 = new Teacher();
    Employee p4 = new Employee();

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());



    // Superclass properties 
    p1.setName("Mauricio");
    p2.setName("Kenzo");
    p3.setName("Albuquerque");
    p4.setName("Kikuchi");

    p1.setGender("M");
    p2.setGender("M");
    p3.setAge(19);

  

    // Subclasses properties
    p2.setCourse("Business");
    p3.setSalary(2500.75);
    p4.setSector("Stock");
  }
}
