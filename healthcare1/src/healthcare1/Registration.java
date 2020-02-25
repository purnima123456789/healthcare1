package healthcare1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import bean.RegistrationPage;

public class Registration {

	public static void main(String[] args) {
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("====================================================================");
		System.out.println("Name");
		String name=br.readLine();
		System.out.println("Phone number");
		String phoneno =br.readLine();
		System.out.println("userid");
		String userid=br.readLine();
		System.out.println("password");
		String pass=br.readLine();
		 RegistrationPage r= new RegistrationPage();
		 r.setName(name);
		 r.setPhonenumber(phoneno);
		 r.setUsername(userid);
		 r.setPassword(pass);
		 RegisterPageImple obj1=new RegisterPageImple();
		 obj1.register(r);
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
