package use_push;

import common.Article;

/**
 * @author yeobi Created 2020-02-15
 */
public class SlackPlatform implements Observer {

    public void update(Article article) {
        System.out.println("슬랙으로 새 글 등록 알림");
        System.out.println(article);
    }

}
