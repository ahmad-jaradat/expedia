package com.expedia.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AppServiceLocator {

	private static final Map<Class<?>, List<Object>> services = new HashMap<>();

	public static void reset() {
		services.clear();
	}

	public static <T extends V, V> void addService(Class<V> clazz, T instance) {
		List<Object> servicesList = services.get(clazz);
		if (Objects.isNull(servicesList))
			servicesList = new ArrayList<>();
		servicesList.add(instance);
		services.put(clazz, servicesList);
	}

	@SuppressWarnings("unchecked")
	public static <T> Iterator<T> getServices(Class<T> clazz) {
		final List<T> servicesInstance = new ArrayList<>();
		List<Object> list = services.get(clazz);
		if (Objects.nonNull(list))
			list.forEach(instance -> servicesInstance.add((T) instance));
		return Collections.unmodifiableList(servicesInstance).iterator();
	}

	public static <T> T getSingleService(Class<T> clazz) {
		Iterator<T> services = getServices(clazz);
		;
		T singleService = services.next();
		if (services.hasNext())
			throw new NoUniqueServiceException(
					String.format("There is more than one service with type %s", clazz.getCanonicalName()));
		return singleService;
	}
}
