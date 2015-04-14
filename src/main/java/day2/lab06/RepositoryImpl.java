package day2.lab06;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {
    @Override
    public void persistMessage(String message) {
        throw new DataBaseException("Failed to save");
    }
}
