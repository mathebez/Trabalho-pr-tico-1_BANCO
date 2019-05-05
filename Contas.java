package trabalho1;

import javax.swing.JOptionPane;

public class Contas {
    private String nome;
    private int numero;
    private double saldo;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        if(valor<=saldo){
        saldo = saldo - valor;
        }else{
            JOptionPane.showMessageDialog(null,"saldo menor que valor desejado");
        }
    }
    public double transferir(double vconta1,double vconta2,double valor){
               vconta1 = vconta1-valor;
               vconta2 = vconta2+valor;
               return vconta1;
               
    }
    public String tipoConta(){
        
        return ("conta-comum");
    }
}
    
