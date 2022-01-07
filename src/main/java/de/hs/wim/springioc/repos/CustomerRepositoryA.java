package de.hs.wim.springioc.repos;

import de.hs.wim.springioc.Customer;
import de.hs.wim.springioc.ICustomerRepo;

import java.util.Arrays;
import java.util.List;

public class CustomerRepositoryA implements ICustomerRepo {
	private List<Customer> customers=
			Arrays.asList(
                    new Customer("Dominik", "Lübbers", "dom@luebbers.net", "01234"),
                    new Customer("Hans", "Mustermann", "hans@mustermann.de", "13542323"),
                    new Customer("Marta", "Mulko", "marta@mulko.de", "3125543"));

	public List<Customer> getAllCustomers() {
		return customers;
	}

}
