import mock.spring.factory.BeanFactory;
import mock.spring.factory.config.BeanDefinition;
import mock.spring.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void beanFactoryTest(){
        // 1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        beanFactory.registerBeanDefinition("user", beanDefinition);

        // 3. 第一次获取Bean
        User user = (User) beanFactory.getBean("user");
        user.userInfo();

        // 4. 第二次通过Singleton获取Bean
        User userSingleton = (User) beanFactory.getSingleton("user");
        userSingleton.userInfo();
    }
}
