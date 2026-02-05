package POO.encapsulamento;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            var sc = new Scanner(System.in);
            boolean condition = true;

            System.out.println("olá, bem vindo ao nosso banco! \n Digite o seu nome e saldo para iniciarmos sua conta");
            System.out.println("nome:");
            var nome =  sc.next();
            System.out.println("deposito inicial:");
            var valor =  sc.nextDouble();
            ContaBancaria cliente1 = new ContaBancaria(nome,valor);
            do {
                System.out.println("OPERAÇOES");
                System.out.println("Consultar saldo - 1 ");
                System.out.println("ver cheque especial - 2 ");
                System.out.println("depositar dinheiro - 3 ");
                System.out.println("sacar dinheiro - 4 ");
                System.out.println("pagar um boleto - 5 ");
                System.out.println("sair - 0 ");
                double loop;
                int number = sc.nextInt();
                switch (number){
                    case 0:
                        condition = false;
                        break;
                    case 1: cliente1.consultarSaldo();
                        break;
                    case 2 :System.out.println(cliente1.getLimite());
                        break;
                    case 3:
                        System.out.println("Digite o valor que deseja depositar \n valor:");
                        loop = sc.nextDouble();
                        cliente1.depositar(loop);
                        break;
                    case 4:
                        System.out.println("Digite o valor que deseja sacar \n valor:");
                        loop = sc.nextDouble();
                        cliente1.sacar(loop);
                        break;
                    case 5:
                        System.out.println("Digite o valor do boleto que deseja pagar \n valor:");
                        loop = sc.nextDouble();
                        cliente1.pagarBoleto(loop);
                        break;
                    case 6: if(cliente1.isNoChequeEspecial()){
                        System.out.println("⚠️ ATENÇÃO: Você está usando o Cheque Especial!");
                        break;
                    }
                    else {
                        System.out.println("Você não esta usando o saldo especial.");
                    }
                    default :
                        System.out.println("numero invalido , tente novamente");
                        break;
                }
            }while (condition);


            /*
            EXERCICIO ALUNO
            Aluno aluno = new Aluno(sc.next(), sc.next(),sc.nextInt());

            System.out.println(aluno.getName());
            System.out.println(aluno.getAge());
            System.out.println(aluno.getCpf());
            */



        }
    }
