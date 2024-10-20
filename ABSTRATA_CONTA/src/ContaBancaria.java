public abstract class ContaBancaria{
    //definição dos atributos privados
    private String nome;
    private String numConta;
    private double saldo;
    private double deposito;
    private double saque;

    //definição do construtor público
    public ContaBancaria(String nome, String numConta, double saldo, double deposito, double saque){
        this.nome=nome;
        this.numConta=numConta;
        this.saldo=saldo;
        this.deposito=deposito;
        this.saque=saque;
        
    }
//getter e setters do atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }
    
//Definição dos métodos abstratos
    public abstract double deposito();
    public abstract double saque() throws AtributoInvalidoException;
    public abstract void consulta();
    
    
}