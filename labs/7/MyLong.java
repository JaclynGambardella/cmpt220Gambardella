
public class MyLong {

	private Long value;
	
	public MyLong(Long value){
		this.value = value;
		
	}
	
	public Long getValue(){
		return value;
		
	}
	
	public boolean isEven(){
		if (value % 2 ==0)
		return true;
		else
			return false;
		
	}
	public boolean isOdd(){
		if (value % 2 ==0)
		return false;
		else
			return true;
	}
	
	public boolean isPrime(){
		if (value ==1)
		return false;
		for(int i = 2; i <= value; i++){
			if (value % i ==0)
				return false;
			
		}
		return true;
		
	}

	public static boolean isEven(long value) {

		if (value % 2 == 0)
			return true;

		else
			return false;

		}

	public static boolean isOdd(long value) {

		if (value % 2 == 0)
			return false;

		else
			return true;
		
		}

	public static boolean isPrime(long value) { 

		if (value == 1)
			return false;

	for (int i = 2; i * i <= value; i++) {

		if (value % i == 0)
			return false;

		}

			return true;

		}
	
	public static boolean isEven(MyLong ml) {

		if (ml.getValue() % 2 == 0)
			return true;

		else
			return false;

		}

	public static boolean isOdd(MyLong myLong) {
			
		if (myLong.getValue() % 2 == 0)
			return false;

		else
			return true;

		}

	public static boolean isPrime(MyLong myLong) { // -- 

		if (myLong.getValue() == 1)	
			return false;

	for (int i = 2; i * i <= myLong.getValue(); i++) {

		if (myLong.getValue() % i == 0)
			return false;

		}

			return true;

		}

	public static long parseLong(char ch[]) {
		String str = "";

	for (int i = 0; i < ch.length; i++) {

		str += ch[i];

	}

		return Long.parseLong(str);

	}

	public static long parseLong(String str) {	
		return Long.parseLong(str);

		}

public static void main(String[] args) {

	MyLong myLong1=new MyLong(99L);

	if(myLong1.isEven()) {	
		System.out.println(myLong1.getValue()+" = Even ");
		
	}

	if(myLong1.isOdd()) {			
		System.out.println(myLong1.getValue()+" = Odd ");

	}

	if(myLong1.isPrime()) {
		System.out.println(myLong1.getValue()+" = Prime ");

	}

	long val=98L;

	if(MyLong.isEven(val)) {
		System.out.println(val+" = Even");

	}

	if(MyLong.isOdd(val)) {
		System.out.println(val+" = Odd");

	}

	if(MyLong.isPrime(val)) {
		System.out.println(val+" = Prime");

	}

  

	MyLong myLong2=new MyLong(91l);

	if(MyLong.isEven(myLong2)) {
		System.out.println(myLong2.getValue()+" = Even");

	}

	if(MyLong.isOdd(myLong2)) {
		System.out.println(myLong2.getValue()+" = Odd");

	}

	if(MyLong.isPrime(myLong2)) {
		System.out.println(myLong2.getValue()+" = Prime");

	}

	char ch[]={'1','2','3','4','5','6',
			'7','8','9'};

	long l1=MyLong.parseLong(ch);
		System.out.println(l1);

	String str="123456789";

	long l2=MyLong.parseLong(str);
		System.out.println(l2);

}

}
