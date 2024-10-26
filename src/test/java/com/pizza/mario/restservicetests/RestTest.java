package com.pizza.mario.restservicetests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class RestTest {

    @Test
    void restTest(){

        /*
        //Need append authorized
        String authReg = "{\n" +
                "  \"username\":\"admin\"\n," +
                "  \"password\":\"admin\"\n," +
                "}";
        String token = RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(authReg)
                .post("http://localhost:8081/api/pizza/v1/authenticate")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response().jsonPath().getString("$.token");

        String bodyRest = "{\n" +
                "    \"sizePizza\":\"small\",\n" +
                "    \"namePizza\":\"russian president\",\n" +
                "    \"colorDoughPizza\":\"white\",\n" +
                "    \"cookingTimePizza\":2\n" +
                "}";

        RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(bodyRest)
                .post("http://localhost:8081/api/pizza")
                .then()
                .log().all()
                .statusCode(200);
        */
        // Work version
        String bodyRest = "{\n" +
                "    \"sizePizza\":\"small\",\n" +
                "    \"namePizza\":\"russian president\",\n" +
                "    \"colorDoughPizza\":\"white\",\n" +
                "    \"cookingTimePizza\":2\n" +
                "}";

        RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(bodyRest)
                .post("http://localhost:8081/api/pizza")
                .then()
                .statusCode(200);

    }
}
