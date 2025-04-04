package TechCompany;

public class Manager extends Employee {
    private String department;

    public Manager (String name, String title, String department){
        super(name, title);
        this.department = department;
    }

    public void work() {
        System.out.println(this.getName() + " is working as a " + this.getTitle() + "and is in the" + department + "department");
    }
}

