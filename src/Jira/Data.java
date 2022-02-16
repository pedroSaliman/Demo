package Jira;

public class Data {
	public static String data() {
		return "{\"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"SEL\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"something's wrong\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bugdefect\"\r\n"
				+ "        }\r\n"
				+ "        }\r\n"
				+ "        }";
	}
	public static String session() {
		return "{ \"username\": \"salimanmohamed20\", \"password\": \"2521997\" }";
	}
	public static String comment() {
		
		return "{\r\n"
				+ "    \"body\": \"THE FIRST WORLD WAR\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
	}

}
