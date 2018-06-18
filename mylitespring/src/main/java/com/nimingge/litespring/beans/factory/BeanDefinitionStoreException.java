package com.nimingge.litespring.beans.factory;

import com.nimingge.litespring.beans.BeansException;

public class BeanDefinitionStoreException extends BeansException {
    public BeanDefinitionStoreException(String msg,Throwable cause){
        super(msg,cause);
    }
}
