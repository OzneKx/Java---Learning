package Training.Aula12;

public class Main {
  public static void main(String[] args) {
    // Instancing objects
    Mammal m = new Mammal();
    Reptile r = new Reptile();
    Fish f = new Fish();
    Bird b = new Bird();
    Kangaroo k = new Kangaroo();
    Dog d = new Dog();
    Snake s = new Snake();
    Turtle t = new Turtle();
    Goldfish g = new Goldfish();
    Arara a = new Arara();




    m.setWeight(35.3f);
    m.setFurColor("Brown");
    m.eat();
    m.locomote();
    m.sound();

    b.locomote();

    f.locomote();

    r.locomote();

    k.locomote();

    d.locomote();

    s.locomote();
    
    t.locomote();

    g.locomote();

    a.locomote();
  }
}
