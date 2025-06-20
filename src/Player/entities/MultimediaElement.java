package Player.entities;

public abstract class MultimediaElement {

    //ATTRIBUTO
    protected String title;

    //COSTRUTTORE
    public MultimediaElement(String title) {
        this.title = title;
    }

    //METODI
    public String getTitle() {
        return title;
    }
}
