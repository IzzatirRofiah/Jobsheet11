package Jobsheet11;
import java.util.Scanner;

public class StudyCase16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Input: ");
        int N = input.nextInt(); 
        
        for(int t = 1; t <= N; t++){  
            for(int s = t; s <= N; s++){
                System.out.print(" ");
            }
            
            for(int b = 0; b <=(t*2)-2; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}