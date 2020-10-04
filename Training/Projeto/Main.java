package Training.Projeto;

public class Main {
  public static void main(String[] args) {
    Video v[] = new Video[3];
    v[0] = new Video("Aula 1 de POO");
    v[1] = new Video("Aula 12 de PHP");
    v[2] = new Video("Aula 10 de HTML5");

    Grasshopper g[] = new Grasshopper[2];
    g[0] = new Grasshopper("Mauricio", 18, "M", "OzneK");
    g[1] = new Grasshopper("Kenzo", 19, "M", "OzneKx");

    System.out.println(v[0].toString());
    System.out.println(g[0].toString());
  }
}
