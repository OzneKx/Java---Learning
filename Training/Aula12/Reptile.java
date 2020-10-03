package Training.Aula12;

public class Reptile extends Animal {
  // Atributes set (1)
  private String scaleColor;



  // Override Methods (3)
  @Override
  public void locomote() {
    System.out.println("Rastejando");
  }

  @Override
  public void eat() {
    System.out.println("Comendo vegetais");
  }

  @Override
  public void sound() {
    System.out.println("Som de réptil");
  }



  // Special Methods (Getter && Setter) (2)
  public String getScaleColor() {
    return scaleColor;
  }

  public void setScaleColor(String scaleColor) {
    this.scaleColor = scaleColor;
  }
}
