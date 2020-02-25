package healthcare1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.RegistrationPage;
import bean.adminPage;

public class adminPageImple implements adminInterface {
	
HashMap<String, List<String>> l=new HashMap<String, List<String>>();

	@Override
	public void addCenter( Map<String, List<String>> map, String r, ArrayList<String> al2)
	{     
		map.put(r,al2);
		System.out.println("done");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
	 }
		
	}

	@Override
	public void removeCenter( Map<String, List<String>> map, String r) {
		for(int i=0;i<map.size();i++)
		{
		if(map.containsKey(r))
		{
		map.remove(r);
		
		}
		System.out.println("Done");
		 for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	            String key = entry.getKey();
	            List<String> values = entry.getValue();
	            System.out.println("Key = " + key);
	            System.out.println("Values = " + values + "n");
		 }
	}
	}

	@Override
	public void addTest(Map<String, List<String>> map, String s, String r) {
		if(map.containsKey(s)){
		    map.get(s).add(r);
		    System.out.println("Done");
		} else {
		   List<String> list = new ArrayList<>();
		   list.add(r);
		   map.put(s, list);
		   System.out.println("newly Done");
		}
		
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
		}
	}

	@Override
	public void removeTest(Map<String, List<String>> map, String s, String r) {
		if(map.containsKey(s))
		{
			map.get(s).remove(r);
			System.out.println("Done");
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	            String key = entry.getKey();
	            List<String> values = entry.getValue();
	            System.out.println("Key = " + key);
	            System.out.println("Values = " + values + "n");
		}
		}
		else
		{
			System.out.println("Not done");
		}
	}

	@Override
	public void approveTest(adminPage p) {
		
		
	}



	
}
