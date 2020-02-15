package use_push;

/**
 * @author yeobi Created 2020-02-15
 * @description 옵저버 패턴 적용. 푸시 방식
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
