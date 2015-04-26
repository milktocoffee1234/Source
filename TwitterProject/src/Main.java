import java.net.URL;
import java.util.Timer;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		Timer timer = new Timer();
		timer.schedule(new Task(), 10000);
		
		
		try {
			ObjectMapper m = new ObjectMapper();
			JsonNode rootNode = m.readTree(new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=020010"));
			System.out.println(rootNode);
			JsonNode nameNode = rootNode.get("forecasts");
			System.out.println(nameNode);
/*			String firstName = rootNode.path("first").textValue();
			String lastName = nameNode.path("last").textValue();*/

			JsonNode genderNode = rootNode.path("gender");
			String gender = genderNode.textValue();
/*
			System.out.println(firstName);
			System.out.println(lastName);*/
			//System.out.println(gender);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		JsonFactory f = new JsonFactory();
//		JsonParser jp = f.createParser(new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=400040"));
//		//jp.nextToken(); // will return JsonToken.START_OBJECT (verify?)
//		while (jp.nextToken() != JsonToken.END_OBJECT) {
//			System.out.println(jp.getCurrentName());
//			if("temperature".equals(jp.getCurrentName())){
//				System.out.println(jp.getCurrentName());
//			}
//		}
		
		
		// Twitter twitter = new TwitterFactory().getInstance();
		// List<Status> list = twitter.getUserTimeline();
		// Query query = new Query("ê¬êX");
		// query.setCount(Integer.MAX_VALUE);
		// Status status = list.get(0);
		// QueryResult result = twitter.search(query);
		// for (Status status1 : result.getTweets()) {
		// if (status1.getUser().isVerified()) {
		// System.out.println("@" + status1.getUser().getName() + "\n"
		// + status1.getText());
		// }
		// }
	}
}
