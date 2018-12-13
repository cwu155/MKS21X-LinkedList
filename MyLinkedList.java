public class MyLinkedList{
  private class Node{
    private Node next, prev;
    private Integer data;

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
}
