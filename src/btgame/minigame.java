
package btgame;

 import java.util.Scanner;
    import java.util.Random;
public class minigame {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnumber = random.nextInt(50) + 1;
             System.out.print("Doan so ngau nhien tu 1 den 50:  ");
        int number = 0;
        while(number != randomnumber){
            System.out.print("Nhap so muon chon: ");
           number = scanner.nextInt();
        if(number < randomnumber){
            System.out.print("Your number is lower. Try again. ");
        }
        else{
            System.out.print("Your number is higher. Try again.");
        }
    }
            System.out.print("Congratulations");
        }
    
}
