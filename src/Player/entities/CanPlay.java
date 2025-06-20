package Player.entities;

//interfaccia per settare il metodo riproducibile da specificare poi nelle classi in cui la uso
public interface CanPlay {
    //int getVolume();

    String getVolume();

    void addVolume();

    void removeVolume();

    int getDuration();

    void setDuration(int duration);

    void play();
}
