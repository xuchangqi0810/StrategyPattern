package cn.xcq.demo;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy str){
		this.strategy=str;
	}
	
	public int executeStrategy(int i,int y){
		return strategy.doOperation(i, y);
	}

}
