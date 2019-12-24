package com.zerobank.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
this below will read the properties file configuration.properties
 reads specifically from Configuration
 */
public class ConfigurationReader {
    private static Properties properties;


    static{
        try{
            //what file to read is below.
            String path = "configuration.properties";

            /*Java reads file in byte code. FileInputStream will help java read your byte code
            and make it easier for java to read*/
            FileInputStream input = new FileInputStream(path);

            //properties --> class that stores properties in key /value format.
            properties = new Properties();

            /*--------------so up to this point--------------------
                how to read the file we have and store it inside properties.
                */

            //the values from the file input Stream is loaded/ and fed to the properties object
            properties.load(input);

            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
      when i run, i will be connected to values.
    all i need to do in this case is call get method statically
    and say give me this property

     */
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }
}
