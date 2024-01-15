import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Punt punt6 = new Punt(1,500,50);
      Punt punt7 = new Punt(4,8,10);
      Punt punt8 = new Punt(1,2,3);

      Linia linia1 = new Linia(punt6,punt7,2);


      Area area1 = new Area(punt6,punt7,punt8,40);
        System.out.println(punt6);
        System.out.println(punt7);
        System.out.println(punt8);
        System.out.println(linia1);
        System.out.println(area1);

    }
}