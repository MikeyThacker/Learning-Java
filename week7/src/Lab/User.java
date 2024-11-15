package Lab;

public class User {
    protected String name;
    protected MessageBoard board;

    public User(String name, MessageBoard board) {
        this.name = name;
        this.board = board;
    }

    public String getName() {
        return name;
    }
    public MessageBoard getBoard() {
        return board;
    }

    public void post(String news) {
        board.setNews(news);
    }
}
