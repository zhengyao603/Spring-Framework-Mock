package mock.spring.factory.support;

import mock.spring.factory.BeanFactory;
import mock.spring.factory.config.BeanDefinition;
import mock.spring.factory.BeansException;

/**
 * 定义抽象Bean工厂
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = getSingleton(beanName);
        if (bean == null){
            return createBean(beanName, getBeanDefinition(beanName));
        }
        return bean;
    }
}
