package preferencias;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;


public class ConfigBundle extends ResourceBundle {

    private final Properties prop = new Properties();

    public ConfigBundle(String path) {
        try (InputStream in = new FileInputStream(path)) {
            prop.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar config", e);
        }
    }

    @Override
    protected Object handleGetObject(String key) {
        return prop.getProperty(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(prop.stringPropertyNames());
    }
    
}