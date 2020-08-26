package SelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class settingglobalvar {

	public static void main(String[] args) throws Exception {
		Properties pro= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Syamantak\\workspace\\SeleniumDemo\\src\\SelDemo\\data.properties");
        pro.load(fis);
        System.out.println(pro.getProperty("browser"));
        System.out.println(pro.getProperty("url"));
        pro.setProperty("browser", "Firefox");
        System.out.println(pro.getProperty("browser"));
        FileOutputStream fos= new FileOutputStream("C:\\Users\\Syamantak\\workspace\\SeleniumDemo\\src\\SelDemo\\data.properties");
        pro.store(fos, "changed by syamantak");
	}

}
