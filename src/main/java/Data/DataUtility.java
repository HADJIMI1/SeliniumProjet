package Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;




    public class DataUtility {


        public static String getData(String keys)  {
            Properties properties = new Properties();


            try {
                InputStream file = DataUtility.class.getClassLoader().getResourceAsStream("Data.properties");

                properties.load(file);


                return properties.getProperty(keys);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }