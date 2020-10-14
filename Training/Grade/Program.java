package Training.Grade;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    System.out.print("Nome do aluno: ");
    student.name = sc.nextLine();
    System.out.print("Nota - 1° Trimestre:");
    student.score1 = sc.nextDouble();
    System.out.print("Nota - 2° Trimestre:");
    student.score2 = sc.nextDouble();
    System.out.print("Nota - 3° Trimestre:");
    student.score3 = sc.nextDouble();
  }
}
