package OOPS;
class TestStatic
{
	public static int x=25;
	public static int y=0;
	public static void show()
	{
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	static {
		y=x*4;
	}
}
public class StaticblockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestStatic.show();
	}

}
