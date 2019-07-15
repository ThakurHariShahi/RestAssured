package Qainfotech.SnlRest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasItems;

import java.util.ArrayList;
import java.util.HashMap;

import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Example1 {

	final static String ROOT_URI = "http://10.0.1.86/snl/rest/v1/board/9110.json";

	@Test
	public void f() {
		Response r = get(ROOT_URI + "");
		System.out.println("Board :- "+r.asString());

		JSONObject json = new JSONObject(r.asString());
		System.out.println(json.getJSONObject("response").getJSONObject("board").get("id"));
		
/******************************************Another Way *********************************************************************/
		
		r = when().get("http://10.0.1.86/snl/rest/{a}/board/9110.json", "v1");

		int id = r.path("response.board.id");
		System.out.println("1.Board Id :- " + id);

		ArrayList a = r.path("response.board.players", ".json");
		System.out.println("2.Players Array :- " + a);

		HashMap j = r.path("", ".json");
		System.out.println("3.Json object :- " + j);

/************************************************************************************************************************/		
		
		
		
		r.then().body("response.board.players.id", hasItems(4453, 4455));
		
		ValidatableResponse b = r.then().body("response.board.players.name", hasItems("hari2"));
		System.out.println("Validatable Response :- "+b);
	}
}
