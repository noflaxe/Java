package com.epam.context;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public class BeanDefinition {
    private String id;
    private Class clazz;
    private Map<String,Object> constructorParams = new HashMap<>();
    private Map<String,Object> propertyParams = new HashMap<>();

    public BeanDefinition() {
    }

    public BeanDefinition(Class clazz, String id) {
        this.clazz = clazz;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Map<String, Object> getConstructorParams() {
        return constructorParams;
    }

    public void setConstructorParams(Map<String, Object> constructorParams) {
        this.constructorParams = constructorParams;
    }

    public Map<String, Object> getPropertyParams() {
        return propertyParams;
    }

    public void setPropertyParams(Map<String, Object> propertyParams) {
        this.propertyParams = propertyParams;
    }
}
