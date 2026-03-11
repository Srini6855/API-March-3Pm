package org.jsonread;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee_read {

	public static void main(String[] args) throws IOException, ParseException {

		// Java cannot understand JSON without parsing, thats why we use JSON Parser
		JSONParser jsonParser = new JSONParser();

		// Specifi the file location of JSON
		FileReader fileReader = new FileReader("C:\\Greens\\API_Class_)3_Pm\\src\\test\\resources\\employee.json");

		// parse method which converts JSON file into generic java data
		Object object = jsonParser.parse(fileReader);

		// We need to convert this object into json object using type casting
		JSONObject employee = (JSONObject) object;

		Object name = employee.get("name");

		// we can convert object to string
		String names = (String) name;

		System.out.println(names);
		
		//Casting - Converting one data type into another
		
		//String names = (String) name;
		
		//String -> Class
		
		//WebDriver driver = new ChromeDriver();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		

	}

}
