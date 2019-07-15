package Qainfotech.SnlRest;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Snl {
  @Test
//  public void f() {
//	  when().
//	  get("http://localhost:8080/lotto/{id}",5).
//      then().
//      statusCode(200);
//	  
//	  	Response r=when().
//	  		  get("http://localhost:8080/lotto/{id}",5);
//	  	        System.out.println("asfe : -"+r.asString());
//  }
  
  
  @BeforeTest
  public void a() {
//	  when().
//	         get("http://10.0.1.86/snl/rest/v1/board.json").
//	  then().
//	  		 statusCode(200);//	         assertThat().
	         
	  Response r=	  when().
		         get("http://10.0.1.86/snl/rest/v1/board/new.json");
	  System.out.println(r.asString());
	  JSONObject json=new JSONObject(r.asString());
	  System.out.println(json.getJSONObject("response").getJSONObject("board").get("id"));
	  
//	  when().
//      get("/lotto/{id}", 5).
//then().
//      statusCode(200).
//      body("lotto.lottoId", equals(5),
//           "lotto.winners.winnerId", hasItems(23, 54));
     
  }
  int id;

	@BeforeTest
	public void init() {
		id = 0;
	}


	@Test(priority = -2)
	public void add_new_player_check() {
		Response r = when().
			    get("http://10.0.1.86/snl/rest/v1/board/{kuchbhi}.json","9110");
					id = r.path("response.board.id");
					System.out.println("Board Id :- " + id);
		when().
		   get("http://10.0.1.86/snl/rest/v1/board/{id}.json",id).
		      then().
		         assertThat().
		            body("response.board.players.id",hasSize(4));			
	}
	
	@Test (priority = 3)
	public void add_new_player(){
		Response r =when().
		   post("http://10.0.1.86/snl/rest/v1/player.json").andReturn();//then().assertThat().body("response.board.players.id",hasSize(4));
		System.out.println("Response is :- "+r);
//		given().and().param("","").body("","");
//		when().get().then().and().and().assertThat().body(arg0, arg1)
	}
/*
	 * public static void main(String[] args) { given(). when().
	 * get("http://ergast.com/api/f1/2017/circuits.json"). then(). assertThat().
	 * body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	 * System.out.println("ho gaya"); }
	 */


}
