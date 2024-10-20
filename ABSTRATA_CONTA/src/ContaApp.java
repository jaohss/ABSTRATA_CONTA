import java.util.Scanner;
public class ContaApp {
    public static void main(String[] args) {
        //instanciando obejtos das contas poupança e corrente
            ContaPoupanca cp = new ContaPoupanca("João", "1122334455", 200, 0, 0);
            ContaCorrente cc = new ContaCorrente("henrique", "99887766", 0, 0, 0);
            Scanner scn = new Scanner(System.in);

            try{
                //Entrada de dados da conta poupança
                System.out.println("======Conta poupança======");
                do{
                    //Conta poupança
                    System.out.println("Digite o valor a ser depositado na conta poupança: ");
                    cp.setDeposito(scn.nextDouble());
                    cp.getDeposito();

                    System.out.println("R$"+cp.deposito());

                    System.out.println("Digite o valor a ser sacado da conta poupança: ");
                    cp.setSaque(scn.nextDouble());
                    cp.getSaque();

                    System.out.println("R$"+cp.saque());

                    System.out.println("Deseja fazer outra consulta ?");
                    cp.setOpcao(scn.next().charAt(0));

                    cp.consulta();
                }while(cp.getOpcao()=='s' || cp.getOpcao()=='S');

                //Exibe os dados do usuário e sua conta poupança
                System.out.println(cp.descricao());

                //Entrada de dados da conta corrente
                System.out.println("========Conta corrente=======");
                do{
                    System.out.println("Digite o valor a ser depositado na conta corrente: ");
                    cc.setDeposito(scn.nextDouble());
                    cc.getDeposito();

                    System.out.println("R$"+cc.deposito());

                    System.out.println("Digite o valor a ser sacado da conta corrente: ");
                    cc.setSaque(scn.nextDouble());
                    cc.getSaque();

                    System.out.println("R$"+cc.saque());

                    System.out.println("Deseja fazer outra consulta ?");
                    cc.setOpcao(scn.next().charAt(0));

                    cc.consulta();

                }while(cc.getOpcao()=='s' || cc.getOpcao()=='S');
                //Exibe os dados do usuário e da conta corrente
                System.out.println(cc.descricao());
            }
            //Exibe a mensagem de erro definido, caso haja falhas
            catch(AtributoInvalidoException e){
                System.out.println("Erro: "+e.getMessage());

            }
    }
}
