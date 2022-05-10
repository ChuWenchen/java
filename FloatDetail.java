public class FloatDetail{
	public static void main(String[] args){
  		// java 的浮点型常量，默认为double类型，声明float类型，必须后面加 f或F
  		// 整型常量默认为int，声明long类型，必须加 l或 L
		//  float n1 = 1.1;  错误
		float n1 = 1.1F;
		System.out.println(n1);
		//0.512   .512
		//科学计数法
		System.out.println(5.12e2);  //521.0
		System.out.println(5.12E-2); //0.0512

		double n3=2.7;
		double n4=8.1/3;
		System.out.println(n4);
		if(n3 == n4){
			System.out.println("n3 = n4 =2.7");
		}
		if(Math.abs(n3 - n4)< 0.00001){
			System.out.println("差值很小，相等");
		}
	}
}