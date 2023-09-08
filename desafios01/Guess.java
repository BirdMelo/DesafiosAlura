package tasks.desafios01;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int machine = new Random().nextInt(100);
        int num=0;

        System.out.println("Tente adivinhar o números que escolhi entre 0 e 100.");
        for (int i = 1; i <= 5; i++) {
            System.out.print(String.format("%d° tentativa: ",i));
            num = write.nextInt();

            if (num>machine){
                System.out.println("Mais baixo.");
            }
            else if (num<machine){
                System.out.println("Mais alto.");
            }
            else{
                System.out.println("Acertou!");
                break;
            }

        }
        if(num!=machine){
            System.out.println("Não foi dessa vez.");
        }
    }
}
