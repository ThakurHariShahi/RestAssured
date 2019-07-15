package Qainfotech.SnlRest;

import static io.restassured.RestAssured.when;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Example2 {

	int id;

	@Test(priority = -5)
	public void Getting_Details() {
		Response r = when().get("http://10.0.1.86/snl/rest/{a}/board/9110.json", "v1");

		id = r.path("response.board.id");
		System.out.println("1.Board Id :- " + id);

		ArrayList a = r.path("response.board.players", ".json");
		System.out.println("2.Players Array :- " + a);

		HashMap j = r.path("", ".json");
		System.out.println("3.Json object :- " + j);
		
/***********************************************************************************************/
		
		r = when().get("http://10.0.1.86/snl/rest/v1/board/9110.json");
		System.out.println(r.asString());
		JSONObject json = new JSONObject(r.asString());
		System.out.println(json.getJSONObject("response").getJSONObject("board").get("id"));
	}
}
