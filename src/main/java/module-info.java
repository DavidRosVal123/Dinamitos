module equipo.dinamita.restamita {
    requires javafx.controls;
    requires javafx.fxml;

    opens equipo.dinamita.restamita to javafx.fxml;
    exports equipo.dinamita.restamita;
}
