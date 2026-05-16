package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import preferencias.Config;

public class Preferencias extends javax.swing.JDialog {
    
    public Preferencias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Carrega o desenho das referências
        jPanelDesenhoGrade.diagonais = true;
        jPanelDesenhoGrade.n = 3;
        jPanelDesenhoGrade.repaint();
        // Carrega o desenho das marcações
        jPanelDesenhoMarcas.sequencia = new ArrayList<>();
        jPanelDesenhoMarcas.sequencia.add(1);
        jPanelDesenhoMarcas.sequencia.add(0);
        jPanelDesenhoMarcas.sequencia.add(1);
        jPanelDesenhoMarcas.passo_atual = 2;
        jPanelDesenhoMarcas.construirLinhas();
        jPanelDesenhoMarcas.repaint();
        // Seleciona o jradiobutton associado ao idioma
        if (Config.idioma.equals("pt-BR")) {
            jRadioButtonPT.setSelected(true);
        }
        if (Config.idioma.equals("en-US")) {
            jRadioButtonEN.setSelected(true);
        }
        // Carrega as configurações nos componentes
        jButton_vincos_ref.setBackground(Config.creaseRefColor);
        jButton_cor_grade.setBackground(Config.gridColor);
        jButton_cor_grade_ref.setBackground(Config.gridRefColor);
        jButton_cor_passoapasso.setBackground(Config.creaseStepByStepColor);
        jButton_cor_final_passoapasso.setBackground(Config.creaseStepByStepFInalColor);
        jSpinner_espessura_quadrado.setValue((int) Config.squareWidth);
        jSpinner_fonte.setValue(Config.fontSize);
        jSpinner_espessura_vincos_ref.setValue((int) Config.creaseRefWidth);
        jSpinner_espessura_grade.setValue((int) Config.gridWidth);
        jSpinner_espessura_grade_ref.setValue((int) Config.gridRefWidth);
        jSpinner_diametro.setValue(Config.diamCircle);
        jSpinner_espessura_circulo.setValue((int) Config.CircleWidth);
        jSpinner_espessura_passoapasso.setValue((int) Config.creaseStepByStepWidth);
        jSpinner_espessura_arco.setValue((int) Config.arcStepByStepWidth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonPT = new javax.swing.JRadioButton();
        jRadioButtonEN = new javax.swing.JRadioButton();
        jLabel_Aviso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanelConfig = new javax.swing.JPanel();
        jLabel_espessura_quadrado = new javax.swing.JLabel();
        jSpinner_espessura_quadrado = new javax.swing.JSpinner();
        jLabel_tamanho_fonte = new javax.swing.JLabel();
        jSpinner_fonte = new javax.swing.JSpinner();
        jPanel_vincos_ref = new javax.swing.JPanel();
        jLabel_espessura_vincos_ref = new javax.swing.JLabel();
        jSpinner_espessura_vincos_ref = new javax.swing.JSpinner();
        jLabel_cor_vincos_ref = new javax.swing.JLabel();
        jButton_vincos_ref = new javax.swing.JButton();
        jPanel_grade_ref = new javax.swing.JPanel();
        jLabel_espessura_grade_ref = new javax.swing.JLabel();
        jSpinner_espessura_grade_ref = new javax.swing.JSpinner();
        jLabel_cor_grade_ref = new javax.swing.JLabel();
        jButton_cor_grade_ref = new javax.swing.JButton();
        jPanel_grade = new javax.swing.JPanel();
        jLabel_espessura_grade = new javax.swing.JLabel();
        jSpinner_espessura_grade = new javax.swing.JSpinner();
        jLabel_cor_grade = new javax.swing.JLabel();
        jButton_cor_grade = new javax.swing.JButton();
        jPanel_circulo = new javax.swing.JPanel();
        jLabel_diametro = new javax.swing.JLabel();
        jSpinner_diametro = new javax.swing.JSpinner();
        jLabel_espessura_circulo = new javax.swing.JLabel();
        jSpinner_espessura_circulo = new javax.swing.JSpinner();
        jPanel_vinco_passoapasso = new javax.swing.JPanel();
        jLabel_espessura_passoapasso = new javax.swing.JLabel();
        jSpinner_espessura_passoapasso = new javax.swing.JSpinner();
        jLabel_cor_passoapasso = new javax.swing.JLabel();
        jButton_cor_passoapasso = new javax.swing.JButton();
        jLabel_cor_final_passoapasso = new javax.swing.JLabel();
        jButton_cor_final_passoapasso = new javax.swing.JButton();
        jLabel_espessura_arco = new javax.swing.JLabel();
        jSpinner_espessura_arco = new javax.swing.JSpinner();
        jPanelDesenhoGrade = new PainelDesenho();
        jPanelDesenhoMarcas = new PainelPassoAPasso();
        jButtonCancel = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButton_defaultSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Config.bundleLanguage.getString("windowPreference.title"));

