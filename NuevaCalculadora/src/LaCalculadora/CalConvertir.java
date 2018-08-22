package LaCalculadora;

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
        return numero/1000;
    } 
    double convertKgToGramos () {
        return numero*1000;
    }
    double convertMetrosToCentimetros() {
        return numero*100;
    }
    double convertCentimetrosToMetros() {
        return numero/100;
    }
    double convertMetrosToMilimetros() {
        return numero*1000;
    }
    double convertMilimetrosToMetros() {
        return numero/1000;
    }
    double convertMilimetrosToCentimetros() {
        return numero/10;
    }
    double convertCentimetrosToMilimetros() {
        return numero*10;
    }
    double convertMetrosToPulgada(){
        return numero*pul;
    }
    double convertMetrosToPie(){
        return numero*pie;
    }
    double convertPieToMetros(){
        return numero/pie;
    }
    double convertPieToPulgada(){
        return numero*12;
    }
    double convertPulgadaToPie(){
        return numero/12;
    }
    double convertPieToCentimetros(){
        return (numero/pie)*100;
    }
    double convertPieToMilimetros(){
        return (numero/pie)*1000;
    }
    double convertPulgadaToMetros(){
        return numero/pul;
    }
    double convertPulgadaToCentimetros(){
        return (numero/pul)*100;
    }
    double convertPulgadaToMilimetros(){
        return (numero/pul)*1000;
    }
    double convertCentimetrosToPie(){
        return (numero*pie)/100;
    }
    double convertCentimetrosToPulgada(){
        return (numero*pul)/100;
    }
    double convertMilimetrosToPie(){
        return (numero*pie)/1000;
    }
    double convertMilimetrosToPulgada(){
        return (numero*pul)/1000;
    }

}
