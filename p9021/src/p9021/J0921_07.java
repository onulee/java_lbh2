package p9021;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class J0921_07 {

	public static void main(String[] args) {
		
		//list - 순서O, 중복O
		//set - 순서X,중복X
		HashSet<String> set = new HashSet<String>();
		set.add("c");
		set.add("b");
		set.add("b");
		set.add("a");
		set.add("d");
		set.add("a");
		
		
		Iterator<String> it = set.iterator(); //1회성, 한번 출력만 가능
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------");
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("완료!!");
		
		
//		ArrayList list = new ArrayList();
//		
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		
//		// Iterator 최신버전 - iterator(), hasNext(), next()
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		Vector<Integer> v = new Vector();
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		v.add(5);
//		
//		//Iterator 구버전 - elements(), hasMoreElements(), nextElement()
//		Enumeration<Integer> e = v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		
//		
//		//list.remove(5);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for(int i=list.size()-1;i>=0;i--) {
//			list.remove(i);
//		}
//		
//		System.out.println("---------");
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		

	}

}
