package mock.spring.factory.config;

/**
 * 单例Bean注册接口
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
