package org.service_example;

public abstract class CustomerBusinessService {

    private int idNumber;
    private Customer customer;

    public CustomerBusinessService(int idNumber, Customer customer) {
        this.idNumber = idNumber;
        this.customer = customer;
    }
    
    public abstract Customer getCustomerFromId(int idNumber);
    //{
        //Not implemented,  showing what it may look like
        //CustomerDTO dto = customerClient.getCustomer(idNumber);
        //return convertDTOToCustomer(dto);
    //}

    public CustomerDTO convertCustomerToDTO(Customer customer){
        CustomerDTO dto  = new CustomerDTO(customer.getIdNumber(), customer.getFirstName(), customer.getLastName(), customer.getRewardsNumber(), 0);

        return dto;
    }

    public Customer convertDTOToCustomer(CustomerDTO dto){
        customer.setIdNumber(dto.getIdNumber());
        customer.setFirstName(dto.getFirstName());
        customer.setLastName(dto.getLastName());
        return customer;

        //Could also create a new Customer(),  depends on the design and requirements.


    }
}







