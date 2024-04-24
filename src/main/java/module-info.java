module org.example.demolab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demolab6 to javafx.fxml;
    exports org.example.demolab6;
}