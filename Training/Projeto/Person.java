package Training.Projeto;

public abstract class Person {
  // Atributes set (4)
  protected String name;
  protected int age;
  protected String gender;
  protected float experience;



  // Methods
  protected void ownXP() {

  }


  // Constructor Method
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.experience = 0;
  }

  

  // Special Methods (Getter && Setter) (8)
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

  public String isGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public float getExperience() {
    return experience;
  }

  public void setExperience(float experience) {
    this.experience = experience;
  }



  // toString()
  @Override
  public String toString() {
    return "Person [age=" + age + ", experience=" + experience + 
           ", gender=" + gender + ", name=" + name + "]";
  }
}
