import java.util.TimerTask;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;



public class Task extends TimerTask{
	private static final String TWEET = "goto����";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Twitter twitter = new TwitterFactory().getInstance();
		try{			
			twitter.updateStatus(TWEET);
			System.out.println("�ł���");
		}catch(TwitterException e){
			System.out.println("���s");
			e.printStackTrace();
		}
		
	}

}
