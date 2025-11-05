package Pages;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Paths;

public class PassWordReader {
    public String readPassword(){
        String filePath = "/Users/lakmalidissanayaka/automations/projects/passwords.properties";
        String password = "";
        //System.out.println("File exists: " + Files.exists(Paths.get("/Users/lakmalidissanayaka/automations/projects/passwords.properties")));
        try {
           password = Files.readString(Paths.get(filePath), StandardCharsets.UTF_8);
            //System.out.println("File content: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
return password;
    }
}

