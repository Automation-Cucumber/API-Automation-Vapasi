package APITestMethods;

import RequestClass.AddBookRequest;
import ResponseClass.AddBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddExistingBooKAPITest {

    @Test

    public void addExistingBook() {

        //Specify the base URI
        RestAssured.baseURI = "http://216.10.245.166";

        Response response = given().header("Content-Type", "application/json")
                .body(payload.Addbook("b123","1234"))
                .when().post("/Library/Addbook.php")
                .then().log().all()
                .assertThat().statusCode(404).extract().response();
        AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
        Assert.assertEquals(addBookResponse.getMsg(), "Add Book operation failed, looks like the book already exists");


    }
}
