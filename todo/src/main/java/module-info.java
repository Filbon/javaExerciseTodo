module se.kth.filkle.todo {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.kth.filkle.todo to javafx.fxml;
    exports se.kth.filkle.todo;
}