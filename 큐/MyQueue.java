package 자료구조구현;

class QueueNode{
	int value;
	QueueNode queueNode;
	
	QueueNode(int value){
		this.value = value;
		this.queueNode = null;
	}
	public int getValue() {
		return value;
	}
	public QueueNode getNextNode() {
		return queueNode;
	}
	public void setNextNode(QueueNode queueNode) {
		this.queueNode = queueNode;
	}
}

public class MyQueue {
	QueueNode front, rear;
	
	public MyQueue() {
		front = rear = null;
	}
	
	public boolean isEmpty() {
		if(front==null&&rear==null)return true;
		return false;
	}
	
	public void push(int value) {
		QueueNode queueNode = new QueueNode(value);
		if(isEmpty()) {
			front = rear = queueNode;
		}
		else {
			front.setNextNode(queueNode);
			front = queueNode;
		}
	}
	
	public QueueNode pop() {
		if(isEmpty()) {
			System.out.println("q is empty");
			return null;
		}else {
			QueueNode popNode = rear;
			rear = rear.getNextNode();
			return popNode;
		}
	}

	public QueueNode peek() {
		if(isEmpty()) {
			System.out.println("q is empty");
			return null;
		}else {
			
			return rear;
		}
	}
	 public int size() {
	        QueueNode front2 = front;
	        QueueNode rear2 = rear;
	        int count = 0;
	        while(front2 != rear2 && rear2 !=null) { //큐가 비어있는 경우가 있을수도 있을때도 생각해야함
	            count++;
	            rear2 = rear2.getNextNode();
	        }
	        return count;
	    }
	
	public static void main(String[] args) {

		MyQueue q= new MyQueue();
		
		q.push(1);
		System.out.println(q.pop().value);
	}

}
ㅍ
