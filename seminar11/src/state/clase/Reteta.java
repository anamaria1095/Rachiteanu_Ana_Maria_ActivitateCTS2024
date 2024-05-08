package state.clase;

public class Reteta {
    private int nrReteta;
    private int nrMedicamente;
    private State stare;

    public Reteta(int nrReteta, int nrMedicamente) {
        super();
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.stare = new Emisa();
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }
    public void solicitaMedicament(){
        if(this.stare instanceof Emisa){
            System.out.println("Conform retetei cu numarul " + nrReteta + " au fost solicitate " + nrMedicamente + " medicamente");
//            this.stare = new Solicitata();
            //alta varianta
            State solicitata = new Solicitata();//dependency inversion
            solicitata.schimbaStarea(this);
        }
        else{
            System.out.println("Medicamentele din reteta " + nrReteta + " nu pot fi solicitate");
        }
    }

    //cand putem sa trecem in mai multe stari dintr-o stare
    //facem aici trecerile

    public void cumparaMedicamente(){
        if(this.stare instanceof Solicitata){
            State achizitionara = new Achizitionata();
            achizitionara.schimbaStarea(this);
            System.out.println("Reteta cu numarul " + nrReteta + "a fost achizitionata");
        }
        else{
            System.out.println("Reteta " + nrReteta + " nu poate fi achizitionata");
        }
    }

    public void respingeAchizitie(){
        if(this.stare instanceof Solicitata){
            State emisa = new Emisa();
            emisa.schimbaStarea(this);
            System.out.println("Medicamentele din reteta " + nrReteta + " nu sunt disponibile");
        }
        else{
            System.out.println("Reteta nu poate fi respinsa");
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", nrMedicamente=" + nrMedicamente +
                ", stare=" + stare +
                '}';
    }
}
