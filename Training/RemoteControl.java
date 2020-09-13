package Training;

public class RemoteControl implements Controller {
  // Attributes set
  private int volume;
  private boolean onOrOff;
  private boolean ringingOrNot;

  // Special methods
  public RemoteControl() {
    this.volume = 50;
    this.onOrOff = true;
    this.ringingOrNot = false;
  }

  // GETTER methods
  private int getVolume() {
    return volume;
  }

  private boolean isOnOrOff() {
    return onOrOff;
  }

  private boolean ringingOrNot() {
    return ringingOrNot;
  }

  // SETTER methods
  private void setVolume(int volume) {
    this.volume = volume;
  }

  private void isOnOrOff(boolean on) {
    this.onOrOff = on;
  }

  // Abstract methods
  @Override
  public void turnOn(){ 
    this.isOnOrOff(true);
  }

  @Override
  public void turnOff() {
    this.isOnOrOff(false);
  } 

  @Override 
  public void openMenu(){
    System.out.println("---- MENU ----");
    System.out.println("Ligado? " + this.isOnOrOff());
    System.out.println("Tocando? " + this.ringingOrNot());
    System.out.println("Volume: " + this.getVolume());
    for (int i = 0; i <= this.getVolume(); i+=10) {
      System.out.println("|");
    }
    System.out.println("");
  }

  @Override
  public void closeMenu() {
    System.out.println("Fechando menu...");
  }

  @Override
  public void increaseVolume() {
    if (this.isOnOrOff()) {
      this.setVolume(getVolume() + 5);
      System.out.println("Volume aumentado.");
    } else {
      System.out.println("Impossível aumentar o volume.");
    }
  }

  @Override
  public void decreaseVolume() {
    if (this.isOnOrOff()) {
      this.setVolume(getVolume() - 5);
      System.out.println("Volume diminuido.");
    } else {
      System.out.println("Impossível diminuir o volume.");
    }
  }

  @Override
  public void muteVolume() {
    if (this.isOnOrOff() && this.getVolume() > 0) {
      this.setVolume(0);
      System.out.println("O volume está mudo.");
    }
  }

  @Override
  public void unmuteVolume() {
    if (this.isOnOrOff() && this.getVolume() == 0) {
      this.setVolume(50);
      System.out.println("O volume voltou para a amplitude inicial.");
    }
  }

  @Override
  public void play() {
    if (this.isOnOrOff() && !(this.ringingOrNot())) {
      this.isOnOrOff(true);
      System.out.println("Está tocando.");
    } else {
      System.out.println("Não foi possível reproduzir.");
    }
   }

  @Override
  public void pause() {
    if (this.isOnOrOff() && (this.ringingOrNot())) {
      this.isOnOrOff(false);
      System.out.println("Não está tocando.");
    } else {
      System.out.println("Não foi possível pausar.");
    }
  }
}