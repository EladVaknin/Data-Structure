package Stack;

public class StackArr {
    int [] Stack ;
    int top ;
    int MaxSize ;
    public StackArr (int Max) {       // create the Stack
    	MaxSize =Max ;
    	Stack = new int [MaxSize] ;
    	top = -1 ;
    }
    public boolean IsEmpty () {    // if the stack is empty
    	return (top == -1) ;
    }
    public boolean IsFull () {          // if the stack is full
    	return (top == MaxSize -1 ) ;
    }
    public boolean Push (int data) {         // if we success to input the value
        if ( ! IsFull()) {       // if we have a place in the stack
        	top ++ ; 
        	Stack [top] = data ;
        	return true;
        }
        return false;
    }
    public int Pop () {
    	if ( ! IsEmpty()) {
    		int tmp = Stack [top] ;   // to save the value of top because we need  to return hem.
    		top --;
    		return tmp;
    	}
    	return Integer.MAX_VALUE ;          // we return infinity value
    }
    public int Top () {              // to see the top value in the stack
    	return (! IsEmpty () ) ?Stack [top] : Integer.MAX_VALUE;           // ? = if , : = else.
    }
    public String toString () {
    	String st = "-" ;
    	if (! IsEmpty()) {       // if the stack not empty.
    		for (int i = 0; i < top; i++) {
    			st =st + Stack[i] + "," ;
			}
    		st += Stack [top] ;
    	}
    	return st ;
    }
}
