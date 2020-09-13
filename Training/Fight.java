package Training;

import java.util.Random;

public class Fight {
  // Attributes set (4)
  private Fighter challenged;
  private Fighter challenger;
  private int rounds;
  private boolean approved;

  // Methods (2)
  public void fightSchedule(Fighter f1, Fighter f2) {
    if (f1.getCategory().equals(f2.getCategory()) && f1 != f2) {
      this.approved = true;
      this.challenged = f1;
      this.challenger = f2;
    } else {
      this.approved = false;
      this.challenged = null;
      this.challenger = null;
    }
  }

  public void fighting() {
    if (this.approved) {
      System.out.println("    DESAFIADO    ");
      this.challenged.introduce();
      System.out.println("    DESAFIANTE    ");
      this.challenger.introduce();

      Random randomic = new Random();
      int winner = randomic.nextInt(3);
      switch(winner) {
        case 0:
          System.out.println("Tie!");
          this.challenged.tieFights();
          this.challenger.tieFights();
          break;     
        case 1:
          System.out.println(this.challenged + " won the fight!");
          this.challenged.winFights();
          this.challenger.loseFights();
          break;
        case 2:
        System.out.println(this.challenger + "  won the fight!");
          this.challenged.loseFights();
          this.challenger.winFights();
          break;
      }
    } else {
      System.out.println("A luta não pode acontecer!");
    }
  }

  // Special methods (8)
  public Fighter getChallenged() {
    return challenged;
  }

  public void setChallenged(Fighter challenged) {
    this.challenged = challenged;
  }

  public Fighter getChaller() {
    return challenger;
  }

  public void setChallenger(Fighter challenger) {
    this.challenger = challenger;
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
  }
}
