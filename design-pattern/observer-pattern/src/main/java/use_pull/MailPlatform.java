package use_pull;

import common.Article;

/**
 * @author yeobi Created 2020-02-15
 */
public class MailPlatform implements Observer {

    public void update(Subject subject) {
        System.out.println("메일로 새 글 등록 알림");

        // TechBlog 타입으로 형변환
        if (subject instanceof TechBlog) {
            TechBlog techBlog = (TechBlog) subject;
            Article article = techBlog.getArticle();
            System.out.println(article);
        }
    }

}
