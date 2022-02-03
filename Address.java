
public class Address {
	public String street; 
	public String zip;
	public String state;
	public String city;

	// due to bi-directional association could include Gamer but not very useful at this poing

	public Address (String street, String zip, String state, String city) {
        this.street = street;
        this.zip = zip;
        this.state = state;
        this.city = city;
    }
}
