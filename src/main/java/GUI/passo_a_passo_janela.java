package GUI;

import java.util.ArrayList;

public class passo_a_passo_janela extends javax.swing.JDialog {
    
    public passo_a_passo_janela(java.awt.Frame parent, boolean modal, ArrayList<Integer> sequencia) {
        super(parent, modal);
        initComponents();
        jPanelPasso_a_passo.sequencia = sequencia;
        jPanelPasso_a_passo.construirLinhas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonAnterior = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jPanelPasso_a_passo = new PainelPassoAPasso();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Passo-a-passo");
        setModal(true);
        setResizable(false);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(this::jButtonAnteriorActionPerformed);
        jPanel2.add(jButtonAnterior);

        jButtonReset.setText("Reiniciar");
        jButtonReset.addActionListener(this::jButtonResetActionPerformed);
        jPanel2.add(jButtonReset);

        jButtonProximo.setText("Próximo");
        jButtonProximo.addActionListener(this::jButtonProximoActionPerformed);
        jPanel2.add(jButtonProximo);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanelPasso_a_passoLayout = new javax.swing.GroupLayout(jPanelPasso_a_passo);
        jPanelPasso_a_passo.setLayout(jPanelPasso_a_passoLayout);
        jPanelPasso_a_passoLayout.setHorizontalGroup(
            jPanelPasso_a_passoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanelPasso_a_passoLayout.setVerticalGroup(
            jPanelPasso_a_passoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPasso_a_passo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        jPanelPasso_a_passo.prev_step();
        repaint();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        jPanelPasso_a_passo.next_step();
        repaint();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jPanelPasso_a_passo.reset();
    }//GEN-LAST:event_jButtonResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JPanel jPanel2;
    private PainelPassoAPasso jPanelPasso_a_passo;
    // End of variables declaration//GEN-END:variables
}
