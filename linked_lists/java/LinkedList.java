abstract public class LinkedList
{
    protected Node head;
    protected int length;
    
    public LinkedList()
    {
        head = new Node();
        length = 1;
    }
    
    public LinkedList(Node node)
    {
        head = node;
        length = 1;
    }
    /**
     * 
     * @return the length of the linked list
     */
    public int size()
    {
        return length;
    }
     /**
     * 
     * @param target the int to search for.
     * @return a Node that is specified by @param target.
     */
    public Node search(int target)
    {
    }
    
    public int get(int index)
    {
    }
    /**
    * Appends node to end of linked list
    * @param node the node to be added.
    */
    public abstract void add(Node node);
    
    /**
     * Inserts node at specified index.
     * @param node the node to be inserted
     * @param index the position of where to insert the node
     */
    public abstract void insert(Node node, int index);
    
    /**
     * Deletes node at index
     * @param index the position of the node to be deleted
     */
    public abstract void delete(int index);
    
}
