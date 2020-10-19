import java.util.TreeSet;

/**
 * 
 * @author ADITI GUPTA
 * SetOperations class to perform various operations on set
 *
 */
public class SetOperations {

	public static void main(String[] args)
	{
	TreeSet<Integer> set=new TreeSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(5);
	set.add(6);
	set.add(7);
	set.add(8);
	set.add(9);
	set.add(10);
	System.out.println(set);
	System.out.println(set.descendingSet());
	System.out.println(set.lower(6));
	System.out.println(set.floor(4));
	System.out.println(set.pollFirst());
	System.out.println(set.subSet(1, 7));
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(set.pollLast());
	System.out.println(set.headSet(6));
}
}