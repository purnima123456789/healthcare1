package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import bean.RegistrationPage;
public class LoginData {


	
	    public static void main(String[] args) {
	    	try
	    	{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        ArrayList<List<String>> map = new ArrayList< List<String>>();
	       
	        List<String> valSetOne = new ArrayList<String>();
	        valSetOne.add("arti");
	        valSetOne.add("purnima");
	        
	        List<String> valSetTwo = new ArrayList<String>();
	        valSetTwo.add("81274891");
	        valSetTwo.add("83248918");
	        
	        
	        List<String> valSetThree = new ArrayList<String>();
	        valSetThree.add("arti");
	        valSetThree.add("purnima");
	        
	        List<String> valSetFour = new ArrayList<String>();
	        valSetFour.add("arti");
	        valSetFour.add("purnima");
	       
	        map.add( valSetOne);
	        map.add( valSetTwo);
	        map.add( valSetThree);
	        map.add(valSetFour);
	        
	        RegisterPageImple obj3=new RegisterPageImple();
	        
	        System.out.println("enter the password");
	        String s=br.readLine();
	        
	        obj3.logininfo(map,s);
	        
	        
	    }
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	}
}
