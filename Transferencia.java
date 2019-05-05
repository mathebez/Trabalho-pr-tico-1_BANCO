/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author matheus dias
 */
public class Transferencia extends javax.swing.JFrame {

    /**
     * Creates new form Tranferencia
     */
    public Transferencia() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contaD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contaR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número da conta doadora:");

        contaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaDActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de conta receptora:");

        contaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaRActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor a ser transferido:");

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(contaD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contaR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contaDActionPerformed

    private void contaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contaRActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(contaD.getText().equals("") || contaR.getText().equals("") || valor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"digite valores válidos nos campos");
        }else if(contaD.getText().equals(Integer.toString(NovoJFrame.a.conta1.getNumero()))){
            if(Double.parseDouble(valor.getText())>NovoJFrame.a.conta1.getSaldo()){
                JOptionPane.showMessageDialog(null,"O valor do doador é menor que o saldo disponível");
            }else{
                    if(contaR.getText().equals(contaD.getText())){
                    JOptionPane.showMessageDialog(null,"Os número das contas não podem ser iguais.");
                }else if(contaR.getText().equals(Integer.toString(NovoJFrame.a.conta2.getNumero()))){
                    if(JOptionPane.showConfirmDialog(null,"Transferir "+valor.getText()+" reais de "+NovoJFrame.a.conta1.getNome()+
                            " para "+NovoJFrame.a.conta2.getNome()) == 0){
                        NovoJFrame.a.conta1.setSaldo(NovoJFrame.a.conta1.getSaldo()-Integer.parseInt(valor.getText()));
                        NovoJFrame.a.conta2.setSaldo(NovoJFrame.a.conta2.getSaldo()+Integer.parseInt(valor.getText()));
                    setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null,"Transferência cancelada");
                    }
                }else if(contaR.getText().equals(Integer.toString(NovoJFrame.a.conta3.getNumero()))){
                    if(JOptionPane.showConfirmDialog(null,"Transferir "+valor.getText()+" reais de "+NovoJFrame.a.conta1.getNome()+
                            " para "+NovoJFrame.a.conta3.getNome()) == 0){
                        NovoJFrame.a.conta1.setSaldo(NovoJFrame.a.conta1.getSaldo()-Integer.parseInt(valor.getText()));
                        NovoJFrame.a.conta3.setSaldo(NovoJFrame.a.conta3.getSaldo()+Integer.parseInt(valor.getText()));              
                    setVisible(false);}else{
                        JOptionPane.showMessageDialog(null,"Transferência cancelada");
                   }
                }else{
                    JOptionPane.showMessageDialog(null,"Número de conta não existe");}
            }
        }else if(contaD.getText().equals(Integer.toString(NovoJFrame.a.conta2.getNumero()))){
            if(NovoJFrame.a.conta2.getSaldo() < Double.parseDouble(valor.getText())){
                JOptionPane.showMessageDialog(null,"O valor do doador é menor que o saldo disponível");
            }else{
            if(contaR.getText().equals(contaD.getText())){
                JOptionPane.showMessageDialog(null,"Os número das contas não podem ser iguais.");               
            }else if(contaR.getText().equals(Integer.toString(NovoJFrame.a.conta1.getNumero()))){
                if(JOptionPane.showConfirmDialog(null,"Transferir "+valor.getText()+" reais de "+NovoJFrame.a.conta2.getNome()+
                        " para "+NovoJFrame.a.conta1.getNome()) == 0){
                    NovoJFrame.a.conta2.setSaldo(NovoJFrame.a.conta2.getSaldo()-Integer.parseInt(valor.getText()));
                    NovoJFrame.a.conta1.setSaldo(NovoJFrame.a.conta1.getSaldo()+Integer.parseInt(valor.getText()));
                setVisible(false);}else{
                    JOptionPane.showMessageDialog(null,"Transferência cancelada");
                }
            }else if(contaR.getText().equals(Integer.toString(NovoJFrame.a.conta3.getNumero()))){
                if(JOptionPane.showConfirmDialog(null,"Transferir "+valor.getText()+" reais de "+NovoJFrame.a.conta2.getNome()+
                        " para "+NovoJFrame.a.conta3.getNome()) == 0){
                NovoJFrame.a.conta2.setSaldo(NovoJFrame.a.conta2.getSaldo()-Integer.parseInt(valor.getText()));
                NovoJFrame.a.conta3.setSaldo(NovoJFrame.a.conta3.getSaldo()+Integer.parseInt(valor.getText()));
                setVisible(false);}else{
                    JOptionPane.showMessageDialog(null,"Transferência cancelada");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Número de conta não existe");}
            }
        }else if(contaD.getText().equals(Integer.toString(NovoJFrame.a.conta3.getNumero()))){
            if((NovoJFrame.a.conta3.getSaldo() + NovoJFrame.a.conta3.limite) < Double.parseDouble(valor.getText())){
                JOptionPane.showMessageDialog(null,"O valor do doador é menor que o saldo+limite disponível!");  
            }else{
                if(contaR.getText().equals(contaD.getText())){
                    JOptionPane.showMessageDialog(null,"Os número das contas não podem ser iguais.");
                }else if(contaR.getText().equals(Integer.toString(NovoJFrame.a.conta1.getNumero()))){
                    if(JOptionPane.showConfirmDialog(null,"Transferir "+valor.getText()+" reais de "+NovoJFrame.a.conta3.getNome()+
                            " para "+NovoJFrame.a.conta1.getNome()) == 0){
                        NovoJFrame.a.conta3.setSaldo(NovoJFrame.a.conta3.getSaldo()-Integer.parseInt(valor.getText()));
                        NovoJFrame.a.conta1.setSaldo(NovoJFrame.a.conta1.getSaldo()+Integer.parseInt(valor.getText()));
                        setVisible(false);}else{
                        JOptionPane.showMessageDialog(null,"Transferência cancelada");
                    }
                }else if(contaR.getText().equals(Integer.toString(NovoJFrame.a.conta2.getNumero()))){
                    if(JOptionPane.showConfirmDialog(null,"Transferir "+valor.getText()+" reais de "+NovoJFrame.a.conta3.getNome()+
                            " para "+NovoJFrame.a.conta2.getNome()) == 0){
                        NovoJFrame.a.conta3.setSaldo(NovoJFrame.a.conta3.getSaldo()-Integer.parseInt(valor.getText()));
                        NovoJFrame.a.conta2.setSaldo(NovoJFrame.a.conta2.getSaldo()+Integer.parseInt(valor.getText()));
                        setVisible(false);}else{
                        JOptionPane.showMessageDialog(null,"Transferência cancelada");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Número de conta não existe");}
            }
        }else{
            JOptionPane.showMessageDialog(null,"Número de conta não existe");
        }
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tranferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contaD;
    private javax.swing.JTextField contaR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
