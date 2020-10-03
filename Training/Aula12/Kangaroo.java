package Training.Aula12;

public class Kangaroo extends Mammal {
  // Overriding Methods (1)
  @Override
  public void locomote() {
    System.out.println("Pulando");
  }



  // Abstract Methods
  public void usePurse() {
    System.out.println("Usando bolsa");
  }
}
