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

      //Step Three: Adding a value to the middle
      System.out.println("#####################################");
      System.out.println("##Adding Values in the Middle Test:##");
      System.out.println("#####################################");
      list.add(5, 999);
      System.out.println(list);
      System.out.println("This should print: \"[0, 1, 2, 3, 4, 999, 5, 6, 7, 8, 9]\"");

      //Step Four: Removing a value from the list by index
      System.out.println("##########################");
      System.out.println("##Removing a Value Test:##");
      System.out.println("##########################");
      list.remove(5);
      System.out.println(list);
      System.out.println("This should print: \"[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\"");

      //Step Six: Testing the Contains Method
      System.out.println("##############################");
      System.out.println("##Checking Containment Test:##");
      System.out.println("##############################");
      System.out.println(list.contains(999));
      System.out.println("This should print: false");

      //Step Seven: Testing the Size Method
      System.out.println("##############");
      System.out.println("##Size Test:##");
      System.out.println("##############");
      System.out.println(list.size());
      System.out.println("This should print: 10");

      //Step Eight: indexOf Method
      System.out.println("########################");
      System.out.println("##Index of Value Test:##");
      System.out.println("########################");
      System.out.println(list.indexOf(0));
      System.out.println("This should print: 0");
    }
  }
