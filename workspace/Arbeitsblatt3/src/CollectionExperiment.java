import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;


public class CollectionExperiment {

	public void schreibeCollectionAufConsole(Collection<String> strings)
	{
		for(String s: strings)
		{
			System.out.println(s);
		}
		System.out.println("");
	}
	
	public void experimentiereMit(Collection<String> strings)
	{
		System.out.println("add");
		strings.add("Uschi");
		strings.add("Freddy");
		schreibeCollectionAufConsole(strings);
		
		System.out.println("add Duplikat");
		String dup = new String("Duplikat");
		strings.add(dup);
		strings.add(dup);
		schreibeCollectionAufConsole(strings);
		
		System.out.println("addAll");
		Collection list = new ArrayList();
		list.add("foobar");
		list.add("bla");
		list.add("ratzefummel");
		strings.addAll(list);
		schreibeCollectionAufConsole(strings);
		
		System.out.println("remove");
		strings.remove("bla");
		schreibeCollectionAufConsole(strings);
		
		System.out.println("retainAll");
		strings.retainAll(list);
		schreibeCollectionAufConsole(strings);
		
		System.out.println("removeAll");
		strings.removeAll(strings);
		schreibeCollectionAufConsole(strings);
	}
	
	public static void main(String[] args) 
	{
		Collection<String> liste = new ArrayList<String>();
		Collection<String> menge = new HashSet<String>();
		Collection<String> stack = new Stack<String>();
		CollectionExperiment exp = new CollectionExperiment();
		System.out.println("liste");
		exp.experimentiereMit(liste);
		System.out.println("menge");
		exp.experimentiereMit(menge);
		System.out.println("stack");
		exp.experimentiereMit(stack);
	}
}