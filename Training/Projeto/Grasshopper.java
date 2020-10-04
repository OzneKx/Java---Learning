package Training.Projeto;

public class Grasshopper extends Person {
  // Atributes set (2)
  private String login;
  private int totalViews;



  // Methods
  public void watchedOneMore() {

  }


  // Constructor Method
  public Grasshopper(String name, int age, String gender, String login) {
    super(name, age, gender);
    this.login = login;
    this.totalViews = 0;
  }



  // Special Methods (Getter && Setter) (4)
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getTotalViews() {
    return totalViews;
  }

  public void setTotalViews(int totalViews) {
    this.totalViews = totalViews;
  }



  // toString()
  @Override
  public String toString() {
    return "Grasshopper [" + super.toString() + "\nlogin=" + login + ", totalViews=" + totalViews + "]";
  }
}
