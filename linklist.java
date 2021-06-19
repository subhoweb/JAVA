import java.util.LinkedList;
public class linklist {
public static void main(String[] args) {
 LinkedList<String> mylist = new LinkedList<String>();
 	mylist.add("BMW");//add
 	mylist.add("VOLVO");
 	mylist.add("TATA");
 	mylist.add("FORD");
 	mylist.addFirst("First FORD motor"); //addFirst
 	mylist.addLast("Last FORD motor"); //addLast
 	System.out.println(mylist);
 	mylist.removeFirst(); //removeFirst
 	mylist.removeLast(); //removeLast
 	System.out.println(mylist);
 	System.out.println(mylist.getFirst()); //get First
 	System.out.println(mylist.getLast()); //getLast
 	
 }
}
