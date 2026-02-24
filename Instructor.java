public class Instructor extends Person{

    private String department;

    public Instructor(String name, String department){
        super(name);
        this.department = department;
    }

    public String department(){
        return department;
    }


    public void setDepartment(String department){
        this.department = department;
    }

    @Override
    public double calculateTuition() {
        return 0; // instructors don't pay tuition
    }

    @Override
    public String toString(){
        return name + " | " + department;
    }
    
}
