package mock.spring;

/**
 * BeanDefinition: 用于定于Bean对象的类，简易实现为用Object表示对象
 */

public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
