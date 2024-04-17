package proxy.clase;

public class Proxy implements BiletAbstract{
    private BiletAbstract bilet;
    private static int varstaMnima=14;

    public Proxy(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public static void setVarstaMnima(int varstaMnima) {
        Proxy.varstaMnima = varstaMnima;
    }

    @Override
    public void vanzareBilet(Client client) {
        if(client.getVarsta()>=varstaMnima){
            this.bilet.vanzareBilet(client);
        }
        else{
            System.out.println("Varsta minima este 14 ani");
        }
    }
}
