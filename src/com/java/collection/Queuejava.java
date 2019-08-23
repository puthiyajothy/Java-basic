package com.java.collection;

public class Queuejava {

	public static void main(String[] args) {
		Queue que = new Queue();
		que.enqueue(5);
		que.enqueue(9);
		que.enqueue(10);
		que.enqueue(4);

		que.dequeue();
		que.dequeue();

		que.enqueue(80);
//		que.enqueue(10);
//		que.enqueue(4);

		System.out.println("size : " + que.getsize());
		que.show();

	}

}

class Queue {

	int Queue[] = new int[5];
	int size;
	int front;
	int rear;

	public void enqueue(int data) {
		Queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}

	public int dequeue() {

		int data = Queue[front];
		front = (front + 1) % 5;
		size = size - 1;

		return data;
	}

	public void show() {

		for (int i = 0; i < size; i++) {
			System.out.print(Queue[(front + i) % 5] + " ");
		}

		System.out.println();
		for (int n : Queue) {
			System.out.print(n + " ");
		}

	}

	public int getsize() {
		return size;

	}
}