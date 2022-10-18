package com.baima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("importingClassMetadata.getClassName() = " + importingClassMetadata.getClassName());
        System.out.println("hasAnnotation = " + importingClassMetadata.hasAnnotation("org.springframework.context.annotation.Configuration"));
        System.out.println("getAnnotationAttributes" + importingClassMetadata.getAnnotationAttributes("org.springframework.context.annotation.ComponentScan"));
        return new String[]{"com.baima.bean.Dog"};
    }
}
