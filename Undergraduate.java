public class Undergraduate extends Student{

    private final double flatRate = 4994.08;

    public Undergraduate(String id, String name, String major, double gpa){
        super(id, name, major, gpa);
    }

    @Override
    public double calculateTuition(){
        return flatRate;
    }

   
}
