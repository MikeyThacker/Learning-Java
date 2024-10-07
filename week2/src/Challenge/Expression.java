package Challenge;

public class Expression {
    private String content;

    public Expression(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void ruleOne(){
        if (content.endsWith("I")) {
            content = content + "U";
        }
    }

    public void ruleTwo(){
        content = content + content.substring(1);
    }

    public void ruleThree(){
        content = content.replaceAll("III", "U");
    }

    public void ruleFour(){
        content = content.replaceAll("UU", "");
    }
}
