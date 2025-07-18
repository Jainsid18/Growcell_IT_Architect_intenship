import java.lang.*;
import java.io.*;
class FileEx
{
	public static void main(String args[])
	{
		try
		{
		  FileInputStream fis= new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Myjava\\Source1.txt");
		  FileOutputStream fos= new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Myjava\\Source2.txt");
		  
		  int b;
		  while((b = fis.read() )!= -1)
		  {
			  if(b >=65 && b<=90)
				  fos.write(b+32);
			  else 
				  fos.write(b);
		  }
		  fis.close();
		  fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
		