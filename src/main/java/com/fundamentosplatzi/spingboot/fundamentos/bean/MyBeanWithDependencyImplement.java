package com.fundamentosplatzi.spingboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metoso MyBeanWithDependencyImplement");
        int number = 1;
        LOGGER.debug("El numero enviado como parametro a la dependencia operation es: "+number);
        System.out.println(myOperation.suma(number));
        System.out.println("Hola desde la implemetacion de un bean con dependencia");
    }
}
