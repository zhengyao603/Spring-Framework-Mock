import mock.spring.BeanDefinition;
import mock.spring.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void beanFactoryTest(){
        // 1. 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册 Bean
        BeanDefinition beanDefinition = new BeanDefinition(new BeanDefinitionTest());
        beanFactory.registerBeanDefinition("BeanDefinitionTest", beanDefinition);

        // 3. 获取 Bean
        BeanDefinitionTest beanDefinitionTest = (BeanDefinitionTest) beanFactory.getBean("BeanDefinitionTest");
        beanDefinitionTest.testBeanDefinition();
    }

}
