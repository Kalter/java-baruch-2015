package day3.tp.dao;

import java.io.File;

public interface MigrationDao {

    boolean alreadyMigrated(String fileName);

    void migrate(File sql);

    void migrate(String folderName);

}
