package com.fundamentosplatzi.spingboot.fundamentos.component;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente");
    }
}
