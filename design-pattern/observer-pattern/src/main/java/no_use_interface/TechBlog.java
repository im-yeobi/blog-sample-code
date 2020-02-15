package no_use_interface;

import common.Article;

/**
 * @author yeobi Created 2020-02-15
 * @description 옵저버 패턴 적용하지 않은 경우. 인터페이스 적용
 */
public class TechBlog {

    private Observer observer;
    private Article article;

    public TechBlog(Observer observer) {
        this.observer = observer;;
    }

    public void newPosting(Article article) {
        this.article = article;

        System.out.println("새글 등록");
        observer.update(article);
    }

}
