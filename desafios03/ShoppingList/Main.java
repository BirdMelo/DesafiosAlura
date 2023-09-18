package tasks.desafios03.ShoppingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);
        List<Shopping> shoppingList = new ArrayList<>();
        List<Shopping> items = new ArrayList<>();

        System.out.println("Bem-vindo ao Mercadão!\n");

        int operation;

        Shopping item1 = new Shopping("01-Camisa",         68.00,      "roupa");
        Shopping item2 = new Shopping("02-Bermuda",        67.50,      "roupa");
        Shopping item3 = new Shopping("03-Blusa de frio",  280.90,     "roupa");
        Shopping item4 = new Shopping("04-Bóne",           70.45,      "roupa");
        Shopping item5 = new Shopping("05-Ventilador",     149.99,     "ED");
        Shopping item6 = new Shopping("06-Aspirador de pó",299.99,     "ED");
        Shopping item7 = new Shopping("07-Liquitificador", 150.75,     "ED");
        Shopping item8 = new Shopping("08-Geladeira",      2889.99,    "ED");
        Shopping item9 = new Shopping("09-TV LED",         1580.56,    "ED");
        
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);

        System.out.println("Quanto deseja gastar hoje?");
        double value = write.nextDouble();
        System.out.println("Otimo! a lista da loja:");
        System.out.println("""
                ========================================
                            Lista de Objetos:
                
                Roupas:
                """);
        for (Shopping object:items) {
            if(object.getType().equals("roupa")){
                System.out.println(object);
            }
        }
        System.out.println("\nEletroeletrônicos Domésticos:\n");
        for (Shopping object:items) {
            if(object.getType().equals("ED")){
                System.out.println(object);
            }
        }
        System.out.println("\n========================================");

        System.out.println("Oque deseja comprar? Se deseja finalizar a compra digite: 0.\n");
        do {

            System.out.print("Digite o número representativo do item de compra:");
            operation = write.nextInt();

            if(operation>0 && operation<=items.size()){

                if(value < items.get(operation-1).getPrice()){

                    System.out.println("Preço fora do orçamento.");

                }else if(operation <= items.size()){

                    value-=items.get(operation-1).getPrice();
                    System.out.println(String.format("Orçamento total atual: %.2f",value));
                    shoppingList.add(items.get(operation-1));
                    System.out.println("========================================");
                }
            }else if (operation!=0){
                System.out.println("número invalido.");
            }

        }while (operation!=0);
        System.out.println("========================================");
        System.out.println("Carinho de compras por preço:");
        Collections.sort(shoppingList);
        for (Shopping item: shoppingList) {
            System.out.println(item);
        }
    }
}
