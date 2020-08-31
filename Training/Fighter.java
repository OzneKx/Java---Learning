package Training;

public class Fighter {
  // Attributes set (9)
  private String name;
  private String nationality;
  private int age;
  private float height;
  private float weight;
  private String category;
  private int victories;
  private int losses;
  private int ties;

  // Public methods (5)
  public void introduce() {
    System.out.println("IT'S TIMEEEEE!!!! This is " + this.getName());
    System.out.println("He cames from " + this.getNationality());
    System.out.println("He is: " + this.getAge() + " years old");
    System.out.println("His height: " + this.getHeight());
    System.out.println("His weight: " + this.getWeight());
    System.out.println(this.getVictories() + " victories");
    System.out.println(this.getLosses() + " losses");
    System.out.println(this.getTies() + " ties");
  }

  public void status() {
    System.out.println(this.getName() + "is " + this.getCategory());
    System.out.println("Number of victories: " + this.getVictories());
    System.out.println("Number of losses: " + this.getLosses());
    System.out.println("Number of ties: " + this.getTies());
  }

  public void winFights() {
    this.setVictories(this.getVictories() + 1);
  }

  public void loseFights() {
    this.setLosses(this.getLosses() + 1);
  }

  public void tieFights() {
    this.setTies(this.getTies() + 1);
  }

  // Special methods
  // Constructor method
  public Fighter(String name, String nationality, int age, float height, float weight, int victories, int losses, int ties) {
    this.name = name;
    this.nationality = nationality;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.victories = victories;
    this.losses = losses;
    this.ties = ties;
  }

  // Getter methods (8)
  public String getName() {
    return this.name;
  }

  public String getNationality() {
    return this.nationality;
  }

  public int getAge() {
    return this.age;
  }

  public float getHeight() {
    return this.height;
  }

  public float getWeight() {
    return this.weight;
  }

  public String getCategory() {
    return this.category;
  }

  public int getVictories() {
    return this.victories;
  }

  public int getLosses() {
    return this.losses;
  }

  public int getTies() {
    return this.ties;
  }

  // SETTER methods (8)
  public void setName(String name) {
    this.name = name;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public void setWeight(float weight) {
    this.weight = weight;
    this.setCategory();
  }

  private void setCategory() {
    if (this.weight < 52.2) {
      this.category = "Invalid weight";
    } else if (this.weight <= 70.3) {
      this.category = "Ligthweight";
    } else if (this.weight <= 83.9) {
      this.category = "Mediumweight";
    } else if (this.weight <= 120.2) {
      this.category = "Heavyweight";
    } else {
      this.category = "Invalid weight";
    }
  }

  public void setVictories(int victories) {
    this.victories = victories;
  }

  public void setLosses(int losses) {
    this.losses = losses;
  }

  public void setTies(int ties) {
    this.ties = ties;
  }
}