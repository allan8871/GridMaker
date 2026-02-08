package GUI;

import algoritmos.GradeInvalidaException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JanelaPrincipal extends javax.swing.JFrame {
    
    String nomePadrao;

    public JanelaPrincipal() {
        initComponents();
        getRootPane().setDefaultButton(jButtonGrade);
        setIconImage(new ImageIcon(getClass().getResource("/icons/GridMakerIcon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonPasso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerGrade = new javax.swing.JSpinner();
        jButtonGrade = new javax.swing.JButton();
        jPanelDesenho = new PainelDesenho();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSalvarImagem = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMetodo = new javax.swing.JMenu();
        jRadioButtonMenuItemCrossDiag = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemFujimoto = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemHaag = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemNoma = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemHaga = new javax.swing.JRadioButtonMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GridMaker");

        jButtonPasso.setText("Passo-a-passo");
        jButtonPasso.addActionListener(this::jButtonPassoActionPerformed);
        getContentPane().add(jButtonPasso, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grade nxn:");
        jPanel1.add(jLabel1);

        jSpinnerGrade.setModel(new javax.swing.SpinnerNumberModel(3, 3, 99, 1));
        jPanel1.add(jSpinnerGrade);

        jButtonGrade.setText("Gerar grade");
        jButtonGrade.addActionListener(this::jButtonGradeActionPerformed);
        jPanel1.add(jButtonGrade);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanelDesenhoLayout = new javax.swing.GroupLayout(jPanelDesenho);
        jPanelDesenho.setLayout(jPanelDesenhoLayout);
        jPanelDesenhoLayout.setHorizontalGroup(
            jPanelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelDesenhoLayout.setVerticalGroup(
            jPanelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDesenho, java.awt.BorderLayout.CENTER);

        jMenuArquivo.setText("Arquivo");

        jMenuItemSalvarImagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSalvarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save icon.png"))); // NOI18N
        jMenuItemSalvarImagem.setText("Salvar imagem como...");
        jMenuItemSalvarImagem.addActionListener(this::jMenuItemSalvarImagemActionPerformed);
        jMenuArquivo.add(jMenuItemSalvarImagem);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sign-out.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(this::jMenuItemSairActionPerformed);
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar.add(jMenuArquivo);

        jMenuMetodo.setText("Método");

        buttonGroup1.add(jRadioButtonMenuItemCrossDiag);
        jRadioButtonMenuItemCrossDiag.setSelected(true);
        jRadioButtonMenuItemCrossDiag.setText("Cruzamento de diagonais");
        jMenuMetodo.add(jRadioButtonMenuItemCrossDiag);

        buttonGroup1.add(jRadioButtonMenuItemFujimoto);
        jRadioButtonMenuItemFujimoto.setText("Fujimoto");
        jMenuMetodo.add(jRadioButtonMenuItemFujimoto);

        buttonGroup1.add(jRadioButtonMenuItemHaag);
        jRadioButtonMenuItemHaag.setText("Haag");
        jMenuMetodo.add(jRadioButtonMenuItemHaag);

        buttonGroup1.add(jRadioButtonMenuItemNoma);
        jRadioButtonMenuItemNoma.setText("Noma");
        jMenuMetodo.add(jRadioButtonMenuItemNoma);

        buttonGroup1.add(jRadioButtonMenuItemHaga);
        jRadioButtonMenuItemHaga.setText("Haga");
        jMenuMetodo.add(jRadioButtonMenuItemHaga);

        jMenuBar.add(jMenuMetodo);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(this::jMenuItemSobreActionPerformed);
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar.add(jMenuAjuda);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGradeActionPerformed
        jPanelDesenho.zeraMetodos();
        try {
            int n = (int) jSpinnerGrade.getValue();
            nomePadrao = "Grade " + n + "x" + n;
            jPanelDesenho.setN(n);
            if (jRadioButtonMenuItemCrossDiag.isSelected()){
                jPanelDesenho.diagonais = true;
                 nomePadrao += " diagonais";
            }
            if (jRadioButtonMenuItemFujimoto.isSelected()){
                jPanelDesenho.Fujimoto = true;
                nomePadrao += " Fujimoto";
            }
            if (jRadioButtonMenuItemHaag.isSelected()){
                jPanelDesenho.Haag = true;
                nomePadrao += " Haag";
            }
            if (jRadioButtonMenuItemNoma.isSelected()){
                jPanelDesenho.Noma = true;
                nomePadrao += " Noma";
            }
            if (jRadioButtonMenuItemHaga.isSelected()){
                jPanelDesenho.Haga = true;
                nomePadrao += " Haga";
            }
        } catch (GradeInvalidaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            repaint();
        }
    }//GEN-LAST:event_jButtonGradeActionPerformed

    private void jButtonPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassoActionPerformed
        passo_a_passo_janela passo_a_passo = new passo_a_passo_janela(this, true, jPanelDesenho.sequencia);
        passo_a_passo.setLocationRelativeTo(null);
        passo_a_passo.setVisible(true);
    }//GEN-LAST:event_jButtonPassoActionPerformed

    private void jMenuItemSalvarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalvarImagemActionPerformed
        // Cria um BufferedImage do tamanho do painel
        BufferedImage imagem = new BufferedImage(
                jPanelDesenho.getWidth(),
                jPanelDesenho.getHeight(),
                BufferedImage.TYPE_INT_RGB);

        // Renderiza o painel dentro da imagem
        Graphics2D g2d = imagem.createGraphics();
        jPanelDesenho.paint(g2d);
        g2d.dispose();

        // Abre um JFileChooser para escolher onde salvar
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar imagem");
        try{
            fileChooser.setSelectedFile(new File(nomePadrao)); // nome padrão
            // Filtro para PNG e JPEG
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG", "png"));
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JPEG", "jpg", "jpeg"));

            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File arquivo_para_salvar = fileChooser.getSelectedFile();

                // Descobre extensão escolhida
                String ext = "png"; // padrão
                String nome_do_arquivo = arquivo_para_salvar.getName().toLowerCase();
                if (nome_do_arquivo.endsWith(".jpg") || nome_do_arquivo.endsWith(".jpeg")) {
                    ext = "jpg";
                } else if (nome_do_arquivo.endsWith(".png")) {
                    ext = "png";
                } else {
                    // Força extensão padrão
                    arquivo_para_salvar = new File(arquivo_para_salvar.getAbsolutePath() + ".png");
                }

                try {
                    ImageIO.write(imagem, ext, arquivo_para_salvar);// Salva o arquivo
                    JOptionPane.showMessageDialog(this, "Imagem salva em: " + arquivo_para_salvar.getAbsolutePath(),
                            "Mensagem", JOptionPane.DEFAULT_OPTION);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar imagem: " + ex.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Erro ao salvar imagem: " + ex.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_jMenuItemSalvarImagemActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        Sobre janelaSobre = new Sobre(this, true);
        janelaSobre.setLocationRelativeTo(null);
        janelaSobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGrade;
    private javax.swing.JButton jButtonPasso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvarImagem;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuMetodo;
    private javax.swing.JPanel jPanel1;
    private PainelDesenho jPanelDesenho;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemCrossDiag;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemFujimoto;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemHaag;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemHaga;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemNoma;
    private javax.swing.JSpinner jSpinnerGrade;
    // End of variables declaration//GEN-END:variables
}
