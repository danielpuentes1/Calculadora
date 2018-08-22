public class CalConvertir {
    double numero;
    double pul;
    double pie;
    void pulgada(){
        pul=3937/100;
    }
    void unPie(){
        pie=328083/100000;
    }
               
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
    double convertCentimetrosToMilimetros() {
        double resultado;
        resultado = numero*10;
        return resultado;
    }
    double convertMetrosToPulgada(){
        double resultado;
        resultado = numero*pul;
        return resultado;
    }
    double convertMetrosToPie(){
        double resultado;
        resultado = numero*pie;
        return resultado;
    }
    double convertPieToMetros(){
        double resultado;
        resultado = numero/pie;
        return resultado;
    }
    double convertPieToPulgada(){
        double resultado;
        resultado = numero*12;
        return resultado;
    }
    double convertPulgadaToPie(){
        double resultado;
        resultado = numero/12;
        return resultado;
    }
    double convertPieToCentimetros(){
        double resultado;
        resultado = (numero/pie)*100;
        return resultado;
    }
    double convertPieToMilimetros(){
        double resultado;
        resultado = (numero/pie)*1000;
        return resultado;
    }
    double convertPulgadaToMetros(){
        double resultado;
        resultado = numero/pul;
        return resultado;
    }
    double convertPulgadaToCentimetros(){
        double resultado;
        resultado = (numero/pul)*100;
        return resultado;
    }
    double convertPulgadaToMilimetros(){
        double resultado;
        resultado = (numero/pul)*1000;
        return resultado;
    }
    double convertCentimetrosToPie(){
        double resultado;
        resultado = (numero*pie)/100;
        return resultado;
    }
    double convertCentimetrosToPulgada(){
        double resultado;
        resultado = (numero*pul)/100;
        return resultado;
    }
    double convertMilimetrosToPie(){
        double resultado;
        resultado = (numero*pie)/1000;
        return resultado;
    }
    double convertMilimetrosToPulgada(){
        double resultado;
        resultado = (numero*pul)/1000;
        return resultado;
    }

}
