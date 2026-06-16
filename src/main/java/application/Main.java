package application;

import static application.databases.CheckDatabaseConnection.checkDatabaseConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        checkDatabaseConnection();
        
    }
}
