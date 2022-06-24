
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int controller;
        Services services = new Services();
        do {
            System.out.println("1.Enter for adding data");
            System.out.println("2.Served for sort and remove data");
            Scanner obj = new Scanner(System.in);
            int num = obj.nextInt();
            controller = num;

            switch (num) {

                case 1:
                    services.addStudent();  //Service de yazdıgımız method çagırılıyor.
                    break;
                case 2:
                    services.served();      //Service de yazdıgımız method çagırılıyor.
                    break;
                default:
                    break;

            }
        } while (controller != 0);        //Sonsuz döngü yaratmak için do-while içerisinde yazılıyor.

    }
}