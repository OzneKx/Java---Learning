package Training.Aula11;

public class Teacher extends Person {
  // Atributes set (2)
  private String speciality;
  private double salary;
  


  // Abstract Methods (1)
  public void receiveRaise() {
    System.out.println("Recebendo aumento.");
  }



  // Special Methods (Getter && Setter) (4)
  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
