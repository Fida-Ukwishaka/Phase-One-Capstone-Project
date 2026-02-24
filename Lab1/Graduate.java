public class Graduate extends Student {

    private int credits;

    private static final double perCredit = 200.5;
    private static final double researchFee = 300.0;

    Graduate(String name, int studentId, String major, double GPA, int credits){
        super(name, studentId, major, GPA);
        this.credits = credits;
    }


    @Override
    public double calculateTuition(){
        return (credits * perCredit) + researchFee;
    }


    
}
