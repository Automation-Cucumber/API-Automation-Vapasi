package APITestMethods;

import ResponseClass.BookDetailByAuthorResponse;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.print.Book;

public class GetBooksByAuthorNameAPITest {

    @Test
    public void getBookByName() {
        RestAssured.baseURI = "http://216.10.245.166/";
        Response responseGetBook = RestAssured.given().queryParam("AuthorName","Sumita")
                .header("Content-Type", "application/json")
                .when().get("Library/GetBook.php")
                .then().statusCode(200).extract().response();

        //System.out.println(responseGetBook.asString());
        BookDetailByAuthorResponse book =  responseGetBook.as(BookDetailByAuthorResponse.class);
        System.out.println("Response of the book is " + responseGetBook);
       // JsonPath js =new JsonPath(responseGetBook);//Parsed Json
        //String bookname = js.getString("book_name");
        //System.out.println(bookname);

    }}

