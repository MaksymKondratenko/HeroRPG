package DAO;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Getter
public class PropertyAgent {
    Properties props = new Properties();
    private String dbUrl;
    private String fullUrl;
    private String dbName;
    private String connectionArgs;
    private String user;
    private String password;

    public void getProperties(){
        try {
            props.load(new FileInputStream("src\\main\\resources\\DAO\\database_properties.properties"));
        } catch (FileNotFoundException e){
            System.err.println("File not found");
        } catch (IOException e){
            e.printStackTrace();
        }

        dbUrl = props.getProperty("dbUrl");
        fullUrl = props.getProperty("fullUrl");
        dbName = props.getProperty("dbName");
        connectionArgs = props.getProperty("connectionArgs");
        user = props.getProperty("user");
        password = props.getProperty("password");
    }
}
