package Training;

public class Combat {
  public static void main(String[] args) {
    Fighter fight[] = new Fighter[6];

    fight[0] = new Fighter("A", "Pais1", 31, 1.75f, 68.9f, 11, 2, 1);

    fight[1] = new Fighter("B", "Pais2", 29, 1.68f, 57.8f, 14, 2, 3);

    fight[2] = new Fighter("C", "Pais3", 35, 1.65f, 80.9f, 12, 2, 1);

    fight[3] = new Fighter("D", "Pais4", 28, 1.93f, 81.6f, 13, 0, 2);

    fight[4] = new Fighter("E", "Pais5", 37, 1.70f, 119.3f, 5, 4, 3);
    
    fight[5] = new Fighter("F", "Pais6", 30, 1.81f, 105.7f, 12, 2, 4);

    Fight UEC01 = new Fight();
    UEC01.fightSchedule(fight[0], fight[1]);
    UEC01.fighting();
  }
}
