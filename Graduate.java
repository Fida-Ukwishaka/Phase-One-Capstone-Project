public class Graduate extends Student {

    private double credits;

    public void setCredits(double credits){this.credits = credits;}

    public double getCredits(){ return credits;}

    private final double perCredit = 200.5;
    private final double researchFee = 300.0;

    public Graduate(String id, String name, String major, double gpa){
        super(id, name, major, gpa);
    }

    @Override
    public double calculateTuition(){
        return (credits * perCredit) + researchFee;
    }


    
}
