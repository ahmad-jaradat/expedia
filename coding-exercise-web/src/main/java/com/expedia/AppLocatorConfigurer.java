package com.expedia;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.expedia.offer.search.OfferProviderGateway;
import com.expedia.offer.search.validator.OfferFilterValidator;
import com.expedia.service.AppServiceLocator;

public class AppLocatorConfigurer implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private ApplicationContext appContext;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		AppServiceLocator.addService(OfferProviderGateway.class, appContext.getBean(OfferProviderGateway.class));
		Map<String, OfferFilterValidator> beansOfType = appContext.getBeansOfType(OfferFilterValidator.class);
		beansOfType.forEach((name, instance) -> AppServiceLocator.addService(OfferFilterValidator.class, instance));
	}

}
