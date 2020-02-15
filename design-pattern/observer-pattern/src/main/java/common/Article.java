package common;

/**
 * @author yeobi Created 2020-02-15
 */
public class Article {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "제목 : " + title + ", 내용 : " + content;
    }
}
