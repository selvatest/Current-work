package Output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file {

	public static  BufferedWriter ProductionTab() throws IOException
	{
		File f= new File("E:\\M.selva\\Output\\Production.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
			
		}
		
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		return bw;
	}
	
	public static  BufferedWriter Homepage() throws IOException
	{
		File f= new File("E:\\M.selva\\Output\\Homepage.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
			
		}
		
		FileWriter fw= new FileWriter(f);
		BufferedWriter bwhome= new BufferedWriter(fw);
		return bwhome;
	}
	
}
