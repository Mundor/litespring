package com.nimingge.litespring.test;

import com.nimingge.litespring.beans.factory.BeanCreationException;
import com.nimingge.litespring.beans.factory.BeanDefinitionStoreException;
import com.nimingge.litespring.beans.factory.BeanFactory;
import com.nimingge.litespring.beans.factory.support.DefaultBeanFactory;
import com.nimingge.litespring.beans.BeanDefinition;
import com.nimingge.litespring.service.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition bd = factory.getBeanDefinition("petStore");

        Assert.assertEquals("com.nimingge.litespring.service.PetStoreService", bd.getBeanClassName());
        PetStoreService petStoreService = (PetStoreService) factory.getBean("petStore");
        Assert.assertNotNull(petStoreService);

    }

    @Test
    public void testInvalidBean(){
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        try {
            factory.getBean("invalidBean");
        }catch (BeanCreationException e){
            e.printStackTrace();
            return;
        }
        Assert.fail("expect BeanCreationException");
    }

    @Test
    public void testInvalidXML(){
        try {
            new DefaultBeanFactory("xxx.xml");
        }catch (BeanDefinitionStoreException ex){
            ex.printStackTrace();
            return;
        }
        Assert.fail("expect BeanDefinitionStoreException");
    }
}
