import com.adap.*;
import com.adapImpl.*;

public class App {

    public static void main(String[] args) {


        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("Design Pattern ADAPTER");

    }

}
