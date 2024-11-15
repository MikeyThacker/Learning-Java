package Lab;

import java.util.ArrayList;

public class MessageBoard {
    private String news;
    private ArrayList<User> members;

    public MessageBoard() {
        news = "no news";
        members = new ArrayList<>();
    }

    public void addMember(User user) {
        members.add(user);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
