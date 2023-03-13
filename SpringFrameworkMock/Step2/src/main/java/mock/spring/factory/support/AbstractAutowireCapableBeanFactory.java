package mock.spring.factory.support;

import mock.spring.factory.BeansException;
import mock.spring.factory.config.BeanDefinition;

/**
 * 定义默认Bean创建的抽象Bean工厂超类
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e){
            throw new BeansException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, bean);

        return bean;
    }
}
