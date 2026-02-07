package POO.polimorfismoAndHeranca.aulas;

public sealed abstract class Employee permits Manager, Salesman {
    private String name;

    private String code;

    private String adress;

    private int Age;

    // sealed deixa a classe protegida pra que apenas as outras classes permitidas consigam herdar suas caracteristicas
    // abstract impedia instanciar uma claasse generia(employee ) com new para dps com um "super" as classes filhas pegarem seus dados e instaciarem elas entao com sua respectiva classe

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
