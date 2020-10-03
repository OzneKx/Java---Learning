package Training.Aula12;

public class Dog extends Mammal {
  // Overriding Methods (1)
  @Override
  public void sound() {
    System.out.println("Latindo");
  }



  // Abstract Methods
  public void buryBone() {
    System.out.println("Enterrando osso");
  }

  public void wagTail() {
    System.out.println("Abanando o rabo");
  }
}
