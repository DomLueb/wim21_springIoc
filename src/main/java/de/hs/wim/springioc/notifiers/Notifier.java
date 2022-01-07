package de.hs.wim.springioc.notifiers;

import de.hs.wim.springioc.Customer;
import de.hs.wim.springioc.INotifier;
import org.springframework.stereotype.Component;

@Component
public class Notifier implements INotifier {
	public void sendNotification(Customer customer) {
		System.out.println("Werbung für "+customer.getLastname());
	}

}
