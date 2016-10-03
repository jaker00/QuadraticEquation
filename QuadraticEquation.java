import javax.swing.*;
import java.util.*;
public class Experiment
{
    public static double[] quad(double a, double b, double c){
        return new double[] {(-1*b + Math.pow(b*b-4*a*c,.5))/(2*a), (-1*b- Math.pow((b*b-4*a*c),.5))/(2*a)};
    }
    public static void main(String[] args){

        int a = Integer.parseInt(JOptionPane.showInputDialog("enter a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("enter b"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("enter c"));
        //double d = quad(a,b,c);
        double[] result = quad(a, b, c);
        System.out.println("Your intercepts are: " + Arrays.toString(result));
    }
}