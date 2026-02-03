package java_basico;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Main {
    static boolean condition = true;
    public static void main(String[] args) {




        do {
            mostrarmenu();
        }while (condition );


    }

    public static void calcularIDade() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();

        var DataNasc =LocalDate.parse(input, formatter);
        // Calculamos a diferença
        Period periodo = Period.between(DataNasc, hoje);
        if(periodo.getYears() <= 0){
            System.out.println("idade inválida. ");
        }
        else {
            System.out.println("Você tem " + periodo.getYears() + " anos!");
        }
        int ToRead = sc.nextInt();

    }

    public static void areaSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a value which is equal to a side of a square that im going to calculate the area");
        System.out.println("side:");
        int side = sc.nextInt();
        System.out.printf("Area of the square is equals to: %s", Math.pow(side, 2) );

        int ToRead = sc.nextInt();
    }
    public static void areaRetangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a value which is equal to a side of a square that im going to calculate the area");
        System.out.println("base:");
        int side1 = sc.nextInt();
        System.out.println("height:");
        int side2 = sc.nextInt();
        System.out.printf("Area of the square is equals to: %s",  side1 * side2);

        int ToRead = sc.nextInt();
    }


    public static void diferencaIdade(){
        Scanner sc = new Scanner(System.in);

        System.out.println("put your name ");
        String username1 = sc.nextLine();
        System.out.println("put the your bith data in this format (dd/MM/yyyy): ");
        String age1 = sc.nextLine();

        System.out.println("put your name ");
        String username2 = sc.nextLine();
        System.out.println("put the your bith data in this format (dd/MM/yyyy): ");
        String age2 = sc.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();

        var DataNasc1 =LocalDate.parse(age1, formatter);
        // Calculamos a diferença
        Period periodo1 = Period.between(DataNasc1, hoje);
        if(periodo1.getYears() <= 0){
            System.out.println("idade inválida. ");

        }
        var DataNasc2 =LocalDate.parse(age2, formatter);
        // Calculamos a diferença
        Period periodo2 = Period.between(DataNasc2, hoje);
        if(periodo2.getYears() <= 0){
            System.out.println("idade inválida. ");
        }

        if(periodo1.getYears()< periodo2.getYears() ){
            System.out.printf(" %s is older than %s cause they have a age difference of %s years ",username2,username1,periodo2.getYears() - periodo1.getYears());
            int ToRead = sc.nextInt();
        } else if (periodo1.getYears() > periodo2.getYears() ) {
            System.out.printf(" %s is older than %s cause they have a age difference of %s years ",username1,username2,periodo1.getYears() - periodo2.getYears());
            int ToRead = sc.nextInt();
        }
        else{
            System.out.printf(" %s and %s have the same age ",username1,username2);
            int ToRead = sc.nextInt();
        }
    }
    public static void tabuada(){
        var sc = new Scanner(System.in);

        System.out.println("say a number that im going to make a 'tabuada' :");
        var number = sc.nextInt();

        for (int i = 1 ; i<= 10; i++){
            System.out.printf("%s x %s = %s \n",number,i,number * i);
        }
    }
    public static void imc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("height:");
        double height = sc.nextFloat();
        System.out.println("weight:");
        double weight = sc.nextFloat();

        double imc = weight/(Math.pow(height,2));

        if(imc <= 18.5){
            System.out.println("Abaixo do peso \n");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso ideal \n");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("levemente acima do peso ideal\n");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I \n");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II \n");
        }
        else{
            System.out.println("Obesidade Grau III \n");
        }

    }
    public static void space_between(){
        Scanner sc = new Scanner(System.in);
        System.out.println("number1:");
        var number1 = sc.nextInt();
        System.out.println("number2:");
        var number2 = sc.nextInt();

        var ParOrImpar =sc.next();
        if (ParOrImpar.equalsIgnoreCase("Par")){
            for (int i = number1; i <= number2; i ++){
                System.out.println((i % 2 == 0)? i:"");
            }
        } else if (ParOrImpar.equalsIgnoreCase("impar")) {
            for (int i = number1; i <= number2; i ++){
                System.out.println((i % 2 != 0)? i:null);
            }
        }
        else {
            System.out.println("Par or impar was righted in a wrong way");
        }
    }
    public static void exercise8(){
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.println("Input a number:");
        number1 = sc.nextInt();
        System.out.println("right down the divisor:");
        number2 = sc.nextInt();
        while (number2 <= 1){
            System.out.println("right other divisor:");
            number2 = sc.nextInt();
        }
        while(number1 % number2 == 0){
            System.out.printf("%s %% %s = %s\n",number1 , number2, number1% number2);
            System.out.println("Input other number:");
            number1 = sc.nextInt();
        }
        System.out.printf("%s %% %s = %s \n",number1 , number2, number1% number2);
    }
    public static void mostrarmenu( ){
        Scanner sc = new Scanner(System.in);

        System.out.println("menu");
        System.out.println("Calcula idade  - 1 ");
        System.out.println("Área do Quadrado - 2 ");
        System.out.println("Área do retângulo - 3 ");
        System.out.println("Diferença de idade - 4 ");
        System.out.println("tabuada - 5 ");
        System.out.println("IMC - 6 ");
        System.out.println("Space_between - 7 ");
        System.out.println("exercise 8 - 8 ");
        System.out.println("sair - 0 ");

        int number = sc.nextInt();
        switch (number){
            case 0:
                condition = false;
                break;
            case 1: calcularIDade();
                break;
            case 2 : areaSquare();
                break;
            case 3: areaRetangulo();
                break;
            case 4: diferencaIdade();
                break;
            case 5: tabuada();
                break;
            case 6: imc();
                break;
            case 7: space_between();
                break;
            case 8: exercise8();
                break;
            default :
                System.out.println("numero invalido , tente novamente");
                break;
            }
        }
    }


