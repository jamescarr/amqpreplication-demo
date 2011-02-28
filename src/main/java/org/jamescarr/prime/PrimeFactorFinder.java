package org.jamescarr.prime;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Path("/factor")
@Produces("application/json")
public class PrimeFactorFinder {
	private static final Logger LOG = LoggerFactory.getLogger(PrimeFactorFinder.class);
	public PrimeFactorFinder(){
		LOG.info("PrimeFactorFinder initalized");
	}
	@GET
	@Path("/{number}")
	@Cacheable("primefactors")
	public Factors find(@PathParam("number") final long number) {
		LOG.info("Finding prime factors for " + number);
		long n = number; 
		List<Long> factors = new ArrayList<Long>();
		for (long i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		LOG.info("Finished computing prime factors for " + number);
		waitThreeSeconds();
		return new Factors(factors);
	}
	private void waitThreeSeconds() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
