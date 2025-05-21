package restAssured;

import io.restassured.RestAssured;

public class httpRequest1 {

    public static void main(String[] args){

        RestAssured.
                given().
                baseUri("https://reqres.in/").
                basePath("api/users/2").

                when().
                get().

                then().
                log().all().statusCode(200);
    }

}
