package pl.camp.it.model;

public enum ButtonText {
    OK("Ok"),
    BACK("Back"),
    ENTER("Enter"),
    PLAY("Play"),
    DELETE("Delete");

    String textToView;

    ButtonText(String textToView) {
        this.textToView = textToView;
    }

    public String getTextToView() {
        return textToView;
    }
}
