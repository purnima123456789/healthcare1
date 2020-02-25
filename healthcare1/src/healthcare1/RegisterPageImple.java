package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.RegistrationPage;

public class RegisterPageImple implements RegisterInterface {

	static ArrayList<RegistrationPage> al=new ArrayList<RegistrationPage>();

	@Override
	public void register(RegistrationPage r) {
		al.add(r);
		Iterator<RegistrationPage> it=al.iterator();
		while(it.hasNext())
		{
			RegistrationPage s =it.next();
			System.out.println("\t\t"+s.getName()+"\t\t"+s.getPhonenumber()+"\t\t"+s.getUsername()+"\t\t"+s.getPassword());
		}
		System.out.println("registration is done");
		
		
		
	}
	public void logininfo(ArrayList<List<String>> map, String s) {
		boolean isExist = false;
		
		for  (int i = 0; i < map.size(); i++)
		{  
	          if (s.equals(map.get(i)))
	          { 
	              isExist=true;
	              break;

	          }
	          
	          }
		if(isExist)
		{
			System.out.println("u are sucssesfully logged in");
			
		}
		else
			System.out.println("not found");
		
	}
	@Override
	public void display(RegistrationPage p) {
		// TODO Auto-generated method stub
		
	}
	
	


}
