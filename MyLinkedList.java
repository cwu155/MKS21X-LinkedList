public class MyLinkedList{
  private class Node{
    private Node next, prev;
    private Integer data;

    public Node (start, end){
      prev = start;
      next = end;
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
      start = null;
      end = null;
      length = 0;
    }

    public boolean add(Integer value){
        Node newNode = new Node(start, end);
        length += 1;
        return true;
    }

    public int size(){
      return length;
    }

    // public String toString(){
    //   String result = "";
    //   for (int i = 1; i < length-1; i++){
    //     result += this.getData();
    //   }
    //   return "[" + start + result + end + "]";
    // }



}
