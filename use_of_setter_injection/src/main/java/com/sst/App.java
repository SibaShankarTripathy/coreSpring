package com.sst;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Setter injection
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/* Getting file location of xml file */
        FileSystemResource fsr = new FileSystemResource("src/main/java/com/sst/applicationContext.xml");
		/* Creating bean factory */
        XmlBeanFactory xbf = new XmlBeanFactory(fsr);
		/* Getting bean of specific class */
        SetterInjection ref = (SetterInjection)xbf.getBean("showTime");
		/* Calling class method */
        ref.getCurrentTime();
        
    }
}
