package Training.Aula13;

public class Mammal extends Animal {
  //Atributes set (1)
  protected String furColor;



  // Overriding Methods (1)
  @Override
  public void sound() {
    System.out.println("Som de mamífero");
  }
}
