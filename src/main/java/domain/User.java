package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    public String id;
    
    private String username;
    private String firstName;
    private String lastName;
    private String password; //CHANGE THIS 
    private String email;
    private String phoneNumber;
    private String profilePicture;
    private Set<String> channels;

    public User() {
    	channels = new HashSet<String>();
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        channels = new HashSet<String>();
    }
  
    public User(String firstName, String lastName, String email, String password, String username, String phoneNumber, String profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;
        channels = new HashSet<String>();
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<String> getChannels() {
		return channels;
	}
	
	public List<String> getChannelsList() {
		List<String> myList = new ArrayList<String>();
		myList.addAll(this.channels);
		return myList;
	}
	
	public void addChannel(String channelId) {
		channels.add(channelId);
	}
	public void removeChannel(String channelId) {
		channels.remove(channelId);
	}
	
	
}