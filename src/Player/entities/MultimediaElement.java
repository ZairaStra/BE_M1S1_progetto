package Player.entities;

public abstract class MultimediaElement {

    //ATTRIBUTO
    protected String title;

    //COSTRUTTORE
    public MultimediaElement(String title) {
        this.title = title;
    }

    //METODI - non uso mai il getter per il titolo, non serve
//    public String getTitle() {
//        return title;
//    }
}
