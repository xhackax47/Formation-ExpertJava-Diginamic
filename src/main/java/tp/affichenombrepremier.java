package tp;
public class affichenombrepremier {
    
    public static int NombreFacteur(int N) {
         int Count=2,I;
         double Racine=Math.sqrt(N);
         for(I=2; I<=Racine;I++) if(N % I == 0) Count++;
         return Count;
    }
    
    public static boolean Premier(int N) {
        return (NombreFacteur(N)==2);
    }
 
    public static int NombrePremierPlusPetit(int N) {
         int Count=0;
         for(int I=2; I<N; I++) if(Premier(I)) Count++;
         return Count;
    }
 
    public static void main(String[] args) {
        System.out.println("Liste des nombres premier avant 1000: ");
        for(int I=2; I<1000; I++) if(Premier(I)) System.out.print(Integer.toString(I)+" ");
        System.out.println();
        System.out.print("Nombre de nombre premier avant 1000: ");
        System.out.println(NombrePremierPlusPetit(1000));
    }
    
}