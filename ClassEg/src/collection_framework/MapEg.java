package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEg {
	
	public static void main(String[] args) {
		Map<String, String> users = new HashMap<>();
		
		users.put("Laura", "unicorn");
		users.put("Alice", "unicorn");
		users.put("Tom", "apple");
		
		// Return the value that was overwritten
		System.out.println(users.put("Laura", "new"));
		System.out.println(users.get("aaa"));
		System.out.println(users.get("Laura"));
		System.out.println(users);
		System.out.println(users.remove("Laura"));
		System.out.println(users);
		
		System.out.println();
		Set<String> theKeys = users.keySet();
		for(String username: theKeys) {
			String password = users.get(username);
			System.out.println(username + "\t" + password);
		}
		
		System.out.println();
		users.forEach((username, password) -> 
		System.out.println(username + "\t" + password));
		
		System.out.println();
		System.out.println(users.keySet());
		System.out.println(users.values());
	}
}
