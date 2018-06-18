package com.nimingge.litespring.beans.factory;

import com.nimingge.litespring.beans.BeanDefinition;
import com.nimingge.litespring.beans.BeansException;

public class BeanCreationException extends BeansException {
    String beanName;

    public BeanCreationException(String message) {
        super(message);
    }

    public BeanCreationException(String message, Throwable cause) {
        super(message, cause);
    }
    public BeanCreationException(String beanName,String msg){
        super("Error creating bean with name '" + beanName + "': " +msg);
        this.beanName = beanName;
    }

    public BeanCreationException(String beanName,String msg,Throwable cause){
        this(beanName,msg);
        initCause(cause);
    }
    public String getBeanName(){
        return this.beanName;
    }
}