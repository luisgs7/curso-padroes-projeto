package br.com.cod3r.factory.app.dbadapter.after;

import br.com.cod3r.factory.app.dbadapter.after.db.DB;
import br.com.cod3r.factory.app.dbadapter.after.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.after.factory.OracleFactory;
import br.com.cod3r.factory.app.dbadapter.after.factory.PostgresFactory;

public class Client {
    public static void main(String[] args) {
        DB db = new PostgresFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.query("INSERT INTO users VALUES ('User', 25)");

        DB db1 = new OracleFactory().getDatabase();
        db1.query("SELECT * FROM alunos");
        db1.query("INSERT INTO users VALUES ('Pedro', 30)");
    }
}
