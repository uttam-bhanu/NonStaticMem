
public class NonStaticMem {
	int x;
	NonStaticMem()
	{
		System.out.println("inside constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		new NonStaticMem();
		new NonStaticMem();
	}
	{
		System.out.println("inside non static blk");
	}
	static {
		System.out.println("inside static blk");
		
	}
	
}
