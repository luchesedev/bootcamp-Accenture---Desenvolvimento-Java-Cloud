package POO.polimorfismoAndHeranca;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Pepe");
        manager.setAge(192121);
        manager.setPassword("pepe");

       System.out.println(manager.getName());
        manager.getAge();
        manager.getPassword();

    }
}
