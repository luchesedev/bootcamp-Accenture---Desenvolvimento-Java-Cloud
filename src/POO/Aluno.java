package POO;



    // Classe Aluno (Geralmente declarada fora ou como static)
    public class Aluno {
        private String name;
        private String cpf;
        private int age;

        public Aluno(String name , String cpf, int age){
            this.name = name;
            this.cpf = cpf;
            this.age = age;
        }
        public String getName(){
            return this.name;
        }
        public String getCpf(){
            return this.cpf;
        }
        public int getAge(){
            return this.age;
        }
    }


