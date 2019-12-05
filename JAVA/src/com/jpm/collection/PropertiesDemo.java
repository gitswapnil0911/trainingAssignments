package com.jpm.collection;
import java.util.Properties;
import java.util.Enumeration;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class PropertiesDemo {


    private static Properties createDefaultProperties() {
        Properties prop = new Properties();
        prop.setProperty("Swapnil", "Java1");
        prop.setProperty("Ashish", "Java2");
        prop.setProperty("Karan", "Java3");
        prop.setProperty("Amit", "Java4");
        return prop;
    }
    public static void printProperties(Properties p){
        p.list(System.out);
    }

    private static void saveProperties(Properties p, String fileName) {
        OutputStream propsFile;

        try {
            propsFile = new FileOutputStream(fileName);
            p.store(propsFile, "Properties File");
            propsFile.close();
        } catch (IOException ioe) {
            System.out.println("I/O Exception.");
            ioe.printStackTrace();
            System.exit(0);
        }

    }
    private static Properties loadProperties(String fileName) {
        InputStream propsFile;
        Properties tempProp = new Properties();
        try {
            propsFile = new FileInputStream(fileName);
            tempProp.load(propsFile);
            propsFile.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.exit(0);
        }
        return tempProp;
    }

    public static void main(String[] args) {
        final String PROPFILE = "MyLogin.properties";
        Properties myProp, myNewProp;
        myProp = createDefaultProperties();
        printProperties(myProp);
        saveProperties(myProp, PROPFILE);
        myNewProp = loadProperties(PROPFILE);
        printProperties(myNewProp);
        saveProperties(myNewProp, PROPFILE);
        Properties myNewProp1 = loadProperties(PROPFILE);
        Enumeration enProps = myNewProp1.propertyNames();
		/*while (enProps.hasMoreElements()) {
			key = (String) enProps.nextElement();
			System.out.println(key);
			param[i] = (String) myNewProp1.getProperty(key);
			System.out.println("  " + key + "  ->  " + myNewProp1.getProperty(key));
			i++;
		}*/

    }
}

