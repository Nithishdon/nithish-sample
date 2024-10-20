import java.util.*;
public class streams {
 public static void main(String[] args) {
    List<Integer> list=new ArrayList<Integer>();
list.add(10);
list.add(5);
list.add(90);
list.add(40);
list.add(1);

OptionalInt max=list.stream()
.mapToInt(Integer::intValue)
.filter(n->n%2==0)
.min();
//System.out.println(max.getAsInt());
max.ifPresent(System.out::println);

 }
    
}