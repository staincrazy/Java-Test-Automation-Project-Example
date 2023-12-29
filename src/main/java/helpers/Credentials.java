package helpers;

import java.io.FileInputStream;
import java.util.Properties;

public class Credentials {
    private final String filename;

    private final Properties props = new Properties();

    public Credentials(String filename){
        this.filename = filename;
    }

    public String getCredential(String propertyName) {
            try{
                this.props.load(new FileInputStream(filename));
                return this.props.getProperty(propertyName);
            }catch (Exception e){
                System.out.println(e.getMessage());
                return null;
            }
        }
    }

