package th.ac.ku.kps.eng.cpe.entity;
// Generated Feb 13, 2024, 10:55:10 AM by Hibernate Tools 4.3.6.Final

/**
 * Phonenumber generated by hbm2java
 */
public class Phonenumber implements java.io.Serializable {

	private Integer phonenumberId;
	private Customer customer;
	private String number;

	public Phonenumber() {
	}

	public Phonenumber(Customer customer, String number) {
		this.customer = customer;
		this.number = number;
	}

	public Integer getPhonenumberId() {
		return this.phonenumberId;
	}

	public void setPhonenumberId(Integer phonenumberId) {
		this.phonenumberId = phonenumberId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}