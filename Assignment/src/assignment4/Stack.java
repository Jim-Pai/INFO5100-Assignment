package assignment4;

import java.awt.List;
import java.util.ArrayList;

public class Stack {

	private static final int MAX_LENGTH = 10;
	ArrayList list;
	
	public Stack(){
		list = new ArrayList();
	}
	
	public void push(int num){
		if(list.size() >= MAX_LENGTH){
			System.out.println("The Stack is full. You can't push any more.");
			return;
		}
		list.add(num);
		System.out.println("Push " + num + " ......." + "The length is " + getLength());
	}
	
	public int pop(){
		if(list.isEmpty()){
			System.out.println("The Stack is empty. You can't pop any more.");
			return 0;
		}
		
		int lastIndex = getLength() - 1;
		int popValue = (int)list.get(lastIndex);
		list.remove(lastIndex);
		return popValue;
	}
	
	public int getLength(){
		return list.size();
	}
}