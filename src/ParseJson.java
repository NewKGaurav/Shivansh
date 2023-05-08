package ParseJson;
import io.restassured.path.json.JsonPath;

public class ParseJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 JsonPath js=new JsonPath(payload.CoursePrice());
 System.out.println(js.getInt("courses.size"));
 System.out.println(js.get("dashboard.purchaseamount").toString());
 System.out.println(js.get("courses[0].title").toString());
 System.out.println("GIT HUB");

	}
	public static  void getData()
	{
		System.out.println("My first demo project on git");
	}

}
