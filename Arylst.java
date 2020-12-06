/*
 * add(obj);
 * add(Pos,obj);
 * remove(ob)
 * remove(Pos)
 * set(Pos,ob)
 * Indexof(obj)
 * toArray()
 * size()
 * isEmpty()
 * clear()
 */
package collections;
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Scanner;
public class Arylst 
{
    
	public static void main(String []args )
	{
		Scanner s = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		String a,b;
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter 5 Nos:");
		for(int i=0;i<5;i++)
		{
			a = s.nextLine();
			al.add(a);
		}
		System.out.println(al);
		System.out.println("Add\nAddpos\nremove\nremove pos\nset\nindexof\ntoarray\nsize\nisempty\nclear");
		System.out.println("Enter any option");
		b = s.nextLine();
		String c;
		int d;
		switch(b)
		{
		
		case "Add": 
			{
				System.out.println("Enter a name to add");
				c = s.nextLine();
				al.add(c);
				System.out.println("After correction : "+al);
			}
			break;
			
		case "Addpos": 
		{
			System.out.println("ENter a name and position");
			c = s.nextLine();
			d = st.nextInt();
			al.add(d, c);
			System.out.println("After correction : "+al);
		}
		break;
		
		case "remove":
		{
			System.out.println("Enter a name above to remove");
			c = s.nextLine();
			al.remove(c);
			System.out.println("After correction : "+al);
		}
		break;
		
		case "remove pos":
		{
			System.out.println("ENter name to remove");
			a = s.nextLine();
			System.out.println("enter position to remove");
			d = st.nextInt();
			al.remove(a);
		}
		case "set":
		{
			System.out.println("Enter name and pos to set");
			c = s.nextLine();
			d = st.nextInt();
			al.set(d, c);
			System.out.println(al);
		}
		case "indexof":
		{
			System.out.println("Enter a name to show index");
			c = s.nextLine();
			System.out.println("index is "+al.indexOf(c));
		}
		case "toarray":
		{
			al.toArray();
			System.out.println(al);
		}
		case "size":
		{
			System.out.println(+al.size());
		}
		case "isempty":
		{
			System.out.println(al.isEmpty());
		}
		break;
		case "clear":
		{
			al.clear();
			System.out.println(al);
		}
		}
	}
	
}
