package use_pull;

import common.Article;

import java.util.List;

/**
 * @author yeobi Created 2020-02-15
 * @description 옵저버 패턴 적용. 풀 방식
 */
public class TechBlog implements Subject {

    private List<Observer> observers;
    private Article article;

    public TechBlog(List<Observer> observers) {
        this.observers = observers;;
    }

    @Override
    public void registerObserver(Observer observer) {
        // 옵저버 등록
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);

        if (idx >= 0) {
            // 옵저버 삭제
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("새 글 등록 알림");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void newPosting(Article article) {
        System.out.println("새 글 등록");
        this.article = article;
        notifyObservers();
    }

    public Article getArticle() {
        return article;
    }

}
