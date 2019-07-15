package Qainfotech.SnlRest;

import static org.assertj.core.api.Assertions.assertThat;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.hasSize;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Rest {
	int Bid = 9154,Pid;
	Response r;
	String ver = "v1";

	JSONObject jo1 = new JSONObject(), jo2 = new JSONObject();;
	ArrayList al;
	HashMap hm;

	// @BeforeMethod
	// public void GetBoardId() {
	// r = when().get("http://10.0.1.86/snl/rest/v1/board/new.json");
	// System.out.println("Complete Board :- " + r.asString());
	// HashMap j = r.path("",".json");
	// System.out.println("Complete board :- "+j);
	//
	// Bid = r.path("response.board.id");
	// System.out.println("Board Id :- " + Bid);
	// }
	//
//	@Test(priority = -7)
//	public void AddNewPlayer() {
//		for (int i = 1; i <= 4; i++) {
//			jo1 = new JSONObject();
//			jo1.put("board", Bid);
//
//			jo2 = new JSONObject();
//			jo2.put("name", "hari" + i);
//			jo1.put("player", jo2);
//			if (i <= 4) {
//				given().body(jo1.toString()).post("http://10.0.1.86/snl/rest/{ver}/player.json", ver);
//				System.out.println("Player Has Been Added");
//
//			} else {
//				System.out.println("Maximum Player Exceeded");
//				break;
//			}
//		}
//		r = when().get("http://10.0.1.86/snl/rest/v1/board/{Bid}.json", Bid);
//		al = r.path("response.board.players");
//		System.out.println("Players Are :- " + al);
//	}
//	@Test(priority = -6)
//	public void CheckIfPlayerAlreadyExits() {
//		when().
//		   get("http://10.0.1.86/snl/rest/{ver}/board/{Bid}.json",ver,Bid).
//		      then().assertThat().
//     body("response.board.players.name" provides collection not array,
//					So we use hasItem To check for value 	
//		      body("response.board.players.name",hasItem("hari1"));
//	}	
//	@Test(priority = -5)
//	public void CheckForValidNoOfPLayers() {
//		when().get("http://10.0.1.86/snl/rest/{ver}/board/{Bid}.json",ver,Bid)
//		.then().assertThat().body("response.board.players.id",hasSize(4));
//	
//		
//		r = when().get("http://10.0.1.86/snl/rest/{ver}/board/{Bid}.json",ver,Bid);
//		r.then().assertThat().body("response.board.players.id",hasSize(1));
//		System.out.println(r.path("response.board.players"));
//	}
//	
//	@Test(priority = -4)
//	public void DeletePlayer() {
//		r =  when().
//		       get("http://10.0.1.86/snl/rest/{ver}/board/{Bid}.json",ver,Bid);
//		Pid = r.path("response.board.players[0].id");
//		when().
//		   delete("http://10.0.1.86/snl/rest/{ver}/player/{pid}.json",ver,Pid).
//		      then().assertThat().
//		         statusCode(500);
//		r = when().
//		   get("http://10.0.1.86/snl/rest/{ver}/board/{Bid}.json",ver,Bid);
//		al = r.path("response.board.players.name");   
//		System.out.println("PLayers Array :- "+al);
//	}
}














