
import java.util.ArrayList;
public class Notas {
    private ArrayList<Integer> notas;

    public Notas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public double average(){

        int suma=0;
        for(int nota:this.notas){
            suma+=nota;
        }
      
        return (1.0*suma)/this.notas.size();
        
    }
    public double averagePair(){
        double average=0;
        int suma=0;
        int cont=0;
        for(int nota:this.notas){
            if(nota>=50){
               suma+=nota;
               cont++;
            }
 
        }
        if(suma!=0)
            average=(1.0*suma)/cont;
        return average;
        
    }
    public double percentage(){

        int cont=0;
        double s=0;
        for(int nota:this.notas){
            if(nota>=50){
                cont++;

            }
                     
        }
        s=((1.0*cont)/(1.0*this.notas.size()))*100;
        
        return s;
        
    }
    public String printStar( int pointsSup, int pointsInf){
        
        String star="";
        for(int nota:this.notas){
            if(nota<pointsSup && nota>=pointsInf)
                star+="*";
        }
        return star;
    }
    
}
