package com.spring.dependency_injection.di_by_xml.service.impl;

import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;
import com.spring.dependency_injection.di_by_xml.service.SmartKitchenServiceInterface;

public class SmartOvenService implements SmartKitchenServiceInterface {
	
	private SmartKitchenClientInterface smartKitchenClientInterface;

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return smartKitchenClientInterface.turnOn();
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return smartKitchenClientInterface.turnOff();
	}

	@Override
	public String timer() {
		// TODO Auto-generated method stub
		return smartKitchenClientInterface.timer();
	}

}
