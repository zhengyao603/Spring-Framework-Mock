package mock.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * BeanFactory: 用于生成和使用Bean对象的工厂，简易实现为将Bean注册到HashMap中
 */

public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
