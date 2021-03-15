package APITestMethods;

import RequestClass.AddBookRequest;
import ResponseClass.AddBookResponse;
import ResponseClass.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class AddNewBookAPITest {

    @Test

    public void addNewBook() {
        //Specify the base URI
        RestAssured.baseURI = "http://216.10.245.166";

        Response response = given().header("Content-Type", "application/json")
                .body(payload.Addbook("c1212","11133"))
                .when().post("/Library/Addbook.php")
                .then().log().all()
                .assertThat().statusCode(200).extract().response();

        AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
        Assert.assertEquals(addBookResponse.getMsg(), "successfully added");
        System.out.println("addBookResponse.getId() :" + addBookResponse.getId());


// Validate that the book has been added with getbook(id)

        String responseBookID = given().log().all().queryParams("ID", addBookResponse.getId())
                .when().get("/Library/GetBook.php")
                .then().statusCode(200).extract().response().asString();

        System.out.println("Response of the book is " + responseBookID);
        JsonPath js =new JsonPath(responseBookID);//Parsed Json
        String bookname = js.getString("book_name");
        System.out.println(bookname);
       Assert.assertEquals(bookname,"How to get Rich Part2");


    }
}










