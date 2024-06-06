package parcial2;

public class Automovil extends Vehiculo {
    
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    
    public Automovil(String marca, String modelo, int anio, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String imprimirInformacion(){
       return super.imprimirInformacion()+", "+numeroPuertas+" puertas, combustión a "+tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipocombustible) {
        this.tipoCombustible = tipocombustible;
    }
    
    

}
