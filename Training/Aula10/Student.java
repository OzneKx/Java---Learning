package Training.Aula10;

public class Student extends Person {
  // Atributes set (2)
  private int enrollmentNumber;
  private String course;



  // Abstract Methods (1)
  public void cancelEnrollment() {
    System.out.println("A matrícula será cancelada.");
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
