package parcial2;

public class Motocicleta extends Vehiculo{

    private TipoMotocicleta tipoMotocicleta;
    
    public Motocicleta(String marca, String modelo, int anio, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, anio);
        this.tipoMotocicleta = tipoMotocicleta;
        
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    @Override
    public String imprimirInformacion(){
       return super.imprimirInformacion()+", tipo de motocicleta: "+tipoMotocicleta;
    }
}
