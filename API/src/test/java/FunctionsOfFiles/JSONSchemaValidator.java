package FunctionsOfFiles;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.given;

public class JSONSchemaValidator {
	
	@Test
	public void printResponse() {
		
		String url = "https://gorest.co.in/public/v2/users?page=2";
		
		Response response = given()
							.when()
							.get(url);
		
		response.then().assertThat().body(matchesJsonSchemaInClasspath("schema.jsonn"));
		
		
	}
	

}
