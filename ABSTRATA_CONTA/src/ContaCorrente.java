public class ContaCorrente extends ContaBancaria {
    //Definição de atributos privados
    private char opcao;
    private int cons = 0;
    private double limite =100;
    
    //Definição de construtores com atributos da classe abstrata/superclasse
    public ContaCorrente(String nome, String numConta, double saldo, double deposito, double saque){
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Método que calcula e exibe o saldo após o depósito e desconta 7% do saldo
    @Override
    public double deposito(){
        double saldoDeposito = getSaldo()+getDeposito();
        double taxaDeposito = 0.07 * getDeposito();
        double saldoComtaxa = saldoDeposito - taxaDeposito;
        setSaldo(saldoComtaxa);
        return getSaldo();
    }

    //Método que calcula exibe o saldo após o saque e desconta 0,8% do saldo
    @Override
    public double saque() throws AtributoInvalidoException {
        //se o valor do saque for maior que o limite (dobro do valor do saldo) , será exibida uma mensagem de erro.
        if(getSaque() > getSaldo() + getLimite()){
            throw new AtributoInvalidoException("O valor do saque não pode ser superior ao do Saldo mais o valor do limite definido. Tente novamente");
        }
        else{
            double taxaSaque = 0.008 * getSaque();
            double saldoComTaxa = getSaldo() - getSaque() - taxaSaque;
            
            //Quando saldo estiver negativo, será usado o valor do limite como saldo
            if(saldoComTaxa<0){
                
                double valorLimite = Math.abs(saldoComTaxa);
                setLimite(getLimite()-valorLimite);
                setSaldo(0 + getLimite());
            }
            else{
                setSaldo(saldoComTaxa);
            }

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

    //Método que faz a verificação a cada 5 consultas, que vai fazer um desconto de r$ 0,50 do saldo 
    private void verificarTaxaConsultar(){
        if(this.cons % 5 ==0){
            setSaldo(getSaldo()-0.50);
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
