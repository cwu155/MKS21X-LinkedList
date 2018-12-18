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
         while (current != null && i < length){
           result += current.getData() + " ";
           current = current.next();
           i++;
         }
      return "[" + result + "]";
    }

    private Node getNthNode(int index){
      Node current = start;
      Node result = current;

      for (int i = 0; i < length; i++){
        if (i == index){
          result = current;
        } else {
          current = current.next();
        }
      }
      return result;
    }

    public Integer get(int index){
      try {
      return this.getNthNode(index).getData();
      } catch (NullPointerException n) {
        return null;
      }
    }

    public Integer set(int index,Integer value){
      if (index >= length || index < 0){
        System.out.println("Bad index value!");
        return null;
      }

      try {
      this.getNthNode(index).setData(value);
      return this.getNthNode(index).getData();
    } catch (NullPointerException n) {
      return null;
      }
    }

    public boolean contains(Integer value){
      Node current = start;
      int count = 0;
      while (current != null){
        if (current.getData() == value){
          count += 1;
          current = current.next();
        } else {
          current = current.next();
        }
      }
      return (count >= 1);
    }

    public int indexOf(Integer value){
      Node current = start;
      int result = 0;
      for (int i = 0; i < length-1; i++){
        if (current.getData() == value){
          result = i;
          i = length;
        } else {
          current = current.next();
        }
      }
      if (result > 0){
        return result;
      } else {
        return -1;
      }
    }

    public void add(int index, Integer value){
      if (index > length || index < 0){
        System.out.println("Bad index value!");
      } else if (index == 0){
        Node newNode = new Node (value, null, start);
        start.setPrev(newNode);
        length += 1; // doesn't work
      } else {
        Node original = this.getNthNode(index);
        Node originalPrev = this.getNthNode(index-1);
        Node newNode = new Node(value, originalPrev, original);
        original.setPrev(newNode);
        originalPrev.setNext(newNode);
        length += 1;
      }
    }

    public Integer remove(int index){
      Node removed = this.getNthNode(index);
      Node beforeRemoved = removed.prev();
      Node afterRemoved = removed.next();
      beforeRemoved.setNext(afterRemoved);
      afterRemoved.setPrev(beforeRemoved);
      return index;
    }

    public boolean remove(Integer value){
      this.remove(indexOf(value));
      return true;
    }


    }
