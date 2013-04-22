package pl.axxxon.weka.out;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mnarowski
 * Date: 22.04.13
 * Time: 19:12
 */
public final class IOHelper{

    public static void write(String... params){
        for (String s:params){
            System.out.print(String.format("%s\n", s));
        }
    }

    public static void write(char... params){
        for (char s:params){
            System.out.print(String.format("%s\n", s));
        }
    }

    public static Reader readFileAsStream(String file)
    {
        try {
            InputStream inputStream = new FileInputStream(file);
            return new BufferedReader(new InputStreamReader(inputStream));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }



}
