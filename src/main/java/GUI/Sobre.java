package GUI;

public class Sobre extends javax.swing.JDialog {
    
    private String sobre = "<html><body align=center>"
            + "Programa desenvolvido por Allan Kenedy entre 2025 e 2026.<br><br>"
            + "Este programa é um software livre; você pode redistrubuí-lo<br>"
            + "e/ou modificá-lo sob os termos da Licença Pública Geral<br>"
            + "GNU versão 3 ou posterior.<br>"
            + "</body></html>";

    public Sobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSobre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setMinimumSize(new java.awt.Dimension(400, 200));
        setResizable(false);

        jLabelSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSobre.setText(sobre);
        jLabelSobre.setToolTipText("");
        getContentPane().add(jLabelSobre, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelSobre;
    // End of variables declaration//GEN-END:variables
}
