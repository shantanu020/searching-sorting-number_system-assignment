package Numbers;

public class Binary {
	public static void binRep(int num) {
		int d=num;
		StringBuilder bin =new StringBuilder();
		while(d>=1) {
			bin.append(d%2);
			d=d/2;
		}
		System.out.println(bin.reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		int num2=10;
		binRep(num1);
		binRep(num2);
	}

}
