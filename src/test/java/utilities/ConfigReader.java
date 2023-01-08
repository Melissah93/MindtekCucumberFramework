package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //set path to this file, so we can read its content

   private static FileInputStream input;
   private static Properties properties;

    static { // creating static block to initialize static variables, you don't need to create an object
        String path = System.getProperty("user.dir")+"/src/test/resources/configurations/Configuration.properties";
              //  "/Users/melissaherrera/IdeaProjects/MindtekTestNGFramework/src/test/resources/configurations/Configuration.properties";

        try {
            input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
        } catch (FileNotFoundException e) {
            System.out.println("Path properties file is invalid");
        }catch (IOException e) {
            System.out.println("Failed to load the properties files");
        } finally {
            try {
                assert  input != null;
                input.close();
            } catch (IOException e) {
                System.out.println("Exception occurred while closing input object");
            }
        }
    }

    public static String getProperty(String key){ //returning string bc value in conf properties is String
        return properties.getProperty(key);
    }
}
