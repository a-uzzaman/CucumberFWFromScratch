package testData;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

import java.io.FileReader;

import java.io.IOException;



public class jsonParser {

    public static JSONObject readJsonFile(String filePath) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        FileReader reader = new FileReader(filePath);

        Object obj = parser.parse(reader);

        return (JSONObject) obj;

    }



    public static String getValueByKey(JSONObject jsonObject, String key) {

        return (String) jsonObject.get(key);

    }

}
