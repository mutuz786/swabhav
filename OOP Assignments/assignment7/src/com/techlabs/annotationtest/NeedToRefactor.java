package com.techlabs.annotationtest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)


public @interface NeedToRefactor {
}