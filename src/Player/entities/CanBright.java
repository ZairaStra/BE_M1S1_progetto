package Player.entities;

public interface CanBright {

//    int getBrightness();

    String getBrightness();

    void addBrightness();

    void removeBrightness();


    //non posso chiamarlo qui altrimenti ho un problema in Video, che dovrebbe ereditarlo mentre lì ho un unico metodo play
    // void show();
}
