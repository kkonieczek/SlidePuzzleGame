package kamilkonieczek;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BoardViewModel {


    private StringProperty tile1 = new SimpleStringProperty();
    private StringProperty tile2 = new SimpleStringProperty();
    private StringProperty tile3 = new SimpleStringProperty();
    private StringProperty tile4 = new SimpleStringProperty();
    private StringProperty tile5 = new SimpleStringProperty();
    private StringProperty tile6 = new SimpleStringProperty();
    private StringProperty tile7 = new SimpleStringProperty();
    private StringProperty tile8 = new SimpleStringProperty();
    private StringProperty tile9 = new SimpleStringProperty();

    public String getTile1() {
        return tile1.get();
    }

    public StringProperty tile1Property() {
        return tile1;
    }

    public void setTile1(String tile1) {
        this.tile1.set(tile1);
    }

    public String getTile2() {
        return tile2.get();
    }

    public StringProperty tile2Property() {
        return tile2;
    }

    public void setTile2(String tile2) {
        this.tile2.set(tile2);
    }

    public String getTile3() {
        return tile3.get();
    }

    public StringProperty tile3Property() {
        return tile3;
    }

    public void setTile3(String tile3) {
        this.tile3.set(tile3);
    }

    public String getTile4() {
        return tile4.get();
    }

    public StringProperty tile4Property() {
        return tile4;
    }

    public void setTile4(String tile4) {
        this.tile4.set(tile4);
    }

    public String getTile5() {
        return tile5.get();
    }

    public StringProperty tile5Property() {
        return tile5;
    }

    public void setTile5(String tile5) {
        this.tile5.set(tile5);
    }

    public String getTile6() {
        return tile6.get();
    }

    public StringProperty tile6Property() {
        return tile6;
    }

    public void setTile6(String tile6) {
        this.tile6.set(tile6);
    }

    public String getTile7() {
        return tile7.get();
    }

    public StringProperty tile7Property() {
        return tile7;
    }

    public void setTile7(String tile7) {
        this.tile7.set(tile7);
    }

    public String getTile8() {
        return tile8.get();
    }

    public StringProperty tile8Property() {
        return tile8;
    }

    public void setTile8(String tile8) {
        this.tile8.set(tile8);
    }

    public String getTile9() {
        return tile9.get();
    }

    public StringProperty tile9Property() {
        return tile9;
    }

    public void setTile9(String tile9) {
        this.tile9.set(tile9);
    }
}
