package parcial2;


public class Main {

    public static void main(String args[]) {
        
        Automovil MiAuto = new Automovil("Honda", "Civic", 2019, 4, TipoCombustible.GASOLINA);
        
        System.out.println(MiAuto.imprimirInformacion());


        
        Motocicleta MiMoto = new Motocicleta("Yamaha", "YZF-R3", 2021, TipoMotocicleta.DEPORTIVA);
        
        System.out.println(MiMoto.imprimirInformacion());

    }
}
