package com.bridgelabz.Queue;

public class QueueMain {

	public static void main(String[] args) {
		QueueOperations op = new QueueOperations();

		op.addQ(56);
		op.addQ(30);
		op.addQ(70);
		op.dequeue();
		op.dequeue();
		
		System.out.println("Queue Front : " + op.front.key);
		System.out.println("Queue Rear : " + op.rear.key);
	}

}
