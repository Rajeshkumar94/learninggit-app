package com.cdi.beans;

public class MessageWriter {
    private IMessageConverter messageconverter;
    public void writeMessage(String Message) {
    	String cMessage=null;
    	cMessage = messageconverter.converter(Message);
    	System.out.println(cMessage);
    }
	
	
	
	public void setMessageconverter(IMessageConverter messageconverter) {
		this.messageconverter = messageconverter;
	}



	public void setMessageConverter(MessageWriter messagewriter) {
		// TODO Auto-generated method stub
		
	}
    
}
