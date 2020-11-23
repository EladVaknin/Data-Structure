package Queue;

public class QueueArr {
	int [] Queue ;
	int front , rear ;
	int MaxSize ;
public QueueArr (int MaxSize) {            // constructor
	this.MaxSize = MaxSize ;
	Queue = new int [MaxSize] ;    // the length of the Queue
	front =rear = -1 ;           // the pointers point on value that not live in the queue
}
public boolean IsEmpty () {
	return (front == -1 ) && (rear == -1 ) ;
}
public boolean IsFull () {
	return ((rear +1 ) % MaxSize == front) ;          
}
public boolean Enqueue (int data) {    //chek if we add a value
	if(IsEmpty()) {       // for the case that the Queue is empty
		front = rear =0 ;
		Queue [front] = data ;
	} else if (IsFull()) {// for the case that the Queue is full
		return false ;
	}else {                   
		rear = (rear +1 ) % MaxSize ;
		Queue [rear] = data ;
	}
	return true;
}
public int DeqUeue () {               // to return the first value in the queue
	int tmp ;
	if (IsEmpty()) {
		return Integer.MAX_VALUE;
	}else if (rear == front) {
		tmp = Queue [rear];
		rear =front =-1 ;
	}else {
		tmp = Queue [front];
		front = (front +1) % MaxSize;
	}
	return tmp;
}
public int getFront() {
	return (front != -1)? Queue [front] : Integer.MAX_VALUE;
}
public int getRear() {
	return (rear != -1)? Queue [rear] : Integer.MAX_VALUE;
}
public String toString () {
	String st = "" ;
	for (int i = front; i < rear; i = (i +1 ) %MaxSize) {
		st += Queue[i] + " ," ;
	}
	if (rear != -1 ) {
		st += Queue [rear] + " |-" ;
	}else {
		st = " |- " ;
	}
	return st;
}
}
