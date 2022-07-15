public class Main {
    public static void main(String[] args) {
        System.out.println("[ Ejercicio Tema 3 ]");
        System.out.println("==Parte 1==");
        System.out.println("La suma de 3 variables es:"+suma(5,9,12));
        System.out.println("==Parte 2==");
        Coche miCoche = new Coche();
        System.out.println("Se agrega Puerta");
        miCoche.agregarPuerta();
        System.out.println(miCoche.puerta);
        System.out.println("Se quita Puerta");
        miCoche.quitarPuerta();
        System.out.println(miCoche.puerta);
    }
    public static int suma(int a,int b, int c){
        return a+b+c;
    }
    static class Coche{
        public int puerta = 4;
        public void agregarPuerta(){
            this.puerta++;
        }
        public void quitarPuerta(){
            this.puerta--;
        }

    }
}
