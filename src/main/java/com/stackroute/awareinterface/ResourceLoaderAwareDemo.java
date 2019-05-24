package com.stackroute.awareinterface;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class ResourceLoaderAwareDemo implements ResourceLoaderAware {

    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println(resourceLoader.getClassLoader());
    }
}
