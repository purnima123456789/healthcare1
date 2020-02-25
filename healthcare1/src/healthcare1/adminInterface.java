package healthcare1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bean.adminPage;

public interface adminInterface {
	public void addCenter(Map<String, List<String>> map, String r ,ArrayList<String> al2);
	public void removeCenter(Map<String, List<String>> map, String r);
	public void addTest(Map<String, List<String>> map, String s,String r);
	public void removeTest(Map<String, List<String>> map, String s,String r);
	public void approveTest(adminPage r);
	
	
	

}
