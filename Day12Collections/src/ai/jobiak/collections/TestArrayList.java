package ai.jobiak.collections;

import java.util.*;
public class TestArrayList {
	
	public static void main(String args[]) {
		
		ArrayList bookList=new ArrayList();
		System.out.println(bookList.size());
		
		bookList.add("Thinking in java");
		bookList.add("Java unlished");
		bookList.add("Java for dummies in 21 days");
		bookList.add("Head first java");
		bookList.add("java in action");
		
		System.out.println(bookList.size());
		System.out.println(bookList);
		
		bookList.add("Head First Design Patterns");
		bookList.add("The Java EE Server Programming");
		
		System.out.println(bookList.size());
		System.out.println(bookList);
		System.out.println(bookList.get(5));
		
		System.out.println(bookList.contains("thinking in java"));//It is case sensitive
		
		List list=bookList;
		System.out.println(list);
		Collection collection=list;
		System.out.println(collection);
		
		//iteration
		//Iterator iter=collection.iterator();
		Iterator iter=bookList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(Object book:bookList)
			System.out.println(book);
		
		for(int i=0;i<bookList.size();i++)
			System.out.println(bookList.get(i));
		}
}
