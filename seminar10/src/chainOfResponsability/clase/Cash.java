package chainOfResponsability.clase;

public class Cash extends ModPlata{
    private int sumaBani;

    public Cash(int sumaBani) {
        this.sumaBani = sumaBani;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sumaBani>=suma){
            System.out.println("Plata a fost realizata cash");
            sumaBani-=suma;
        }
        else{
            super.succesor.plateste(suma, nume);
        }
    }
}
