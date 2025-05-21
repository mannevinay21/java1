package vinay;
interface k
{
	void add();
}
class i2
{
	void sub()
	{
		System.out.println("bye");
	}

}
public class doubleinterfaces extends i2 implements k{
           public void add()
           {
        	   System.out.println("hi");
           }
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleinterfaces d=new doubleinterfaces();
   d.add();
d.sub();
	}

}
