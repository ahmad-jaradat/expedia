package com.expedia;

import java.util.Map;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expedia.offer.OfferDto;
import com.expedia.offer.search.OfferFilter;
import com.expedia.web.offer.filter.parameter.OfferFilterParameter;
import com.expedia.web.offer.filter.parameter.converter.OfferFilterDtoConverter;

@Controller
public class MainPageController {

	private static final String ERROR = "error";
	private static final String OFFERS = "offers";
	private static final String MAIN_PAGE = "main-page";
	private static final Logger LOGGER = LoggerFactory.getLogger(MainPageController.class);

	private final OfferFilterDtoConverter offerFilterConverter = new OfferFilterDtoConverter();

	@GetMapping
	@RequestMapping(path = "/")
	public Callable<String> filterRequest(Map<String, Object> model,
			@ModelAttribute OfferFilterParameter filterParameter) {
		return new Callable<String>() {
			@Override
			public String call() throws Exception {
				LOGGER.debug("Start searching for offers with filter {}", filterParameter);
				try {
					model.put(OFFERS, getOffers(filterParameter));
				} catch (RuntimeException ex) {
					model.put(ERROR, ex.toString());
				}
				return MAIN_PAGE;
			}
		};
	}

	private Iterable<OfferDto> getOffers(OfferFilterParameter filterParameter) {
		return new OfferFilter(offerFilterConverter.convert(filterParameter)).getOffers();
	}
}
