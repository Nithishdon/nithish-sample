import java.util.*;
public class employee {
    private String name,dept,gender;
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private int  age,year,salary,id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public employee(String name,int age,int year,int salary,String dept,int id,String gender)
        {
this.name=name;
this.age=age;
this.year=year;
this.salary=salary;
this.id=id;
this.dept=dept;
this.gender=gender;

        }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName()
    {
return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    @Override
    public String toString()
    {
        //return "{employee: Id"+id+",name"+name+",age"+age",year"+year+",salary"+salary+"}";
        return "Employee{name='" + name + "', age=" + age + ", year=" + year + ", salary=" + salary + ", dept='" + dept + "', id=" + id + "gender"+gender+"}";
    
    }
    
}
