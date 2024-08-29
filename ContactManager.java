import java.util.ArrayList;
import java.util.List;

public class ContactManager {

	static List l,l2;
	public ContactManager()
	{
		l=new ArrayList();
		l.add("java");
		l.add("c++");
		l.add("python");
	}
	public void addContact(String a)
	{
		l.add(a);
	}
	public List getContact()
	{
		return l;
		//l.forEach(x->System.out.print(x+" "));	
	}
	public void print1()
	{
		l2.forEach(x->System.out.print(x+" \n"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactManager c=new ContactManager();
		c.addContact("aadi");
		l2=c.getContact();
		System.out.println(l2);
		System.out.println("\nprinting using for each");
		c.print1();

	}

}