        buttonGroup1.add(jRadioButtonPT);
        jRadioButtonPT.setSelected(true);
        jRadioButtonPT.setText("Português (BR)");

        buttonGroup1.add(jRadioButtonEN);
        jRadioButtonEN.setText("English");

        jLabel_Aviso.setText(Config.bundleMessage.getString("languageWarning"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Aviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonPT))
                        .addGap(0, 575, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonEN)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Aviso)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(Config.bundleLanguage.getString("windowPreference.tab.language"), jPanel1);

        jPanelConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_espessura_quadrado.setText("Espessura do quadrado:");

        jSpinner_espessura_quadrado.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jSpinner_espessura_quadrado.setName(""); // NOI18N
        jSpinner_espessura_quadrado.addChangeListener(this::jSpinner_espessura_quadradoStateChanged);

        jLabel_tamanho_fonte.setText("Tamanho da fonte:");

        jSpinner_fonte.setModel(new javax.swing.SpinnerNumberModel(12, 8, 30, 1));
        jSpinner_fonte.addChangeListener(this::jSpinner_fonteStateChanged);

        jPanel_vincos_ref.setBorder(javax.swing.BorderFactory.createTitledBorder(null, Config.bundleLanguage.getString("windowPreference.tab.draw.creaseRef")
            , javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 0, 14))); // NOI18N
    jPanel_vincos_ref.setLayout(new java.awt.GridLayout(0, 2, 0, 5));

    jLabel_espessura_vincos_ref.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.width"));
    jPanel_vincos_ref.add(jLabel_espessura_vincos_ref);

    jSpinner_espessura_vincos_ref.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
    jSpinner_espessura_vincos_ref.addChangeListener(this::jSpinner_espessura_vincos_refStateChanged);
    jPanel_vincos_ref.add(jSpinner_espessura_vincos_ref);

    jLabel_cor_vincos_ref.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.color"));
    jPanel_vincos_ref.add(jLabel_cor_vincos_ref);

    jButton_vincos_ref.addActionListener(this::jButton_vincos_refActionPerformed);
    jPanel_vincos_ref.add(jButton_vincos_ref);

    jPanel_grade_ref.setBorder(javax.swing.BorderFactory.createTitledBorder(null, Config.bundleLanguage.getString("windowPreference.tab.draw.gridRef")
        , javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 0, 14))); // NOI18N
jPanel_grade_ref.setLayout(new java.awt.GridLayout(0, 2, 0, 5));

jLabel_espessura_grade_ref.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.width")
    );
    jPanel_grade_ref.add(jLabel_espessura_grade_ref);

    jSpinner_espessura_grade_ref.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
    jSpinner_espessura_grade_ref.addChangeListener(this::jSpinner_espessura_grade_refStateChanged);
    jPanel_grade_ref.add(jSpinner_espessura_grade_ref);

    jLabel_cor_grade_ref.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.color")
    );
    jPanel_grade_ref.add(jLabel_cor_grade_ref);

    jButton_cor_grade_ref.addActionListener(this::jButton_cor_grade_refActionPerformed);
    jPanel_grade_ref.add(jButton_cor_grade_ref);

    jPanel_grade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, Config.bundleLanguage.getString("windowPreference.tab.draw.grid")
        , javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 0, 14))); // NOI18N
jPanel_grade.setLayout(new java.awt.GridLayout(0, 2, 0, 5));

jLabel_espessura_grade.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.width")
    );
    jPanel_grade.add(jLabel_espessura_grade);

    jSpinner_espessura_grade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
    jSpinner_espessura_grade.addChangeListener(this::jSpinner_espessura_gradeStateChanged);
    jPanel_grade.add(jSpinner_espessura_grade);

    jLabel_cor_grade.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.color")
    );
    jPanel_grade.add(jLabel_cor_grade);

    jButton_cor_grade.addActionListener(this::jButton_cor_gradeActionPerformed);
    jPanel_grade.add(jButton_cor_grade);

    jPanel_circulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, Config.bundleLanguage.getString("windowPreference.tab.draw.circleIntersection")
        , javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 0, 14))); // NOI18N
