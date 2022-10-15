import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONSimpleExample {

	public static void main(String[] args) throws ParseException {
		String json = "{\"name\": \"John\", \"age\": 32, \"job\": \"developer\"}";
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(json);
		JSONObject jsonObject = (JSONObject) obj;
		String name = (String) jsonObject.get("name");
		System.out.println(name);
	

	}

}
