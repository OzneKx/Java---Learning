package Training.Things;

public class RemoteControl implements Controller {

  // Attributes set (3)
  private int volume;
  private boolean on;
  private boolean ringing;

  // Constructor Method
  public RemoteControl() {
    this.volume = 50;
    this.on = true;
    this.ringing = false;
  }

  // Special Methods (Getter && Setter)
  private int getVolume() {
    return volume;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean getOn() {
    return on;
  }

  private void isOn(boolean on) {
    this.on = on;
  }

  private boolean getRinging() {
    return ringing;
  }

  private void isRinging(boolean ringing) {
    this.ringing = ringing;
  }

  // Abstract Methods
  @Override
  public void turnOn() {
    this.isOn(true);
  }

  @Override
  public void turnOff() {
    this.isOn(false);
  }

  @Override
  public void openMenu() {
    System.out.println("=-=-= Menu =-=-=");
    System.out.println("Está ligado? " + this.getOn());
    System.out.println("Está tocando? " + this.getRinging());
    System.out.print("Volume: " + this.getVolume());
    for (int c = 0; c <= this.getVolume(); c+=10) {
      System.out.print("|");
    }
    System.out.println("");
  }

  @Override
  public void closeMenu() {
    System.out.println("Fechando menu...");
  }

  @Override
  public void increaseVolume() {
    if (this.getOn()) {
      this.setVolume(this.getVolume() + 5);
    } else {
      System.out.println("Impossível diminuir o volume, pois está desligado");
    }
  }

  @Override
  public void decreaseVolume() {
    if (this.getOn()) {
      this.setVolume(this.getVolume() - 5);
    } else {
      System.out.println("Impossível diminuir o volume, pois está desligado");
    }
  }

  @Override
  public void muteVolume() {
    if (this.getOn() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }

  @Override
  public void unmuteVolume() {
    if (this.getOn() && this.getVolume() == 0) {
      this.setVolume(50);
    }
  }

  @Override 
  public void play() {
    if (this.getOn() && !(this.getRinging())) {
      this.isRinging(true);
    } else {
      System.out.println("Não foi possível reproduzir.");
    }
  }

  @Override
  public void pause() {
    if (this.getOn() && this.getRinging()) {
      this.isRinging(false);
    } else {
      System.out.println("Não foi possível pausar.");
    }
  }
}