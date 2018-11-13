package org.smart4j.framework.core.impl.support;

import java.lang.annotation.Annotation;

public class AnnotationClassTemplate extends ClassTemplate{
	protected final Class<? extends Annotation> annotationClass;
	protected AnnotationClassTemplate(String packageName, Class<? extends Annotation> annotationClass) {
        super(packageName);
        this.annotationClass = annotationClass;
    }
}
