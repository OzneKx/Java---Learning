package Training.Aula12;

public class Mammal extends Animal {
  // Atributes set (2)
  private String furColor;

  // Override Methods (3)
  @Override
  public void locomote() {
    System.out.println("Correndo");
  }

  @Override
  public void eat() {
    System.out.println("Mamando");
  }

  @Override
  public void sound() {
    System.out.println("Som de mamífero");
  }

  // Special Methods (Getter && Setter) (2)
  public String getFurColor() {
    return furColor;
  }

  public void setFurColor(String furColor) {
    this.furColor = furColor;
  }
}
