public class Employees {
    private String name;
    private String gender;
    private int age;
    private String dep;
    private int salary;
    private int year;


    public Employees() {
    }


    public Employees(String name, String gender, int age, String dep, int salary, int year) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dep = dep;
        this.salary = salary;
        this.year = year;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getDep() {
        return dep;
    }


    public void setDep(String dep) {
        this.dep = dep;
    }


    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Employees [name=" + name + ", gender=" + gender + ", age=" + age + ", dep=" + dep + ", salary=" + salary
                + ", year=" + year + "]";
    }


   

 
  

    
}
