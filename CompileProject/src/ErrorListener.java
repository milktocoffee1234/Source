import java.util.ArrayList;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;


public  class ErrorListener implements DiagnosticListener<JavaFileObject>{
	private boolean flag = true;
	private String source;
	private List<String> sourceList = new ArrayList<String>();
	public ErrorListener(String source){
		this.source = source;
	}
	@Override
	public void report(Diagnostic<? extends JavaFileObject> diagnostic) {
		// TODO Auto-generated method stub
		System.out.println("reportstart");
		System.out.println("errcode" + diagnostic.getCode());
		System.out.println("line：" + diagnostic.getLineNumber());
		System.out.println("column" + diagnostic.getColumnNumber());
		System.out.println("message" + diagnostic.getMessage(null));
		//System.out.println(diagnostic.toString());
		System.out.println("reportend");
		if(flag){
			seachError((int)diagnostic.getLineNumber() - 1);
			flag = false;
		}
	}
	public void seachError(int lineNumber){
		String[] strs = source.split("\n");
		for(String s : strs){
			this.sourceList.add(s);
		}
		for(int i = 0; i < this.sourceList.size(); i++){
			String line = this.sourceList.get(i);
			if(i == lineNumber){
				System.out.println(line + " <--Error");
			}else{
				System.out.println(line);
			}
		}

	}
	public void judge(){
		
	}
}
