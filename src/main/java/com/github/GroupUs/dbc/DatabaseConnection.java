package com.github.GroupUs.dbc;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import static com.github.GroupUs.Main.databaseUrl;

public class DatabaseConnection {
    // private String databaseUrl = "mongodb://xxxxxxxxxxxxxxxxxxxxxx";
    private MongoClientURI uri = new MongoClientURI(databaseUrl);
    private MongoClient client = new MongoClient(uri);
    private MongoDatabase db = client.getDatabase(uri.getDatabase());
    public DatabaseConnection() {}
    public void close() {
        if (this.client != null) {
            this.client.close();
        }
    }
    public MongoDatabase getConnection() {

        return this.db;
    }

}
