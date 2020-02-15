package no_use;

import common.Article;

/**
 * @author yeobi Created 2020-02-15
 * @description 옵저버 패턴 적용하지 않은 경우. 새 글 알리미
 */
public class TechBlog {

    private MailPlatform mailPlatform;
    private SlackPlatform slackPlatform;
    private Article article;

    public TechBlog(
            MailPlatform mailPlatform,
            SlackPlatform slackPlatform) {
        this.mailPlatform = mailPlatform;
        this.slackPlatform = slackPlatform;
    }

    public void newPosting(Article article) {
        this.article = article;

        System.out.println("새글 등록");
        mailPlatform.update(article);
        slackPlatform.update(article);
    }

}
