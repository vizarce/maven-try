import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONSimpleExample {

	public static void main(String[] args) throws ParseException {
		String json = "{\"name\": \"Samuel\", \"age\": 35, \"job\": \"developer\"}";
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(json);
		JSONObject jsonObject = (JSONObject) obj;
		String name = (String) jsonObject.get("name");
		Long age = (Long) jsonObject.get("age");
		String job = (String) jsonObject.get("job");
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
	

	}

}
