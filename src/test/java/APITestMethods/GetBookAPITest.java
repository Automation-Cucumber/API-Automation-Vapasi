package APITestMethods;

import ResponseClass.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookAPITest {

    @Test
    public void verifyGetBookID()
    {
        //Specify Base URI
        RestAssured.baseURI ="http://216.10.245.166/";

        //Response Object
        Response response  = given().queryParams("ID","R1021002")
                .header("Content-Type","application/json")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .statusCode(200)
                .extract().response();


        //Print Response in Console Window
       String responseBody = response.asString();
        System.out.println("Response Body is :" +responseBody);

        //Status Code Validation
        int statusCode =response.getStatusCode();
        System.out.println("status code is:" +statusCode);
        Assert.assertEquals(statusCode,200);
        GetBookResponse[] book =  response.as(GetBookResponse[].class);
        Assert.assertEquals(book[0].getBookName(),"How to get Rich Part1");

}









}
