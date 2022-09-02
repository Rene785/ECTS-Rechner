import java.util.LinkedList;

public class MainController {

    private LinkedList<Note> markList;

    public static void main(String[] args) {
        new MainController();
    }

    public MainController(){
        markList = new LinkedList<>();
        CalcView view = new CalcView(this);
    }

    public void addMarkToList(double mark, double cp){
        Note note = new Note(mark,cp);
        markList.add(note);
    }

    public double calcAvgMark(){
        double allMarks = 0.0;
        double allCP = 0.0;
        for(int i = 0;i<markList.size();i++){
            allMarks = allMarks + markList.get(i).getMark()*markList.get(i).getCredit_points();
            allCP = allCP + markList.get(i).getCredit_points();
        }
        return allMarks/allCP;
    }
}
