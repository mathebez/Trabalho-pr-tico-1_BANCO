package trabalho1;

public class ContaEspecial extends Contas {
    double limite;
    double multa;
    public void descontar(double multa){
        this.setSaldo(this.getSaldo()-multa);
    }
    public String tipoConta(){
        return("conta-especial");
    }
}
