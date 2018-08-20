public class CalConvertir {
    double numero;
    
               
    double convertGramosToKg(){
        double resultado;       
        resultado = numero/1000;
        return resultado;
    } 
    double convertKgToGramos () {
        double resultado;
        resultado = numero*1000;
        return resultado;
    }
    double convertMetrosToCentimetros() {
        double resultado;
        resultado = numero*100;
        return resultado;
    }
    double convertCentimetrosToMetros() {
        double resultado;
        resultado = numero/100;
        return resultado;
    }
    double convertMetrosToMilimetros() {
        double resultado;
        resultado = numero*1000;
        return resultado;
    }
    double convertMilimetrosToMetros() {
        double resultado;
        resultado = numero/1000;
        return resultado;
    }
    double convertMilimetrosToCentimetros() {
        double resultado;
        resultado = numero/10;
        return resultado;
    }
    double convertCentimetrosoToMilimetros() {
        double resultado;
        resultado = numero*10;
        return resultado;
    }
    double convertMetrosTPie(double unPie){
        double resultado;
        resultado = numero*unPie;
        return resultado;
    }
    
}
