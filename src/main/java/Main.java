import charpter1.di.GreetingService;
import charpter1.droid.Kdroid;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by qingyuan on 6/6/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("droid.xml");

        Kdroid kdroid = (Kdroid) beanFactory.getBean("kdroid");

        System.out.println(kdroid.workOnTadk());
    }
}
