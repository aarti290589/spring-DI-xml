package com.spring.dependency_injection.di_by_xml.client.impl;


import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;

public class SmartStoveClient implements SmartKitchenClientInterface{

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Stove is turned ON";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Stove is turned OFF";
	}

	@Override
	public String timer() {
		// TODO Auto-generated method stub
		return "Stove turned ON for 15 minutes";
	}

}
