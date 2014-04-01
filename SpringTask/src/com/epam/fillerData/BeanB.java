package com.epam.fillerData;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public class BeanB {

    private String someString;
    private BeanA referenceToAnotherBean;

    public BeanB(String someString) {
        this.someString = someString;
    }

    public void setReferenceToAnotherBean(BeanA referenceToAnotherBean) {
        this.referenceToAnotherBean = referenceToAnotherBean;
    }
}