jPanel_circulo.setLayout(new java.awt.GridLayout(0, 2, 0, 5));

jLabel_diametro.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.diameter")
    );
    jPanel_circulo.add(jLabel_diametro);

    jSpinner_diametro.setModel(new javax.swing.SpinnerNumberModel(5, 5, 15, 1));
    jSpinner_diametro.addChangeListener(this::jSpinner_diametroStateChanged);
    jPanel_circulo.add(jSpinner_diametro);

    jLabel_espessura_circulo.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.width")
    );
    jPanel_circulo.add(jLabel_espessura_circulo);

    jSpinner_espessura_circulo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
    jSpinner_espessura_circulo.addChangeListener(this::jSpinner_espessura_circuloStateChanged);
    jPanel_circulo.add(jSpinner_espessura_circulo);

    jPanel_vinco_passoapasso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, Config.bundleLanguage.getString("windowPreference.tab.draw.creasesStep")
        , javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 0, 14))); // NOI18N
jPanel_vinco_passoapasso.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

jLabel_espessura_passoapasso.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.width")
    );
    jPanel_vinco_passoapasso.add(jLabel_espessura_passoapasso);

    jSpinner_espessura_passoapasso.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
    jSpinner_espessura_passoapasso.addChangeListener(this::jSpinner_espessura_passoapassoStateChanged);
    jPanel_vinco_passoapasso.add(jSpinner_espessura_passoapasso);

    jLabel_cor_passoapasso.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.color")
    );
    jPanel_vinco_passoapasso.add(jLabel_cor_passoapasso);

    jButton_cor_passoapasso.addActionListener(this::jButton_cor_passoapassoActionPerformed);
    jPanel_vinco_passoapasso.add(jButton_cor_passoapasso);

    jLabel_cor_final_passoapasso.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.finalCreaseColor")
    );
    jPanel_vinco_passoapasso.add(jLabel_cor_final_passoapasso);

    jButton_cor_final_passoapasso.addActionListener(this::jButton_cor_final_passoapassoActionPerformed);
    jPanel_vinco_passoapasso.add(jButton_cor_final_passoapasso);

    jLabel_espessura_arco.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.arcWidth"));

    jSpinner_espessura_arco.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
    jSpinner_espessura_arco.addChangeListener(this::jSpinner_espessura_arcoStateChanged);

    javax.swing.GroupLayout jPanelConfigLayout = new javax.swing.GroupLayout(jPanelConfig);
    jPanelConfig.setLayout(jPanelConfigLayout);
    jPanelConfigLayout.setHorizontalGroup(
        jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelConfigLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel_circulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_vincos_ref, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_grade_ref, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_vinco_passoapasso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelConfigLayout.createSequentialGroup()
                    .addComponent(jLabel_espessura_arco)
                    .addGap(18, 18, 18)
                    .addComponent(jSpinner_espessura_arco))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfigLayout.createSequentialGroup()
                    .addGroup(jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_espessura_quadrado)
                        .addComponent(jLabel_tamanho_fonte))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSpinner_fonte)
                        .addComponent(jSpinner_espessura_quadrado))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelConfigLayout.setVerticalGroup(
        jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelConfigLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_espessura_quadrado)
                .addComponent(jSpinner_espessura_quadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_tamanho_fonte)
                .addComponent(jSpinner_fonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel_vincos_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jPanel_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel_grade_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel_circulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel_vinco_passoapasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_espessura_arco)
                .addComponent(jSpinner_espessura_arco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanelDesenhoGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout jPanelDesenhoGradeLayout = new javax.swing.GroupLayout(jPanelDesenhoGrade);
    jPanelDesenhoGrade.setLayout(jPanelDesenhoGradeLayout);
    jPanelDesenhoGradeLayout.setHorizontalGroup(
        jPanelDesenhoGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 392, Short.MAX_VALUE)
    );
    jPanelDesenhoGradeLayout.setVerticalGroup(
        jPanelDesenhoGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 392, Short.MAX_VALUE)
    );

    jPanelDesenhoMarcas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanelDesenhoMarcas.setPreferredSize(new java.awt.Dimension(394, 394));

    javax.swing.GroupLayout jPanelDesenhoMarcasLayout = new javax.swing.GroupLayout(jPanelDesenhoMarcas);
    jPanelDesenhoMarcas.setLayout(jPanelDesenhoMarcasLayout);
    jPanelDesenhoMarcasLayout.setHorizontalGroup(
        jPanelDesenhoMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 392, Short.MAX_VALUE)
    );
    jPanelDesenhoMarcasLayout.setVerticalGroup(
        jPanelDesenhoMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 392, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 670, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDesenhoMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDesenhoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 806, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanelDesenhoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDesenhoMarcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap()))
    );

    jScrollPane1.setViewportView(jPanel3);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab(Config.bundleLanguage.getString("windowPreference.tab.draw"), jPanel2);

    jButtonCancel.setText(Config.bundleLanguage.getString("windowPreference.cancel"));
    jButtonCancel.addActionListener(this::jButtonCancelActionPerformed);

    jButtonOK.setText("OK");
    jButtonOK.addActionListener(this::jButtonOKActionPerformed);

    jButton_defaultSettings.setText(Config.bundleLanguage.getString("windowPreference.tab.draw.buttonRestore"));
    jButton_defaultSettings.addActionListener(this::jButton_defaultSettingsActionPerformed);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jTabbedPane1)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 404, Short.MAX_VALUE)
                    .addComponent(jButton_defaultSettings)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonOK)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonCancel)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jTabbedPane1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonCancel)
                .addComponent(jButtonOK)
                .addComponent(jButton_defaultSettings))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Config.loadConfig();//Alterar para as configurações já salvas
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if (jRadioButtonPT.isSelected()) {
            Config.setConfig("language", "pt-BR");
        }
        if (jRadioButtonEN.isSelected()) {
            Config.setConfig("language", "en-US");
        }
        Config.saveConfig();
        dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButton_vincos_refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vincos_refActionPerformed
        ColorChooserWindow colorChooser = new ColorChooserWindow(null, true);
        colorChooser.setVisible(true);
        jButton_vincos_ref.setBackground(colorChooser.cor());
        Config.creaseRefColor = colorChooser.cor();
        repaint();
    }//GEN-LAST:event_jButton_vincos_refActionPerformed

    private void jButton_cor_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cor_gradeActionPerformed
        ColorChooserWindow colorChooser = new ColorChooserWindow(null, true);
        colorChooser.setVisible(true);
        jButton_cor_grade.setBackground(colorChooser.cor());
        Config.gridColor = colorChooser.cor();
        repaint();
    }//GEN-LAST:event_jButton_cor_gradeActionPerformed

    private void jButton_cor_grade_refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cor_grade_refActionPerformed
        ColorChooserWindow colorChooser = new ColorChooserWindow(null, true);
        colorChooser.setVisible(true);
        jButton_cor_grade_ref.setBackground(colorChooser.cor());
        Config.gridRefColor = colorChooser.cor();
        repaint();
    }//GEN-LAST:event_jButton_cor_grade_refActionPerformed

    private void jButton_cor_passoapassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cor_passoapassoActionPerformed
        ColorChooserWindow colorChooser = new ColorChooserWindow(null, true);
        colorChooser.setVisible(true);
        jButton_cor_passoapasso.setBackground(colorChooser.cor());
        Config.creaseStepByStepColor = colorChooser.cor();
        repaint();
    }//GEN-LAST:event_jButton_cor_passoapassoActionPerformed

    private void jButton_cor_final_passoapassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cor_final_passoapassoActionPerformed
        ColorChooserWindow colorChooser = new ColorChooserWindow(null, true);
        colorChooser.setVisible(true);
        jButton_cor_final_passoapasso.setBackground(colorChooser.cor());
        Config.creaseStepByStepFInalColor = colorChooser.cor();
        repaint();
    }//GEN-LAST:event_jButton_cor_final_passoapassoActionPerformed

    private void jSpinner_espessura_quadradoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_quadradoStateChanged
        Config.squareWidth = (int) jSpinner_espessura_quadrado.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_quadradoStateChanged

    private void jSpinner_fonteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_fonteStateChanged
        Config.fontSize = (int) jSpinner_fonte.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_fonteStateChanged

    private void jSpinner_espessura_vincos_refStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_vincos_refStateChanged
        Config.creaseRefWidth = (float) (int) jSpinner_espessura_vincos_ref.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_vincos_refStateChanged

    private void jSpinner_espessura_gradeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_gradeStateChanged
        Config.gridWidth = (float) (int) jSpinner_espessura_grade.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_gradeStateChanged

    private void jSpinner_espessura_grade_refStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_grade_refStateChanged
        Config.gridRefWidth = (float) (int) jSpinner_espessura_grade_ref.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_grade_refStateChanged

    private void jSpinner_diametroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_diametroStateChanged
        Config.diamCircle = (int) jSpinner_diametro.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_diametroStateChanged

    private void jSpinner_espessura_circuloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_circuloStateChanged
        Config.CircleWidth = (float) (int) jSpinner_espessura_circulo.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_circuloStateChanged

    private void jSpinner_espessura_passoapassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_passoapassoStateChanged
        Config.creaseStepByStepWidth = (float) (int) jSpinner_espessura_passoapasso.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_passoapassoStateChanged

    private void jSpinner_espessura_arcoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_espessura_arcoStateChanged
        Config.arcStepByStepWidth = (float) (int) jSpinner_espessura_arco.getValue();
        repaint();
    }//GEN-LAST:event_jSpinner_espessura_arcoStateChanged

    private void jButton_defaultSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_defaultSettingsActionPerformed
        // Altera o config.properties para os valores originais
        Config.setConfig("arcStepByStep.width", 2+"");
        Config.setConfig("circle.diam", 5+"");
        Config.setConfig("circle.width", 1+"");
        Config.setConfig("creaseRef.color", "255,0,0");
        Config.setConfig("creaseRef.width", 1+"");
        Config.setConfig("creaseStepByStep.color", "0,0,255");
        Config.setConfig("creaseStepByStep.width", 2+"");
        Config.setConfig("creaseStepByStepFinal.color", "0,255,0");
        Config.setConfig("fontSize", 14+"");
        Config.setConfig("grid.color", "0,255,0");
        Config.setConfig("grid.width", 1+"");
        Config.setConfig("gridRef.color", "255,0,255");
        Config.setConfig("gridRef.width", 1+"");
        Config.setConfig("squareWidth", 2+"");
        
        JOptionPane.showMessageDialog(rootPane, Config.bundleMessage.getString("restoreWarning"),
                Config.bundleMessage.getString("messageTitle"), JOptionPane.PLAIN_MESSAGE);
        
        dispose();
    }//GEN-LAST:event_jButton_defaultSettingsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButton_cor_final_passoapasso;
    private javax.swing.JButton jButton_cor_grade;
    private javax.swing.JButton jButton_cor_grade_ref;
    private javax.swing.JButton jButton_cor_passoapasso;
    private javax.swing.JButton jButton_defaultSettings;
    private javax.swing.JButton jButton_vincos_ref;
    private javax.swing.JLabel jLabel_Aviso;
    private javax.swing.JLabel jLabel_cor_final_passoapasso;
    private javax.swing.JLabel jLabel_cor_grade;
    private javax.swing.JLabel jLabel_cor_grade_ref;
    private javax.swing.JLabel jLabel_cor_passoapasso;
    private javax.swing.JLabel jLabel_cor_vincos_ref;
    private javax.swing.JLabel jLabel_diametro;
    private javax.swing.JLabel jLabel_espessura_arco;
    private javax.swing.JLabel jLabel_espessura_circulo;
    private javax.swing.JLabel jLabel_espessura_grade;
    private javax.swing.JLabel jLabel_espessura_grade_ref;
    private javax.swing.JLabel jLabel_espessura_passoapasso;
    private javax.swing.JLabel jLabel_espessura_quadrado;
    private javax.swing.JLabel jLabel_espessura_vincos_ref;
    private javax.swing.JLabel jLabel_tamanho_fonte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelConfig;
    private PainelDesenho jPanelDesenhoGrade;
    private PainelPassoAPasso jPanelDesenhoMarcas;
    private javax.swing.JPanel jPanel_circulo;
    private javax.swing.JPanel jPanel_grade;
    private javax.swing.JPanel jPanel_grade_ref;
    private javax.swing.JPanel jPanel_vinco_passoapasso;
    private javax.swing.JPanel jPanel_vincos_ref;
    private javax.swing.JRadioButton jRadioButtonEN;
    private javax.swing.JRadioButton jRadioButtonPT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_diametro;
    private javax.swing.JSpinner jSpinner_espessura_arco;
    private javax.swing.JSpinner jSpinner_espessura_circulo;
    private javax.swing.JSpinner jSpinner_espessura_grade;
    private javax.swing.JSpinner jSpinner_espessura_grade_ref;
    private javax.swing.JSpinner jSpinner_espessura_passoapasso;
    private javax.swing.JSpinner jSpinner_espessura_quadrado;
    private javax.swing.JSpinner jSpinner_espessura_vincos_ref;
    private javax.swing.JSpinner jSpinner_fonte;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
