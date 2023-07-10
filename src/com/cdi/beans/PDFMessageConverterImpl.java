package com.cdi.beans;

public class PDFMessageConverterImpl implements IMessageConverter {

	@Override
	public String converter(String message) {
		// TODO Auto-generated method stub
		return "<pdf>"+message+"<pdf>";
	

}
}