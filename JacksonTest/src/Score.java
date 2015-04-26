
public class Score {
	private int mid;
	private int fin;
	public int getMid(){
		return this.mid;
	}
	public void setMid(int mid){
		this.mid = mid;
	}
	public int getFin(){
		return this.fin;
	}
	public void setFin(int fin){
		this.fin = fin;
	}
	@Override
	public String toString(){
		return "Score(mid:" + this.mid + ",fin:" + this.fin + ")";
	}
	
}
