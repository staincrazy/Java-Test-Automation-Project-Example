package utils;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class CredentialsProvider {

    static JSONParser jsonParser = new JSONParser();
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {


        try(FileReader fileReader = new FileReader("src/main/java/test_data/credentials.json"))
        {
            Object obj = jsonParser.parse(fileReader);
            JSONArray array = new JSONArray();
            array.add(obj);
            System.out.println(array);
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
