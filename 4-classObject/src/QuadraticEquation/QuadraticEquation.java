package QuadraticEquation;

public class QuadraticEquation {
    private double a,b, c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getter(){
    }
    public double getDiscriminant(){
        return b * 2 - 4 * a * c;
    }

    public double getRoot1(double delta){

        return (- b + Math.pow(delta,0.5)) / (2 * a);
    }
    public double getRoot2(double delta){
        return (- b - Math.pow(delta,0.5)) / (2 * a);
    }
}
