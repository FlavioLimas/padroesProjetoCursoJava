package observer;

public class AniversarioSurpresa {
    
    public static void main(String[] args) {
        Porteiro porteiro = new Porteiro();

        Namorada namorada = new Namorada();
        porteiro.registrarObservador(namorada);

        porteiro.monitorar();

        
        porteiro.registrarObservador(e -> System.out.println("Surpresa via lambda!"));
    }
}
