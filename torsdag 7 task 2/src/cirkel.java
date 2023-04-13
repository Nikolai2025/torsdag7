import javax.management.RuntimeErrorException;

import static java.lang.Math.PI;

public class cirkel {

    int radius;
    public cirkel(int radius){
       setRadius(radius);
    }
    public void setRadius(int radius){
    if (radius<=0){
       throw new RuntimeException();
    } else {this.radius=radius;
    }
    }

    public double areal(){

    return PI*radius*radius;
    }
}
