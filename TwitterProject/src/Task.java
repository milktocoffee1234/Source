import java.util.TimerTask;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;



public class Task extends TimerTask{
	private static final String TWEET = "goto‚¾‚æ";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Twitter twitter = new TwitterFactory().getInstance();
		try{			
			twitter.updateStatus(TWEET);
			System.out.println("‚Å‚«‚½");
		}catch(TwitterException e){
			System.out.println("Ž¸”s");
			e.printStackTrace();
		}
		
	}

}
