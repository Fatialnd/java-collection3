import java.util.*;
  class javaCollection{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Fatima");
        list.add("Alinejad");
        list.add("Susan");
        list.add("Antone");
        Iterator itr=list.iterator();
        System.out.println("Example 1");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Example 2 ");
        LinkedList<String> al=new LinkedList<String>();
        al.add("Fatima");
        al.add("Alinejad");
        al.add("Susan");
        al.add("Antone");
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Example 3");

        Vector<String> v=new Vector<String>();
        v.add("Fatima");
        v.add("Alinejad");
        v.add("Susan");
        v.add("Antone");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Example 4");

        Stack<String> stack = new Stack<String>();
        stack.push("Fatima");
        stack.push("Alinejad");
        stack.push("Susan");
        stack.push("Shahla");
        stack.push("Antone");
        stack.pop();
        Iterator<String> itr3=stack.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Example 5");

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Fatima");
        deque.add("Alinejad");
        deque.add("Shahla");
        for (String str : deque) {
            System.out.println(str);
        }

    }
    
  }
