package POO.polimorfismoAndHeranca.aulas;

public class Main {
    public static void main(String[] args){
     PrintEmployee(new Manager());
     PrintEmployee(new Salesman());

    }
    public static void PrintEmployee( Employee employee){
        switch (employee){
            case Manager manager->{
                manager.setName("joao");
                manager.setCode("122");
                manager.setSalary(5000);
                manager.setLogin("joaomaneger1233");
                manager.setPassword("ssss");

                System.out.printf("============%s============\n",manager.getClass().getSimpleName());
                System.out.println(manager.getName());
                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println("=============================\n");
            }
            case Salesman salesman->{
                salesman.setName("pedro");
                salesman.setCode("11213");
                salesman.setSalary(2300);
                salesman.setPercentPerSold(10);


                System.out.printf("============%s============\n",salesman.getClass().getSimpleName());
                System.out.println(salesman.getName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println("=============================\n");
            }

        }


    }
}
//1. final (Porta Trancada 🔒)
//É a opção mais comum. Você está dizendo: "A hierarquia termina aqui". Ninguém mais pode herdar de Manager ou Salesman.
//
//Vantagem: Segurança total. Você tem certeza absoluta de que não existirão "sub-gerentes" ou "vendedores-especiais" criados por outros programadores.
//
//2. non-sealed (Porta Aberta 🔓)
//Você está dizendo: "Eu herdei de uma classe selada, mas a partir de mim, qualquer um pode herdar". Você "desseala" a classe.
//
//Vantagem: Flexibilidade. Útil se você quiser que outras pessoas possam estender sua classe Salesman livremente no futuro, sem precisar de permissão no Employee.
//
//3. sealed (Porta com Senha 🔑)
//Você decide que a linhagem continua controlada. O Manager também será selado e dirá exatamente quem pode herdar dele.
//
//Exemplo: public sealed class Manager extends Employee permits SeniorManager, JuniorManager.



//var sc = new Scanner(System.in);
//      if(sc.next().equalsIgnoreCase("s/n"));
//employee = new Manager();//se maneger tivesse um super e parametros voce passaria os valores e isso é bom pq vc consegue reaproveitar codigo se vir a ter uma nova classe no futuro exemplo: propagandista
