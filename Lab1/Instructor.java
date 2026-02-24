public class Instructor extends Person{

    private String department;

    Instructor(String name, String department){
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
    public String getLevel(){
        return "Instructor";
    }
    
}
