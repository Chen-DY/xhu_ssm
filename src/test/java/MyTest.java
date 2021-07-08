import com.odd.service.NewsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testFindAll(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        NewsService newsService = (NewsService) ac.getBean("NewsService");
        newsService.queryAllNews();
    }
}
