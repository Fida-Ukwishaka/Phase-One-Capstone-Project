public class Undergraduate extends Student{

    private static final double flatRate = 4994.08;

    Undergraduate(String name, int studentId, String major, double GPA){
        super(name, studentId, major, GPA);
    }

    @Override
    public double calculateTuition(){
        return flatRate;
    }

   
}
