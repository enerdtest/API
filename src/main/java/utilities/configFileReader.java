package utilities;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {
   private Properties props;
   private final String filePath = ("dataSource/properties.properties");

   public configFileReader(){
      BufferedReader buffer;

      try {
         buffer = new BufferedReader(new FileReader(filePath));
         props = new Properties();
         try {
            props.load(buffer);
            buffer.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      } catch (FileNotFoundException e) {
         throw new RuntimeException("properties file not found! " + filePath);
      }
   }

   public  String getDriverPath(){
      String driverPath = props.getProperty("driverPath");
      if (driverPath != null){
         return driverPath;
      }else
         throw new RuntimeException("Driver Path was not defined in properties file! ");
   }

   public String getURL(){
      String urlPath = props.getProperty("urlPath");
      if (urlPath != null){
         return urlPath;
      }else
         throw new RuntimeException("URL was not set in the properties file!");
   }

   public long getImplicitlyWait(){
      String waitTime = props.getProperty("waitTime");
      if (waitTime != null){
         return Long.parseLong(waitTime);
      }else
         throw new RuntimeException("Implicitly wait was not defined in the properties file!");
   }

}
