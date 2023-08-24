package ac.bbi.dbreplication.db;

import static ac.bbi.dbreplication.db.DataSourceType.Key.REPLICA_NAME;
import static ac.bbi.dbreplication.db.DataSourceType.Key.SOURCE_NAME;

public enum DataSourceType {
    SOURCE(SOURCE_NAME),
    REPLICA(REPLICA_NAME),
    ;

    private final String key;

    DataSourceType(String key) {
        this.key = key;
    }

    public static class Key {
        public static final String ROUTING_NAME = "ROUTING";
        public static final String SOURCE_NAME = "SOURCE";
        public static final String REPLICA_NAME = "REPLICA";
    }
}
