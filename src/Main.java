import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {//1 задание
        Author a = new Author();
        a.name = "Liza";
        a.gender = 0;
        System.out.println("Задание1.Впишите почту");
        Scanner input = new Scanner(System.in);
        String mail = input.nextLine();
        a.setEmail(mail);
        System.out.println(a);
        Ball ball = new Ball();//2 задание
        System.out.println("Задание 2.Впишите координату x");
        double x = input.nextInt();
        System.out.println("Впишите координату y");
        double y = input.nextInt();
        ball.setXY(x, y);
        System.out.println(ball);
        System.out.println("На сколько мяч сдвинулся по координате x?");
        double x1 = input.nextInt();
        System.out.println("На сколько мяч сдвинулся по координате y?");
        double y1 = input.nextInt();
        ball.move(x1, y1);
        System.out.println(ball);
        Shop shop = new Shop();//4 задание
        System.out.println("Задание 4.");
        first:
        {
            while (true) {
                shop.interfaceInShop();
            int number = input.nextInt();
            if (number == 1) {
                String buff = input.nextLine();
                System.out.println("Введите название процессора");
                String nameprocessor = input.nextLine();
                System.out.println("Введите название компьютера");
                String namecomputer1 = input.nextLine();
                System.out.println("Введите название видеокарты");
                String namevideocard = input.nextLine();
                System.out.println("Введите год выпуска компьютера");
                int year = input.nextInt();
                shop.addComputer(namecomputer1, nameprocessor, namevideocard, year);
            }
            if (number == 2) {
                System.out.println("Введите номер компьютера, который хотите удалить");
                int numberinlist = input.nextInt();
                shop.deleteComputer(numberinlist);
            }
            if (number == 3) {
                shop.getAll();
            }
            if (number == 4) {
                System.out.println("Введите название компьютера");
                String namecomputer = input.nextLine();
                shop.search(namecomputer);
            }
            if (number == 5) {
                break first;
            }
        }
        }
    }
    }
