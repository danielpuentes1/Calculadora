package LaCalculadora;


import static java.lang.Math.*;

public class CalTrigo {

    double angGrados = 0;

    void convertirAngulo(double angRadianes) {
        angGrados = Math.toRadians(angRadianes);
    }

    double seno() {
        return sin(angGrados);
    }
    
    double coseno() {
        return cos(angGrados);
    }
    
    double tangente() {
        return tan(angGrados);
    }
    
    

}
