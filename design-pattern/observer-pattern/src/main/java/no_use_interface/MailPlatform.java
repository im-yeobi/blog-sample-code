package no_use_interface;

import common.Article;

/**
 * @author yeobi Created 2020-02-15
 */
public class MailPlatform implements Observer {

    public void update(Article article) {
        System.out.println("메일로 새 글 등록 알림");
    }

}
