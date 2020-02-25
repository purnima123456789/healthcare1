package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.RegistrationPage;
import bean.adminPage;

public class Admin {

	public static void main(String[] args, Object ArrayList) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        List<String> test_name = new ArrayList<String>();
        test_name.add("mri");
        test_name.add("cti");
        
        List<String> test_name1 = new ArrayList<String>();
        test_name1.add("blood group");
        test_name1.add("blood pressure");
        
        List<String> test_name2 = new ArrayList<String>();
        test_name2.add("urine test");
        test_name2.add("ct scan");
        
        map.put("KidwaiNagar", test_name);
        map.put("delhi", test_name1);
        map.put("kanpur", test_name2);
        
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "\n");
        }
        adminPage r=new adminPage();
		int n=0;
		try
		{
		
		
		do
		{
			System.out.println("\t\t 1. if we want to add center");
			System.out.println("\t\t 2. if we want to remove center");
			System.out.println("\t\t 3. if we want to add test name");
			System.out.println("\t\t 4. if we want to remove  test");
			
			
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			int c=Integer.valueOf(br1.readLine());
			switch(c)
			{
			case 1:
			{
				System.out.println("enter the center name to add");
				 String CenterName=br1.readLine();	
			     r.setCenter_name(CenterName);
			     
			     String p=r.getCenter_name();
			     ArrayList<String> al2=new ArrayList<String>();
			     System.out.println("\tenter the first test");
					String TestName=br1.readLine();
					 System.out.println("\tenter the second test");
					String TestName1=br1.readLine();
					al2.add(TestName);
					al2.add(TestName1);
			        adminPageImple obj1=new adminPageImple(); 

		         obj1.addCenter( map, p,  al2);
		        break;
		 
			}
			case 2:
			{
				System.out.println("enter the center name to remove ");
				String CenterName=br1.readLine();
				adminPageImple obj1=new adminPageImple();
		 obj1.removeCenter(map, CenterName);
		 break;
			}
			case 3:
			{
				System.out.println("enter the test name to add");
				String TestName1 =br1.readLine();
				
		 System.out.println("enter the key value at which it is adding");
		 String s=br1.readLine();
		 adminPageImple obj3=new adminPageImple();
		 obj3.addTest(map,s, TestName1);
		 break;
		
			}
			case 4:
			{
				System.out.println("enter the test name");
				String TestName1 =br1.readLine();
				System.out.println("enter the key value at which removing has to be done");
				String s=br1.readLine();
		 adminPageImple obj4=new adminPageImple();
		 obj4.removeTest(map,s, TestName1);
		 break;
			}
			default:
			{
				System.out.println("invalid choice");
			}
			}
		
		}
		while(n<=2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

				
			}

}
