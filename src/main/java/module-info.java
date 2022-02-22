module com.example.unitscalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unitscalculator to javafx.fxml;
    exports com.example.unitscalculator;
    exports com.example.unitscalculator.Units;
    opens com.example.unitscalculator.Units to javafx.fxml;
}