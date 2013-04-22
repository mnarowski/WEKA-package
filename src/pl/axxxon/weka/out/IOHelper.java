package pl.axxxon.weka.out;

import java.io.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: mnarowski
 * Date: 22.04.13
 * Time: 19:12
 */
public final class IOHelper{

    private static final String EXTRA_PROPERTIES = "extra.properties";

    public static void write(String... params){
        for (String s:params){
            println(s);
        }
    }

    public static void write(Object... params){
        for (Object s:params){
            println(String.valueOf(s));
        }
    }

    private static void println(String s) {
        System.out.println(s);
    }


    public static Reader getFileReader(String file)
    {
        try {
            InputStream inputStream = new FileInputStream(file);
            return new BufferedReader(new InputStreamReader(inputStream));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public static Properties getProperties(){
        Properties properties = new Properties();
        try {
            properties.load(getFileReader(EXTRA_PROPERTIES));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return properties;
    }

}
