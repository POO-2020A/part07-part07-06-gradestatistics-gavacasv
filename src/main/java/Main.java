
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        int numeroInput=0;
        do{
            numeroInput=Integer.valueOf(scanner.nextLine());
            if(numeroInput>=0 &&numeroInput<=100)
                notas.add(numeroInput);
        }while(numeroInput!=-1);
        Notas notasP=new Notas(notas);
        System.out.println("Point average (all): "+notasP.average());
        System.out.println("Point average (passing): "+notasP.averagePair());
        System.out.print("Pass percentage:");
        if(notasP.percentage()==0){
            System.out.print(" -\n");
        }
        else
            System.out.print(" "+notasP.percentage()+"\n");
        System.out.println("Grade distribution:"
                + "\n5: "+notasP.printStar(100, 90)
                + "\n4: "+notasP.printStar(90,80 )
                + "\n3: "+notasP.printStar(80, 70)
                + "\n2: "+notasP.printStar(70, 60)
                + "\n1: "+notasP.printStar(60, 50)
                + "\n0: "+notasP.printStar(50, 0));
    
    }
}
