package Training.Aula11;

public class Student extends Person {
  // Atributes set (2)
  private int enrollmentNumber;
  private String course;



  // Abstract methods (1)
  public void payTuition() {
    System.out.println("Pagando mensalidade de " + this.getName());
  }



  // Special Methods (Getter && Setter) (4)
  public int getEnrollmentNumber() {
    return enrollmentNumber;
  }

  public void setEnrollmentNumber(int enrollmentNumber) {
    this.enrollmentNumber = enrollmentNumber;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }
}
