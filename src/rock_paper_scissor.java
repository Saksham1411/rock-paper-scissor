
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("0 is Rock");
        System.out.println("1 is Paper");
        System.out.println("2 is Scissor");
        System.out.print("No. of rounds u want to play  ");
        int t = sc.nextInt();
        int uscore = 0; //user's score
        int cscore = 0; //computer's score
        while (t>0) {
            int comp = random.nextInt(3); 
            int user = sc.nextInt();
            System.out.println(comp);

            if (comp == user) {
                System.out.println("Its a draw. you choose same");
            } else if ((comp == 0 && user == 1) || (comp == 1 && user == 2) || (comp == 2 && user == 0)) {
                System.out.println("you winnn");
                uscore++;
            } else {
                System.out.println("you lose :-(");
                cscore++;
            }
            System.out.println("your score "+uscore+"\ncomputer score "+cscore);

            t--;
        }
        System.out.println("RESULTS ARE\n");
        if (uscore>cscore){
            System.out.println("You Winnn!!!!");
        }else if (cscore>uscore){
            System.out.println("You Lose:-(");
        }else {
            System.out.println("Ohh its a Draw");
        }

    }
}
