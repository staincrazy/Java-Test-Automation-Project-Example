package helpers;

import java.io.FileInputStream;
import java.util.Properties;

public class GetCredentials {
    private String filename;

    public GetCredentials (String filename){
        this.filename = filename;
    }

    public String getProperty(String propertyName) {
        Properties props = new Properties();
            try{
                props.load(new FileInputStream(filename));
                return props.getProperty(propertyName);
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }
    }

