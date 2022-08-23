public class Note {

    private final double mark;
    private final double credit_points;

    public Note(double mark, double credit_points){
        this.mark = mark;
        this.credit_points = credit_points;
    }

    public double getMark(){
        return mark;
    }

    public double getCredit_points(){
        return credit_points;
    }
}
