package com.cdi.test;

import com.cdi.beans.IMessageConverter;
import com.cdi.beans.MessageWriter;

class CoreDITest {

	public static  void main(String[] args) {
		
		BeanFactory beanfactory = new XmlBeanFactory (new ClassPathResource("com/cdi/common/application-context.xml"));
		MessageWriter messagewriter=beanfactory.getbean("messagewriter",MessageWriter.class);
		messagewriter.setMessageconverter(imessageconverter);
		messagewriter.writeMessage("welcome sprinh");

	}

}
