module by.shtrudell.astontask {
    requires javafx.controls;
    requires javafx.fxml;


    opens by.shtrudell.astontask to javafx.fxml;
    exports by.shtrudell.astontask;
}