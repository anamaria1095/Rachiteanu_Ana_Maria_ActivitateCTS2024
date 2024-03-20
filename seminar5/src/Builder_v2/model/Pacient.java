package Builder_v2.model;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }

    protected Pacient(){

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    public static class PacientBuilder implements AbstractBuilder{
        private String nume;
        private boolean arePatRabatabil;
        private boolean areMicDejunInclus;
        private boolean arePapuciCamera;
        private boolean areHalatInterior;

        public PacientBuilder(String nume){
            this.nume = nume;
        }

        @Override
        public AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMicDejunInclus(boolean areMicDejunInclus) {
            this.areMicDejunInclus = areMicDejunInclus;
            return this;
        }

        @Override
        public AbstractBuilder adaugaPapuciCamera(boolean arePapuciCamera) {
            this.arePapuciCamera = arePapuciCamera;
            return this;
        }

        @Override
        public AbstractBuilder adaugaHalatInterior(boolean areHalatInterior) {
            this.areHalatInterior = areHalatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            Pacient pacient = new Pacient( this.nume,  this.arePatRabatabil,  this.areMicDejunInclus,  this.arePapuciCamera,  this.areHalatInterior);
            return pacient;
        }
    }
}
