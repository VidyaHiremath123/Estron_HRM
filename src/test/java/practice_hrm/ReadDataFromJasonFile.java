package practice_hrm;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class ReadDataFromJasonFile {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		JSONParser jp=new JSONParser();
		Object Jobject=jp.parse(new FileReader("./src/test/resources/CommonData.json"));
		JSONObject map=(JSONObject)Jobject;
		System.out.println(map.get("browser"));
		
		
		

	}

	
}
