import java.nio.LongBuffer;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class streamsexample {
    public static void main(String[] args) {
        ArrayList<employee> obj=new ArrayList<>();
        employee e1=new employee("aNithish", 21, 2003, 50000,"IT",1,"Male");
        employee e2=new employee("Ajegathish", 18, 2008, 70000,"CSE",2,"male");
        employee e3=new employee("mani", 17, 2004, 90000,"ECE",3,"Male");
        employee e4=new employee("Crishika", 6, 2011, 100000,"IT",4,"female");
        employee e5=new employee("mani", 6, 2011, 150000,"CSE",5,"male");
        obj.add(e1);
        obj.add(e2);
        obj.add(e3);
        obj.add(e4);
        obj.add(e5);
        // even no of id
       /* 
      obj.stream()
      .filter(emp->emp.getId()%2==0)
      .map(emp->emp.getName())
      .forEach(System.out::println);
     */

      //sort name ascending order
     /*  List<employee>sortedname= obj.stream()
      .sorted(Comparator.comparing(employee::getName).reversed())
      .collect(Collectors.toList());
    
      sortedname.forEach(System.out::println);
      */
      
      
      //get highest salary employee
      /*
      Optional<employee> maxsalary=obj.stream()
      .max(Comparator.comparing(employee::getSalary));
      maxsalary.ifPresent(emp->System.out.println(" slary "+emp.getSalary()+" name "+emp.getName()));
      */

       //get second max salary employee
      /* 
     
       Optional<employee> secmaxsalary=obj.stream()
      .sorted(Comparator.comparing(employee::getSalary).reversed())
      .skip(1)
      .findFirst();
      secmaxsalary.ifPresent(System.out::println);
     // secmaxsalary.ifPresent(emp->System.out.println(emp));
     */
     // convert a list of name to uppercase
     /* 
     obj.stream()
     .forEach(emp -> emp.setName(emp.getName().toUpperCase()));
     obj.forEach(System.out::println);
     */
    // sum all employee salary
    /*  OptionalDouble sumofsalary= obj.stream()
                                .mapToDouble(employee::getSalary)
                                .average();
                                //.sum() for sum it return Double not Optional double
                                System.out.println(sumofsalary.getAsDouble());
     */
    //youngest among all
    /* 
      OptionalInt maxyear=obj.stream()
      .mapToInt(employee::getYear)
      .max();
      System.out.println(maxyear.getAsInt());
      */
      //count the no of employees in list
      /* 
      long empcnt=obj.stream()
      .count();
      System.out.println(empcnt);
      */
      // count no of emp in IT 
      /* 
      long ITcnt=obj.stream()
      .filter(emp->emp.getDept().equals("IT"))
      .count();
      System.out.println(ITcnt);
      */
      //filter name st with n with ingnorecase sensitive using foreach we cannot get a String name=obj.stream..... and then sout(name)
      // this is not possible so we go for collect which collect all the sequence of stream
       /*
        obj.stream()
        .filter(emp->emp.getName().toUpperCase().startsWith("A"))
        .map(employee::getName)
        .forEach(System.out::println);
        */
        //using collect name endswith -s
      /* 
         String name_st=obj.stream()
         .filter(emp->emp.getName().toUpperCase().endsWith("H"))
         .map(employee::getName)
         .collect(Collectors.joining(",", "[", "]"));
         System.out.println(name_st);
        */
        // distinct age from employee and we get empage and empname so we use map key for age and anme for value
       /* 
        Map<String,Integer> empname_age=obj.stream()
        .collect(Collectors.toMap(employee::getName, employee::getAge,(occur1st,after1stoccur)->occur1st));
        System.out.println(empname_age);
        */
        // average salary of employee using collect
        /* 
         Double avgsal=obj.stream()
         .collect((Collectors.averagingDouble(employee::getSalary)));
         System.out.println(avgsal);
        */
        // how many employee in each dept 
        /* 
        Map<String,Long> deptemp =obj.stream()
        .collect(Collectors
        .groupingBy(employee::getDept,Collectors.counting()));
       deptemp.forEach((key,value)->{
        System.out.println(key+" "+value);

       });
       */
      //how many male and female worker
      /* 
    Map<String,Long> m_f_cnt=obj.stream()
    .collect(Collectors.
    groupingBy(employee::getGender,Collectors.counting()));
    m_f_cnt.forEach((key,value)->System.out.println("gender "+key+" count "+value));
     */
    //increase employee salary in It dept by 10 percentage
   obj.stream()
     .filter(emp->emp.getDept.equalsIgnoreCase("IT"))
     .forEach(emp->{
      emp.setSalary(emp.getSalary()*1.10);
     System.out.println("emp name and salary"+ emp.getName()+":"+""+emp.getSalary());
  } );
}
}
