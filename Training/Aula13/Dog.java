package Training.Aula13;

public class Dog extends Wolf {
  // Overriding Methods (1)
  @Override
  public void sound() {
    System.out.println("AU AU AU");
  }



  // Abstract Methods (4)
  public void react(String phrase) {
    if (phrase.equals("Toma comida") || phrase.equals("Olá")) {
      System.out.println("Abanar e latir");
    } else {
      System.out.println("Rosnar");
    }
  }

  public void react(int hour, int minutes) {
    if (hour < 12) {
      System.out.println("Abanar rabo");
    } else if (hour >= 18) {
      System.out.println("Ignorar");
    } else {
      System.out.println("Abanar e Latir");
    }
  }

  public void react(boolean owner) {
    if (owner) {
      System.out.println("Abanar rabo");
    } else {
      System.out.println("Rosnar e latir");
      this.sound();
    }
  }

  public void react(int age, float weigth) {
    if (age < 5) {
      if (weigth < 10) {
        System.out.println("Abanar rabo");
      } else {
        System.out.println("Latir");
      }
    } else {
      if (weigth < 10) {
        System.out.println("Rosnar");
      } else {
        System.out.println("Ignorar");
      }
    }
  }
}
