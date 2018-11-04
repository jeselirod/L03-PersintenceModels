
package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.NotBlank;

public class MessageBox extends DomainEntity {

	private String				name;
	private Collection<Message>	messages;


	//Getters and Setters

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

}
