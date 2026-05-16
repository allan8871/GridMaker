package preferencias;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ResourceBundle;
import java.util.Locale;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Config {
    //Configurações gerais
    public static ResourceBundle bundleConfig;
    //Configurações de idioma
    public static String idioma;
    public static Locale locale;
    public static ResourceBundle bundleLanguage;
    public static ResourceBundle bundleMessage;
    //-------------------------Configurações de desenho-------------------------
    //Espessura do quadrado
    public static float squareWidth;
    //Tamanho da fonte
    public static int fontSize;
    //Vincos de referência
    public static float creaseRefWidth;
    public static Color creaseRefColor;
    //Grade
    public static float gridWidth;;
    public static Color gridColor;
    //Referência da grade
    public static float gridRefWidth;
    public static Color gridRefColor;
    //Círculo de intersecção dos vincos
    public static int diamCircle;
    public static float CircleWidth;
    //Vincos do passo-a-passo
    public static float creaseStepByStepWidth;
    public static Color creaseStepByStepColor;
    //Vinco final do passo-a-passo
    public static Color creaseStepByStepFInalColor;
    //Arco passo-a-passo
    public static float arcStepByStepWidth;
    
    // Método para carregar as configurações
    public static void loadConfig() {
        bundleConfig = new ConfigBundle("config/config.properties");
        
        idioma = bundleConfig.getString("language");
        locale = Locale.forLanguageTag(idioma);
        bundleLanguage = ResourceBundle.getBundle("languages.language", locale);
        bundleMessage = ResourceBundle.getBundle("messages.message", locale);
        
        squareWidth = Float.parseFloat(bundleConfig.getString("squareWidth"));
        
        fontSize = Integer.parseInt(bundleConfig.getString("fontSize"));
        
        creaseRefWidth = Float.parseFloat(bundleConfig.getString("creaseRef.width"));
        String[] creaseRefColor_str = bundleConfig.getString("creaseRef.color").split(",");
        creaseRefColor = new Color(Integer.parseInt(creaseRefColor_str[0]),
                Integer.parseInt(creaseRefColor_str[1]),
                Integer.parseInt(creaseRefColor_str[2]));
        
        gridWidth = Float.parseFloat(bundleConfig.getString("grid.width"));
        String[] gridColor_str = bundleConfig.getString("grid.color").split(",");
        gridColor = new Color(Integer.parseInt(gridColor_str[0]),
                Integer.parseInt(gridColor_str[1]),
                Integer.parseInt(gridColor_str[2]));
        
        gridRefWidth = Float.parseFloat(bundleConfig.getString("gridRef.width"));
        String[] gridRefColor_str = bundleConfig.getString("gridRef.color").split(",");
        gridRefColor = new Color(Integer.parseInt(gridRefColor_str[0]),
                Integer.parseInt(gridRefColor_str[1]),
                Integer.parseInt(gridRefColor_str[2]));
        
        diamCircle = Integer.parseInt(bundleConfig.getString("circle.diam"));
        CircleWidth = Float.parseFloat(bundleConfig.getString("circle.width"));
        
        creaseStepByStepWidth = Float.parseFloat(bundleConfig.getString("creaseStepByStep.width"));
        String[] creaseStepByStepColor_str = bundleConfig.getString("creaseStepByStep.color").split(",");
        creaseStepByStepColor = new Color(Integer.parseInt(creaseStepByStepColor_str[0]),
                Integer.parseInt(creaseStepByStepColor_str[1]),
                Integer.parseInt(creaseStepByStepColor_str[2]));
        
        String[] creaseStepByStepFinalColor_str = bundleConfig.getString("creaseStepByStepFinal.color").split(",");
        creaseStepByStepFInalColor = new Color(Integer.parseInt(creaseStepByStepFinalColor_str[0]),
                Integer.parseInt(creaseStepByStepFinalColor_str[1]),
                Integer.parseInt(creaseStepByStepFinalColor_str[2]));
        
        arcStepByStepWidth = Float.parseFloat(bundleConfig.getString("arcStepByStep.width"));
    }
    
    // Método para salvar as configurações
    public static void saveConfig() {
        setConfig("creaseRef.color", RGBtoString(Config.creaseRefColor));
        setConfig("grid.color", RGBtoString(Config.gridColor));
        setConfig("gridRef.color", RGBtoString(Config.gridRefColor));
        setConfig("creaseStepByStep.color", RGBtoString(Config.creaseStepByStepColor));
        setConfig("creaseStepByStepFinal.color", RGBtoString(Config.creaseStepByStepFInalColor));
        setConfig("squareWidth", squareWidth+"");
        setConfig("fontSize", fontSize+"");
        setConfig("creaseRef.width", creaseRefWidth+"");
        setConfig("grid.width", gridWidth+"");
        setConfig("gridRef.width", gridRefWidth+"");
        setConfig("circle.diam", diamCircle+"");
        setConfig("circle.width", CircleWidth+"");
        setConfig("creaseStepByStep.width", creaseStepByStepWidth+"");
        setConfig("arcStepByStep.width", arcStepByStepWidth+"");
    }
    
    // Converte uma cor RGB para o formato String no config.properties
    private static String RGBtoString(Color cor) {
        return cor.getRed()+","+cor.getGreen()+","+cor.getBlue();
    }
    
    // Método para alterar config.properties
    public static void setConfig(String chave, String valor) {
        File arquivo_config = new File("config/config.properties");
        Properties prop = new Properties();
        try (InputStream in = new FileInputStream(arquivo_config)) {
            prop.load(in);
        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), bundleMessage.getString("errorMessageTitle"), JOptionPane.ERROR_MESSAGE);
        }
        // Atualiza a chave
        prop.setProperty(chave, valor);
        // Salva de volta no arquivo
        try (OutputStream out = new FileOutputStream(arquivo_config)) {
            prop.store(out, "Configurações da aplicação");
        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), bundleMessage.getString("errorMessageTitle"), JOptionPane.ERROR_MESSAGE);
        }
    }
}
