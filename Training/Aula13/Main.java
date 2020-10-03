package Training.Aula13;

public class Main {
  public static void main(String[] args) {
    Dog d = new Dog();

    d.react("Olá");
    d.react("Vai apanhar");
    d.react(11, 45);
    d.react(21, 00);                                                          
    d.react(true);
    d.react(false);
    d.react(2, 12.5f);
    d.react(17, 4.5f);
  }
}