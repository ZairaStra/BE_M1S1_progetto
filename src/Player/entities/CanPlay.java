package Player.entities;

//interfaccia per settare il metodo riproducibile da specificare poi nelle classi in cui la uso
public interface CanPlay {
    int getVolume();

    void addVolume();

    void removeVolume();

    double getDuration();

    void setDuration(double duration);

    void play();
}
