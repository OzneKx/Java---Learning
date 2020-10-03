package Training.Aula12;

public abstract class Animal {
  // Atributes set (3)
  protected float weight;
  protected int age;
  protected int members;



  // Abstract Methods (3)
  public abstract void locomote();
  public abstract void eat();
  public abstract void sound();



  // Special Methods (Getter && Setter) (6)
  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getMembers() {
    return members;
  }

  public void setMembers(int members) {
    this.members = members;
  }
}
