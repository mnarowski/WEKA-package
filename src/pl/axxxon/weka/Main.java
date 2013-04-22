package pl.axxxon.weka;

import pl.axxxon.weka.out.IOHelper;

import java.io.File;
import java.io.Reader;
import java.util.Properties;

public class Main {

    private static final String AUTHOR_NAME = "author.name";

    public static void main(String[] args) {
        IOHelper.write("Hello", "World",'!',17);
        Reader reader = IOHelper.getFileReader("datas\\emptytest.csv");
        Properties properties = IOHelper.getProperties();
        String author =  properties.getProperty(AUTHOR_NAME);
        if(reader == null){
            IOHelper.write("Nope its not",new File(".").getAbsolutePath());
        }

        IOHelper.write(author);
    }
}
