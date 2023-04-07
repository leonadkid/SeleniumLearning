package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("/Users/phu/IdeaProjects/SeleniumLearning/src/test/resources/configfiles/config.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("testurl"));
    }

}
