package Training.Aula9;

public class Person {
  // Atributes set(3)
  private String name;
  private int age;
  private String gender;



  // Constructor Method
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }



  // Special Methods (Getter && Setter)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }



  // Abstract Methods
  public void Birthday() {
    this.age++;
  }
}

