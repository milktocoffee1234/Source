
public class Printer {

	private Point point;
	private StringBuilder result = new StringBuilder();
	private Page page;
	
	public Printer(Point point){
		this.point = point;
	}
	public void setPage(Page page){
		this.page = page;
	}
	
	public void setCard(IDCard idCard){
		idCard.setPoint(idCard.getPoint() - point.getPoint());
		
		if(idCard.getPoint() > 0){
			result.append("id:")
					.append(idCard.getId())
					.append(" name:")
					.append(idCard.getName())
					.append(" point:")
					.append(idCard.getPoint())
					.append("\n");
			result.append("title:")
					.append(page.getTitle())
					.append("\n");
			result.append("body:\n");
			
		} else {
			idCard.setPoint(0);
			System.err.print("ƒ|ƒCƒ“ƒg‚ª‘«‚è‚È‚¢‚Ì‚Åprint‚Å‚«‚Ü‚¹‚ñ");
		}
		
	}
	
	public void print(){
		for(int i = 0; i < page.bodySize(); i++){
			result.append(page.getLineText(i)).append("\n");
		}
		System.out.println(result.toString());		

	}
}
