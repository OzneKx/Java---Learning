package Training.Aula12;

public class Fish extends Animal {
  // Atributes set (1)
  private String scaleColor;

  
  
  // Abstract Method (1)
  public void blowBubbles() {
    System.out.println("Soltando bolhas");
  }



  // Override Methods (3)
  @Override
  public void locomote() {
    System.out.println("Nadando");
  }

  @Override
  public void eat() {
    System.out.println("Comendo substâncias");
  }

  @Override
  public void sound() {
    System.out.println("Peixe não faz som");
  }



  // Special Methods (Getter && Setter) (2)
  public String getScaleColor() {
    return scaleColor;
  }

  public void setScaleColor(String scaleColor) {
    this.scaleColor = scaleColor;
  }
}
