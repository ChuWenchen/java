public class FloatDetail{
	public static void main(String[] args){
  		// java �ĸ����ͳ�����Ĭ��Ϊdouble���ͣ�����float���ͣ��������� f��F
  		// ���ͳ���Ĭ��Ϊint������long���ͣ������ l�� L
		//  float n1 = 1.1;  ����
		float n1 = 1.1F;
		System.out.println(n1);
		//0.512   .512
		//��ѧ������
		System.out.println(5.12e2);  //521.0
		System.out.println(5.12E-2); //0.0512

		double n3=2.7;
		double n4=8.1/3;
		System.out.println(n4);
		if(n3 == n4){
			System.out.println("n3 = n4 =2.7");
		}
		if(Math.abs(n3 - n4)< 0.00001){
			System.out.println("��ֵ��С�����");
		}
	}
}