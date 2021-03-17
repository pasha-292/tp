package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.customer.Customer;

/**
 * Unmodifiable view of an delivery list
 */
public interface ReadOnlyDeliveryList {

    /**
     * Returns an unmodifiable view of the customers list.
     * This list will not contain any duplicate customers.
     */
    ObservableList<Customer> getCustomerList();

}
