import common.Article;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author yeobi Created 2020-02-15
 * @description 옵저버 패턴 적용 안 한 경우 테스트
 */
public class TechBlogTest {

    private Article article;

    @Before
    public void setUp() {
        article = new Article();
        article.setTitle("새 글 제목");
        article.setContent("새 글 내용");
    }

    @Test
    public void noUseTest() {
        System.out.println("옵저버 패턴 적용하지 않은 경우");
        no_use.MailPlatform mailPlatform = new no_use.MailPlatform();
        no_use.SlackPlatform slackPlatform = new no_use.SlackPlatform();

        no_use.TechBlog techBlog = new no_use.TechBlog(mailPlatform, slackPlatform);
        techBlog.newPosting(new Article());
        System.out.println();
    }

    @Test
    public void noUse_interfaceTest() {
        System.out.println("옵저버 패턴 적용하지 않은 경우. 인터페이스 활용");
        no_use_interface.Observer mailPlatform = new no_use_interface.MailPlatform();
//        no_use_interface.Observer slackPlatform = new no_use_interface.SlackPlatform();

        no_use_interface.TechBlog techBlog = new no_use_interface.TechBlog(mailPlatform);
        techBlog.newPosting(new Article());
        System.out.println();
    }

    @Test
    public void use_observerPattern_pushTest() {
        System.out.println("옵저버 패턴 적용. 푸시 방식");
        // 옵저버 인터페이스 사용
        use_push.Observer mailPlatform = new use_push.MailPlatform();
        use_push.Observer slackPlatform = new use_push.SlackPlatform();

        use_push.TechBlog techBlog = new use_push.TechBlog(new ArrayList<use_push.Observer>());
        // 옵저버 등록
        techBlog.registerObserver(mailPlatform);
        techBlog.registerObserver(slackPlatform);
        techBlog.newPosting(article);
        System.out.println();
    }

    @Test
    public void use_observerPattern_pullTest() {
        System.out.println("옵저버 패턴 적용. 풀 방식");
        // 옵저버 인터페이스 사용
        use_pull.Observer mailPlatform = new use_pull.MailPlatform();
        use_pull.Observer slackPlatform = new use_pull.SlackPlatform();

        use_pull.TechBlog techBlog = new use_pull.TechBlog(new ArrayList<use_pull.Observer>());
        // 옵저버 등록
        techBlog.registerObserver(mailPlatform);
        techBlog.registerObserver(slackPlatform);
        techBlog.newPosting(article);
        System.out.println();
    }

}
