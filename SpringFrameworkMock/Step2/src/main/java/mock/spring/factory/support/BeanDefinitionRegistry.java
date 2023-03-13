package mock.spring.factory.support;

import mock.spring.factory.config.BeanDefinition;

/**
 * 定义Bean注册接口
 */

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
