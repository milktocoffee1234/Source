package masa;

import java.util.HashMap;
import java.util.Map;

public class ArrayList<T> {
	private java.util.ArrayList<Object> list = new java.util.ArrayList<>();
	private Map<String, Object> map = new HashMap<String, Object>();
	private Class<T> type;
    public ArrayList(T... e) {
        @SuppressWarnings("unchecked")
        Class<T> type = (Class<T>) e.getClass().getComponentType();
        this.type = type;
    }
	public void add(Object obj){
				
		if(obj.getClass() == this.type){
			System.out.println(obj);
			this.list.add(obj);
		}else{
			System.out.println(obj);
			System.out.println("型が違う");
		}
	}
	public Object get(int index){
		return this.list.get(index);
	}
	public int size(){
		return this.list.size();
	}
	public Class<T> getType(){
		return this.type;
	}
}
