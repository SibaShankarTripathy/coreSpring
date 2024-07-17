package com.sst;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * ConstructorInjection
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/* Hold filepath location */
    	FileSystemResource fsr = new FileSystemResource("src/main/java/com/sst/applicationConext.xml");
		/* Creating bean factory container */
    	XmlBeanFactory factory = new XmlBeanFactory(fsr);
		/* Getting bean object */
    	ConstructorInjection obj =(ConstructorInjection)factory.getBean("cnstInjt");
		/* Call to method */
    	obj.getCustomCurrentTime();
    }
}
