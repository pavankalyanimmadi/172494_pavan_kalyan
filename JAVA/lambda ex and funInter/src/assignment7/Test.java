package assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("pavan","Guntur");
		map.put("kiran","hyd");
		map.put("durga","guntur");
		map.put("revanth","guntur");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
		

	}

}
