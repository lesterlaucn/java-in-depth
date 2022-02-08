package com.tenstone.annotation;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created by liuyuancheng on 2022/2/8  <br/>
 * 注解处理器（Annotation Processor）是javac的一个工具，它用来在编译时扫描和处理注解（Annotation）。
 * 你可以对自定义注解，并注册相应的注解处理器。
 * 注解处理器是发生在类型擦除（type erasure）之前的。
 *
 * @author liuyuancheng
 */
@SupportedAnnotationTypes({
        "com.tenstone.annotation.MethodDemoAnnotation2"
})
public class DemoMethodAnnotationProcessor extends AbstractProcessor {


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println(annotations);
        return true;
    }
}
