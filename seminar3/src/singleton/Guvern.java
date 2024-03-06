package singleton;

public class Guvern {
    private int nrGuvernatori;
    private String numePrimMinistru;
    private int nrLuni;
    private static Guvern instanta  =null;

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    //constructorul poate sa aiba si mai mult de 2 parametrii
    //cand il generam e public si il facem private
    private Guvern(int nrGuvernatori, String numePrimMinistru, int nrLuni) {
        this.nrGuvernatori = nrGuvernatori;
        this.numePrimMinistru = numePrimMinistru;
        this.nrLuni = nrLuni;
    }

    public synchronized static Guvern getInstance(int nrGuvernatori, String numePrimMinistru, int nrLuni){
        if(instanta == null){
            instanta = new Guvern(nrGuvernatori, numePrimMinistru, nrLuni);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Guvern{" +
                "nrGuvernatori=" + nrGuvernatori +
                ", numePrimMinistru='" + numePrimMinistru + '\'' +
                ", nrLuni=" + nrLuni +
                '}';
    }
}
