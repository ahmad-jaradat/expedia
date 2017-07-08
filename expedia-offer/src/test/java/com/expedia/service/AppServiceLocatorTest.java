package com.expedia.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.expedia.service.AppServiceLocator;

public class AppServiceLocatorTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@After
	public void tearDown(){
		AppServiceLocator.reset();
	}
	
	@Test
	public void givenEmptyServiceLocatorWhenCallGetServiceForAnyTypeWillReturnEmptyIterator() {
		assertFalse(AppServiceLocator.getServices(AbstractService.class).hasNext());
		assertFalse(AppServiceLocator.getServices(ServiceA.class).hasNext());
		assertFalse(AppServiceLocator.getServices(ServiceB.class).hasNext());
	}

	@Test
	public void givenServiceLocatorWithInstanceOfServiceBWhenCallGetWillReturnEmptyIteratorForAllTypeExceptForServiceB() {
		AppServiceLocator.addService(ServiceB.class, new ServiceB());
		
		assertFalse(AppServiceLocator.getServices(AbstractService.class).hasNext());
		assertFalse(AppServiceLocator.getServices(ServiceA.class).hasNext());
		assertTrue(AppServiceLocator.getServices(ServiceB.class).hasNext());
	}
	
	@Test
	public void givenServiceLocatorWithInstanceOfServiceAWhenCallGetForAbstractServiceWillReturnEmptyIteratorForAllTypeExceptAbstractService() {
		AppServiceLocator.addService(AbstractService.class, new ServiceA());
		
		assertFalse(AppServiceLocator.getServices(ServiceA.class).hasNext());
		assertFalse(AppServiceLocator.getServices(ServiceB.class).hasNext());
		assertTrue(AppServiceLocator.getServices(AbstractService.class).hasNext());
	}


	@Test
	public void givenServiceLocatorWithTwoInstanceOfServiceAWhenCallGetSingleForServiceAThenWillThrowNoUniqueServiceException() {
		AppServiceLocator.addService(ServiceA.class, new ServiceA());
		AppServiceLocator.addService(ServiceA.class, new ServiceA());
		
		expectedException.expect(NoUniqueServiceException.class);
		AppServiceLocator.getSingleService(ServiceA.class);
	}
	private static interface AbstractService {

	}

	private static class ServiceA implements AbstractService {

	}

	private static class ServiceB {

	}

}
