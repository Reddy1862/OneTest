import java.io.IOException;
import java.util.Base64;



public class EncodeFormat {


	

	public static String enCoode(String ssss ) throws IOException{
		
	//public static void main(String arg[]){ 
		// TODO Auto-generated method stub

				/*WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com");*/
				
				InputsFromExcel exceldata = new InputsFromExcel();
				 
				//String passWordd = new String(Base64.getEncoder().encode(password.getBytes()));
				String passWordd = new String(Base64.getEncoder().encode(exceldata.getData(0, 1, 1).getBytes()));
				System.out.println(passWordd);
				
				String decodedPassword = new String(Base64.getDecoder().decode(passWordd.getBytes()));
				System.out.println(decodedPassword);
				return decodedPassword;
	}
}
