package boot.student;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}

@Test
public void makeSureThatGoogleIsUp() {
    System.out.println(given(). param("id", 3).when().get("http://localhost:8080/get").thenReturn().getStatusCode());
}

}
