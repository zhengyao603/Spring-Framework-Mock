package mock.spring.factory;

/**
 *  Bean工厂接口
 */

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
}
