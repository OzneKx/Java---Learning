package Training;

public class ControlContinuation {
  public static void main(String[] args) {
    RemoteControl control = new RemoteControl();
    control.turnOn();
    control.increaseVolume();
    control.play();
    control.openMenu();
    control.closeMenu();
  }
}