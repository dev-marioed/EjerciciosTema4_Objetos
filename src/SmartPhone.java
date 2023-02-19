public class SmartPhone extends SmartDevice{

    public SmartPhone() {
    }

    public SmartPhone(String so,double tamaño){
        this.sistemaOperativo=so;
        this.tamañoPantalla=tamaño;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamañoPantalla=" + tamañoPantalla +
                '}';
    }
}
