package Training.Things;

public interface Controller {
  public abstract void turnOn();
  public abstract void turnOff();
  public abstract void openMenu();
  public abstract void closeMenu();
  public abstract void increaseVolume();
  public abstract void decreaseVolume();
  public abstract void muteVolume();
  public abstract void unmuteVolume();
  public abstract void play();
  public abstract void pause();
}
