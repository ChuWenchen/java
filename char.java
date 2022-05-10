// java 中 char，字符类型，存放单个字符，可以是字符，转义符，汉字，数字
public class Char{
	public static void main(String[] agrs){
		char a = 'a';
		char b = '\t';
		char c = '褚';
		char d = 97;    // 没有引号
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println((int)a);
		System.out.println((int)c);

		char e = 'b' + 1;
		System.out.println((int)e);  // 99
		System.out.println(e);      // c

	}
}