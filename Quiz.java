package Jobsheet11;

import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do{
            int number = random.nextInt(10) + 1;
            boolean succes = false;
            do{
                System.out.print("Tebak angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                succes = (answer == number);
            } while(!succes);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
            menu = sc.nextLine().charAt(0);
        } while(menu == 'y' || menu == 'Y');
    }
}