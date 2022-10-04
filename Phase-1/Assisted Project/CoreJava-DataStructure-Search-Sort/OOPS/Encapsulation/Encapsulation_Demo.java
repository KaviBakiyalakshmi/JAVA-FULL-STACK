package Encapsulation;

public class Encapsulation_Demo 
{
     private int id;
     private String name;
     private String email;
     private String password;
     private String mobile;
     private String designation;
     
     public int getID()
     {
    	 return id;
     }
     public int setId(int id)
     {
    	 return this.id=id;
     }
     public String getName()
     {
    	 return name;
     }
     public String setName(String name)
     {
    	 return this.name=name;
     }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile(int i) {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
     

}
