package tasks.desafios01;

import java.util.Scanner;

public class BankTask {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        //declaration of variables:
        int acc;
        double balance;

        //Add Data
        String agree;
        System.out.println("""
                =================================================
                                Registro de dados""");
        do {
            System.out.print("Nome: ");
            String user = write.nextLine();

            System.out.print("""
                Tipo da conta:
                    1 - Corrente
                    2 - Poupança Programada
                Digite:\s""");
            acc = write.nextInt();
            String accType;
            if(acc==1){
                accType="Corrente";
            }else{
                accType="Poupança Programada";
            }

            System.out.println("Saldo inicial: R$");
            balance = write.nextDouble();

            System.out.println(String.format("""
                =================================================
                              Confirmação de dados:
                              
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                
                """,user,accType,balance));
            System.out.println("Está correto? ");
            write.nextLine();
            agree = write.nextLine();
            System.out.println("=================================================");
        }while (agree.equals("não") || agree.equals("n"));

        //Commands:

        int operations;
        do {
            System.out.print("""
                    =================================================
                                        Operações
                    
                    1 - Consultar Saldos
                    2 - Receber Saldo
                    3 - Retirar Saldo
                    4 - Sair
                    
                    Digite a Operação:\s""");
            operations=write.nextInt();
            switch (operations){
                case 1:
                    System.out.println(String.format("Saldo em: R$%.2f",balance));
                    break;
                case 2:
                    System.out.println("Quanto irá receber?");
                    balance+= write.nextDouble();
                    System.out.println(String.format("Saldo atual: R$%.2f",balance));
                    break;
                case 3:
                    if(acc==2){
                        System.out.println("Não pode ser retirado valores de uma conta poupança programada");
                    } else {
                        System.out.println("Qual o valor que deseja retirar?");
                        double withdrawn = write.nextDouble();
                        if(withdrawn>balance){
                            System.out.println("Valor de saque maior que valor em conta.");
                        } else {
                            balance-=withdrawn;
                            System.out.println(String.format("Saque de %.2f feito com sucesso.",withdrawn));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tenha um bom dia!");
                    System.out.println("=================================================");
                    break;
                default:
                    System.out.println("Operação invalida.");
            }
        }while (operations!=4);

    }
}
