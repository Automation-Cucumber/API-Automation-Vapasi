package APITestMethods;

import org.openqa.selenium.json.Json;

public class payload {

    public static String Addbook(String aisle,String isbn)
    {
    String payload ="{\r\n\r\n\"name\":\"Maths3\",\r\n\"isbn\":\""+isbn+"\",\r\n\"aisle\":\""+aisle+"\",\r\n\"author\":\"Sumita Arora\"\r\n}\r\n";

        return payload;
    }
}
