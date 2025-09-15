public class Person {
    private String name = "";
    private String job = "";
    private String company = "";
    private int age = 0;
    private int salary = 0;

    public Person() {
    }

    public Person(String name, String job, String company, int age, int salary) {
        this.name = name;
        this.job = job;
        this.company = company;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
