public class LNode{

    private int data;

    private LNode next;

    public LNode(int data){
	setData(data);
    }

    public void setNext(LNode n){
	next = n;
    }
    public void setData(int d){
	data = d;
    }
    public int getData(){
	return data;
    }
    public LNode getNext(){
	return next;
    }
}
