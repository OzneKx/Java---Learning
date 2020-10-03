package Training.Aula12;

public class Bird extends Animal {
  // Atributes set (1)
  private String featherColor;

  
  
  // Abstract Methods (1)
  public void builtNest() {
    System.out.println("Fazendo ninho");
  }



  // Override Methods (3)
  @Override
  public void locomote() {
    System.out.println("Voando");
  }

  @Override
  public void eat() {
    System.out.println("Comendo frutas");
  }

  @Override
  public void sound() {
    System.out.println("Som de ave");
  }



  // Special Methods (Getter && Setter) (2)
  public String getFeatherColor() {
    return featherColor;
  }

  public void setFeatherColor(String featherColor) {
    this.featherColor = featherColor;
  }
}
