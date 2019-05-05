package trabalho1;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Trabalho1 {
    Contas conta1 = new Contas();
    ContaPoupanca conta2 = new ContaPoupanca();
    ContaEspecial conta3 = new ContaEspecial();
public class Janela extends JFrame{
        
}
public static void main(String[] args) {
    
    
    
    
    //conta1.setNome("Matheus");
    JOptionPane.showMessageDialog(null," Seja bem-vindo!");
    //conta1.setNome(JOptionPane.showInputDialog("qual o seu nome?"));
    //conta1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("qual seu numero?")));
    //conta1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("qual seu saldo?")));
    Cadastros c = new Cadastros();
    c.setVisible(true);
    Saque a = new Saque();
    
    
    
    }


   
}
