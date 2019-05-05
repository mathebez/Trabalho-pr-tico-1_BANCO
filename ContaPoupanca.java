package trabalho1;

public class ContaPoupanca extends Contas{
    double taxa;
    public void reajustar(double taxa){//a taxa sera informada
        this.setSaldo(this.getSaldo() + (this.getSaldo() * taxa));
    }
    public void reajustar(){
        this.setSaldo(this.getSaldo() + (this.getSaldo()*0.1));
    }
    public String tipoConta(){
        return("conta-poupança");
    }
}
