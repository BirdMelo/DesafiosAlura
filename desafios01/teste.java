package tasks.desafios01;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        String saudacao = "tchau";
        while (!saudacao.equals("oi")){
            saudacao= write.nextLine();
        }
    }
}
