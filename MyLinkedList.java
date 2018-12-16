public class MyLinkedList{
  private class Node{
    private Node next, prev;
    private Integer data;

    public Node (Integer value, Node start, Node end){
      prev = start;
      next = end;
      data = value;
    }
    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }
    public void setNext(Node other){
      next = other;
    }
    public void setPrev(Node other){
      prev = other;
    }
    public Integer getData(){
      return data;
    }
    public Integer setData(Integer i){
      data = i;
      return data;
    }
    public String toString(){
      return Integer.toString(data);
    }
    }

    private Node start;
    private Node end;
    private int length;

    public MyLinkedList(){
      start = end;
      length = 0;
    }

    public boolean add(Integer value){
        Node newNode = new Node(value, start, end);
        Node newEndNode = new Node(value, start, null);
        if (start == null){
          start = newNode;
          end = newNode;
        } else {
          Node temp = end;
          end.setNext(newEndNode);
          end = end.next();
          end.setPrev(end.prev());
        }
        length += 1;
        return true;
    }

    public int size(){
      return length;
    }

    public String toString(){
      String result = "";
      int i = 0;
      Node current = start;
         while (current != null && i < length-2){
           result += current.getData() + ", ";
           current = current.next();
           i++;
         }
      return "[" + result + end + "]";
    }

    public Node getNthNode(int value){
      Node current = start;
      int i = 0;
      while (current != null && i < length-1){
        current = current.next();
        i++;

        if (i == value-1){
          return current.next();
        }
      }
      return current.next();
    }

    }
