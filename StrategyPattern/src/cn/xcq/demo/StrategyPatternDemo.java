package cn.xcq.demo;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Context con1=new Context(new OperationAdd());
		System.out.println("10 + 5 = "+con1.executeStrategy(10, 5));
		
		
		Context con2=new Context(new OperationSubstract());
		System.out.println("10 - 5 = "+con2.executeStrategy(10,5));
		
		Context con3=new Context(new OperationMultiply());
		System.out.println("10 * 5 = "+con3.executeStrategy(10, 5));
	}
}
