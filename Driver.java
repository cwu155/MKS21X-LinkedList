public class Driver {
    public static void main(String[] args) {

      System.out.println("######################");
      System.out.println("##New Instance Test:##");
      System.out.println("######################");
      MyLinkedList list = new MyLinkedList();
      System.out.println(list);
      System.out.println("This should print: \"[]\"\n");

      //Step Two: Let's add some values
      System.out.println("#######################");
      System.out.println("##Adding Values Test:##");
      System.out.println("#######################");
      for(int i = 0; i < 10; i++) {
          list.add(i);
          //System.out.println(list.size()); <- Debugging
      }
      System.out.println(list);
      System.out.println("This should print: \"[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\"");

    
    }
  }
