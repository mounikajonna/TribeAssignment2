package TribeAssignment2;

public class ReturnType {
	public void method1() { // without return and without parameters
		int a=10;
		int b=60;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType obj = new ReturnType();
		obj.method1();
		System.out.println(WithReturntype.Add(10,20));
	}

}
class WithReturntype{
	public static int Add(int num1,int num2) {//with return and parameters
		int sum = num1+num2;
		 return sum;
	}
}