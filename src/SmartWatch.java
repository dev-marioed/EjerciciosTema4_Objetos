public class SmartWatch extends SmartDevice{

    public SmartWatch() {
    }

    public SmartWatch(String so,double tamaño) {
        this.sistemaOperativo=so;
        this.tamañoPantalla=tamaño;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamañoPantalla=" + tamañoPantalla +
                '}';
    }
}
