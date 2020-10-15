package Training.Things;

public class RemoteControllRun {
  public static void main(String[] args) {
    RemoteControl rc = new RemoteControl();
    rc.turnOn();
    rc.increaseVolume();
    rc.play();
    rc.muteVolume();
    rc.openMenu();
    rc.closeMenu();
  }
}
