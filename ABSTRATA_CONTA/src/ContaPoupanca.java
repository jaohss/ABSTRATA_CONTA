public class ContaPoupanca extends ContaBancaria {
    //Definição de atributos privados
    private char opcao;
    private int cons = 0;
    
    //Definição de construtores com atributos da classe abstrata/superclasse
    public ContaPoupanca(String nome, String numConta, double saldo, double deposito, double saque){
        super(nome, numConta, saldo, deposito, saque);
    }
    
    //getters e setters dos atributos privados
    public char getOpcao() {
        return opcao;
    }

    public void setOpcao(char opcao) {
        this.opcao = opcao;
    }

    public int getCons(){
        return cons;
    }
    public void setCons(int cons){
        this.cons=cons;
    }

    //Método que calcula e exibe o saldo após o depósito e desconta 1% a cada saque
    @Override
    public double deposito(){
        double saldoDeposito = getSaldo()+getDeposito();
        double taxaDeposito = 0.01 * getDeposito();
        double saldoComtaxa = saldoDeposito - taxaDeposito;
        setSaldo(saldoComtaxa);
        return getSaldo();
    }

    //Método que calcula exibe o saldo após o saque e desconta 0,5% do saldo a cada saque
    @Override
    public double saque() throws AtributoInvalidoException {
        //se o valor do saque for maior que do saldo disponível, será exibida uma mensagem de erro.
        if(getSaque()>getSaldo()){
            throw new AtributoInvalidoException("O valor do saque não pode ser superior ao do Saldo. Tente novamente");
        }
        else{
            double saldoSaque = getSaldo()-getSaque();
            double taxaSaque = 0.005 * getSaque();
            double saldoComTaxa = saldoSaque - taxaSaque;
            setSaldo(saldoComTaxa);
            return getSaldo();
        }
    }

    //Método que faz a contagem de consultas feitas
    @Override
    public void consulta() {
        this.cons++;
        verificarTaxaConsultar();
        verificaMensagemConsulta();
        
    }

    //Método que faz a verificação a cada 5 consultas, que vai fazer um desconto de r$ 0,10 do saldo 
    private void verificarTaxaConsultar(){
        if(this.cons % 5 ==0){
            setSaldo(getSaldo()-0.10);
        }
    }

    //Método que exibe o saldo após 5 consultas
    private void verificaMensagemConsulta(){
        if(this.cons % 5 ==0){
            System.out.println("Saldo disponível na conta após 5 consultas: R$"+ getSaldo());
        }
    }

    //Método string que exibe os dados do cliente
    public String descricao(){
        return "Nome: "+getNome()+
        "\nNúmero da conta: "+getNumConta()+
        "\nSaldo: R$"+getSaldo() +
        "\nTotal de consultas: "+ getCons();
    }
}