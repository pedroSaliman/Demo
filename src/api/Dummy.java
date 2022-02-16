package api;

public class Dummy {
public static String postdata() {
	
	
	return"{\r\n"
			+ "\r\n"
			+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
			+ "\"isbn\":\"bcd\",\r\n"
			+ "\"aisle\":\"227\",\r\n"
			+ "\"author\":\"John foe\"\r\n"
			+ "}";
}
public static String dummydata(String name,String jop) {
	return "{\r\n"
			+ "    \"name\": \""+name+"\",\r\n"
			+ "    \"job\": \""+jop+"\"\r\n"
			+ "}";
	
}
public static String jira() {
	return "{ \"username\": \"salimanmohamed20\", \"password\": \"2521997\" }";
}
public static String afterjira() {
	return "{\r\n"
			+ "    \"body\": \"Walled ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.\",\r\n"
			+ "    \"visibility\": {\r\n"
			+ "        \"type\": \"role\",\r\n"
			+ "        \"value\": \"Administrators\"\r\n"
			+ "    }\r\n"
			+ "}";
	
	
	
	
	
	
			}
public static String trello() {
	return "{\r\n"
			+ "    \"name\": \"medo\",\r\n"
			+ "    \"job\": \"soli\"\r\n"
			+ "}";
}
public static String auth() {
	return "{ \"username\": \"salimanmohamed20\", \"password\": \"2521997\" }\r\n"
			+ "";
}
public static String scrum() {
	return "{\"fields\": {\r\n"
			+ "        \"project\": {\r\n"
			+ "            \"key\": \"CRUD\"\r\n"
			+ "        },\r\n"
			+ "        \"summary\": \"Hitler\",\r\n"
			+ "        \"issuetype\": {\r\n"
			+ "            \"name\": \"Bug\"\r\n"
			+ "        }\r\n"
			+ "        }\r\n"
			+ "        }";
}
public static String comment() {
	return "{\r\n"
			+ "    \"body\": \"THE  WAR\",\r\n"
			+ "    \"visibility\": {\r\n"
			+ "        \"type\": \"role\",\r\n"
			+ "        \"value\": \"Administrators\"\r\n"
			+ "    }\r\n"
			+ "}";
}
}
