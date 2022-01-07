package de.hs.wim.springioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final ICustomerRepo customerRepository;
    private final INotifier notifier;

    @Autowired
    public AppRunner(ICustomerRepo customerRepository, INotifier notifier) {
        this.customerRepository = customerRepository;
        this.notifier = notifier;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Welcome to the Spring universe");

        Collection<Customer> customers = customerRepository.getAllCustomers();
        this.printCustomers(customers);
        this.notifyCustomers(customers);
    }

    private void printCustomers(Collection<Customer> customers) {
        customers.forEach(customer -> logger.info("Customer " + customer.getLastname()));
    }

    private void notifyCustomers(Collection<Customer> customers) {
        customers.forEach(customer -> notifier.sendNotification(customer));
    }
}
