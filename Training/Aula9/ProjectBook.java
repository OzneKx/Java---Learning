package Training.Aula9;

public class ProjectBook {
  public static void main(String[] args) {
    Person[] p = new Person[2];
    Book[] b = new Book[3];

    p[0] = new Person("Kenzo", 19, "M");
    p[1] = new Person("Mauricio", 19, "M");

    b[0] = new Book("Aprendendo Java", 
                    "José da Silva", 
                    300, p[0]);
    b[1] = new Book("POO Para Iniciantes", 
                    "Pedro Paulo", 
                    500, p[1]);
    b[2] = new Book("Java Avançado", 
                    "Maria Candido", 
                    800, p[0]);

    b[0].open();
    b[0].skim(200);
    b[0].nextPage();
    System.out.println(b[0].details());
    
    System.out.println(b[1].details());
  }
}
