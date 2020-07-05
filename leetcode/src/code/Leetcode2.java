package code;

import java.util.Scanner;

public class Leetcode2 {
	public myList Sum(myList l1,myList l2) {
		myList result = new myList();
			return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myList l1 = new myList();
		myList l2 = new myList();
		for(int i = 0;i<6;i++) {
			Scanner san = new Scanner(System.in);
			int data = san.nextInt();
			if(i<3)
			l1.add(data);
			else
			 l2.add(data);
		}
		l1.print_node();
		l2.print_node();
	}

}
class ListNode{
	int data;
	ListNode next;
	public ListNode() {
		
	} 
	public ListNode(int x) {
		this.data = x;
	}
}
class myList{
	ListNode head;
	public myList() {
		head =  new ListNode();
	}
	public void add(int i) {
		ListNode add_node = new ListNode(i);
		if(head.next==null)
			head.next = add_node;
		else {
			ListNode p = head;
			while(p.next != null)
				p = p.next;
			p.next = add_node;
		}
	}
	public void print_node() {
		ListNode p = head.next;
		while(p!=null) {
			System.out.println(p.data);
			p = p.next;
		}
		
	}
	
}
