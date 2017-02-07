package abcd;

public class RootObject
{
  private int id;

  public int getId() { return this.id; }

  public void setId(int id) { this.id = id; }

  private String name;

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }

  private boolean permanent;

  public boolean getPermanent() { return this.permanent; }

  public void setPermanent(boolean permanent) { this.permanent = permanent; }

  private Address address;

  public Address getAddress() { return this.address; }

  public void setAddress(Address address) { this.address = address; }

  private String phoneNumber;

  public String getPhoneNumber() { return this.phoneNumber; }

  public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

  private String role;

  public String getRole() { return this.role; }

  public void setRole(String role) { this.role = role; }
}