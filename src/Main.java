public class Main {
    public static void main(String[] args) {
     /*   En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas:
            SmartPhone y SmartWatch.

                Agregaréis atributos tal cual tendrían esos objetos en la realidad.

                Crear constructor vacío y con todos los parámetros para cada clase.

        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/

        SmartDevice telefono=new SmartPhone("Android",6.5);
        SmartDevice reloj=new SmartWatch("iOS lite",2.2);

        System.out.println(telefono);

        System.out.println(reloj);

    }
}