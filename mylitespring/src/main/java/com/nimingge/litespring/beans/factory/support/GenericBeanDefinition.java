package com.nimingge.litespring.beans.factory.support;

import com.nimingge.litespring.beans.BeanDefinition;

public class GenericBeanDefinition implements BeanDefinition {
    private String id;
    private String beanClassNsme;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassNsme = beanClassName;
    }

    public String getBeanClassName() {
        return this.beanClassNsme;
    }
}
