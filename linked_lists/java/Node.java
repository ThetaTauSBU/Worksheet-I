public class Node  {
    private E data;
    private Node next;
    private Node prev;

    public Node()
    {
        
    }
    
    public Node(E item)
    {
        this.data = item;
        this.next = null;
        this.prev = null;
    }
    
    public boolean setPrev(Node next)
    {
        this.prev = next;
        return true;
    }
    
    public boolean setNext(Node next)
    {
        this.next = next;
        return true;
    }
    
    public Node getPrev()
    {
        return this.prev;
    }
    
    public Node getNext()
    {
        return this.next;
    }
    
    public int getData()
    {
        return this.data;
    }
    
    public String toString()
    {
        return Integer.toString(this.data);
    }
}
