import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class EmployeeMain{

    public static void main(String[] args) {
        
        List<Employees> emp = new ArrayList<>();
        emp.add(new Employees("ravi","male",25,"It",30000,2012));
        emp.add(new Employees("sheela","female",31,"software",25000,2014));
        emp.add(new Employees("naga","male",30,"ops",35000,2016));
        emp.add(new Employees("malli","female",28,"software",40000,2018));
        emp.add(new Employees("rani","female",24,"HR",20000,2016));
        emp.add(new Employees("raju","male",34,"finance",22000,2011));
        emp.add(new Employees("suresh","male",29,"cook",23000,2015));

      

        // Map<String,Long> empl = emp.stream().collect
        // ( Collectors.groupingBy(Employees::getGender,Collectors.counting()));
        // System.out.println(empl);

        Map<String,List<Employees>> empdep = emp.stream().collect(Collectors.groupingBy(Employees::getDep, 
       
        Collectors.toList()));

        //empdep.entrySet().forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
       
        //System.out.println(empdep);
        
        //emp.stream().map(Employees::getDep).distinct().forEach(System.out::println);


        // Map<String,Double> avgAge = emp.stream().collect(Collectors.groupingBy
        // (Employees::getGender,Collectors.averagingInt(Employees::getAge)));
        // System.out.println(avgAge);

        // Optional<Employees> maxSalary = emp.stream().max(Comparator.comparing(Employees::getSalary));
        // System.out.println(maxSalary.get().getName());
         List<String> joinYear = emp.stream().filter(e -> e.getYear()>2015).
        map(Employees::getName).collect( Collectors.toList());

    //     emp.stream().filter(e -> e.getYear()>2015).map(Employees::getName).
    //    forEach(System.out::println);

        System.out.println(joinYear);

   System.out.println( emp.stream().filter(e->e.getSalary()>25000).
   map(Employees::getName).sorted().collect(Collectors.toList()));


    }

    
    

}