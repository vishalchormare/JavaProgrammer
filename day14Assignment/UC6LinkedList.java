package day14Assignment;

import java.util.LinkedList;

public class UC6LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> lists = new LinkedList<>();
		lists.add(56);
		lists.add(30);
		lists.add(70);
		System.out.println(lists);
		LinkedList<Integer> lists1 = new LinkedList<>();
		lists1.add(70);
		lists1.addFirst(30);
		lists1.addFirst(56);
		System.out.println(lists1);
		LinkedList<Integer> lists3 = new LinkedList<Integer>();
		lists3.add(56);
		lists3.addLast(30);
		lists3.addLast(70);
		System.out.println(lists3);
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		list4.add(56);
		list4.add(70);
		list4.add(1, 30);
		System.out.println(list4);
		list4.remove();
		System.out.println(list4);
		lists.removeLast();
		System.out.println(lists);
	}

}
