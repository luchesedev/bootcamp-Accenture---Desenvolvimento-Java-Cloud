package POO.encapsulamento;

public class ContaBancaria {
    private String nome;
    private double saldo;      // O dinheiro real do cliente
    private double limite;     // Cheque especial
    private double taxaUso = 0.20; // 20%

    // CONSTRUTOR: Resolve o requisito de "momento da criação"
    public ContaBancaria(String nome, double depositoInicial) {
        this.nome = nome;
        this.saldo = depositoInicial;

        // Regra de definição do limite
        if (depositoInicial <= 500) {
            this.limite = 50.0;
        } else {
            this.limite = depositoInicial * 0.50;
        }
    }
    public void pagarBoleto(double valorBoleto) {
        // 1. Verificamos se há saldo disponível (Saldo Real + Limite)
        if (valorBoleto > getSaldoDisponivel()) {
            System.out.println("❌ Erro: Saldo e Limite insuficientes para pagar este boleto.");
        } else {
            // 2. Subtraímos o valor do boleto do saldo real
            this.saldo -= valorBoleto;
            System.out.printf("✅ Boleto de R$ %.2f pago com sucesso!\n", valorBoleto);

            // 3. Se após o pagamento o saldo ficou negativo, avisamos que entrou no cheque
            if (isNoChequeEspecial()) {
                System.out.println("⚠️ Atenção: O pagamento deste boleto utilizou seu Cheque Especial.");
            }
        }
    }
    public double getLimite() {
        return this.limite;
    }

    // O saldo disponível é o que ele tem + o que o banco empresta
    public double getSaldoDisponivel() {
        return this.saldo + this.limite;
    }

    public boolean isNoChequeEspecial() {
        return this.saldo < 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) return;

        // Se ele estava devendo (saldo negativo), cobramos a taxa "assim que possível"
        if (isNoChequeEspecial()) {
            double dividaAnterior = Math.abs(this.saldo);
            double multa = dividaAnterior * taxaUso;
            System.out.printf("Cobrando taxa de uso do cheque especial: R$ %.2f\n", multa);
            this.saldo -= multa; // Aumenta a dívida antes de entrar o depósito
        }

        this.saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.\n", valor);
    }

    public void sacar(double valor) {
        if (valor > getSaldoDisponivel()) {
            System.out.println("Saldo e Limite insuficientes!");
        } else {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.\n", valor);
        }
    }

    public void consultarSaldo() {
        System.out.println("--- EXTRATO ---");
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Saldo Real: R$ %.2f\n", this.saldo);
        System.out.printf("Limite Cheque Especial: R$ %.2f\n", this.limite);
        System.out.printf("Disponível para uso: R$ %.2f\n", getSaldoDisponivel());

        if (isNoChequeEspecial()) {
            System.out.println("⚠️ ATENÇÃO: Você está usando o Cheque Especial!");
        }
    }
}