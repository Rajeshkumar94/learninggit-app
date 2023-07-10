package com.cdi.beans;

public class HTMLMessageConverterImpl implements IMessageConverter {

	@Override
	public String converter(String message) {
		// TODO Auto-generated method stub
		return "<html><body>"+message+"<body><html>";
	}

	

	
	}


