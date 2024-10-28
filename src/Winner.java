import java.util.Arrays;
import java.util.List;

public class Winner {
    String x;
    String y;
    List<String> p;
    public Winner (String you, String robot, List<String> pp){
        x= you;
        y=robot;
        p= pp;
    }
    public void determination(){
        int one=p.indexOf(x);
        int two=p.indexOf(y);
        int s=one-two;
        if ((s==1) || (s==-2)){
            System.out.println("You won! Congratulations");
        } else if (s==0) {
            System.out.println("You are even!");
        }
        else{
            System.out.println("You Lost! Try again");
        }
    }
}
