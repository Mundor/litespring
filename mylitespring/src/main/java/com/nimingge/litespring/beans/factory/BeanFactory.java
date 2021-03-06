package com.nimingge.litespring.beans.factory;

import com.nimingge.litespring.beans.BeanDefinition;

public interface BeanFactory {
    BeanDefinition getBeanDefinition(String beanId);

    Object getBean(String beanId);
}
