package chainOfResponsability.clase;

public abstract class ModPlata {
    protected ModPlata succesor;//protected-ca sa avem acces la el din Card pentru chain
    public abstract void plateste(int suma, String nume);

    public void setSuccesor(ModPlata succesor) {
        this.succesor = succesor;
    }
}
