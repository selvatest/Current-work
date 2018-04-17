import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class prop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream(new File("D:\\M.selva\\Outside-Project-master\\src\\Resources\\config.properties"));
		Properties p= new Properties();
		p.load(f);
		System.out.println(p.getProperty("URL"));
				
	}

}
