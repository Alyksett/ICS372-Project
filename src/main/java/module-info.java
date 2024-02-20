module JavaFXDemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens aya.reviews to javafx.fxml;
    exports aya.reviews;
}