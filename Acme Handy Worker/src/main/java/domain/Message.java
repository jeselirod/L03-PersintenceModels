
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Range;

public class Message extends DomainEntity {

	private Date					moment;
	private String					subject;
	private String					body;
	private Integer					priority;
	private String					tag;

	private Actor					sender;
	private Actor					receiver;

	private Collection<MessageBox>	messageBox;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	@Range(min = 0, max = 2)
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}

	//OPTIONAL
	public String getTag() {
		return this.tag;
	}

	public void setTag(final String tag) {
		this.tag = tag;
	}

	public Actor getSender() {
		return this.sender;
	}

	public void setSender(final Actor sender) {
		this.sender = sender;
	}

	public Actor getReceiver() {
		return this.receiver;
	}

	public void setReceiver(final Actor receiver) {
		this.receiver = receiver;
	}

	public Collection<MessageBox> getMessageBox() {
		return this.messageBox;
	}

	public void setMessageBox(final Collection<MessageBox> messageBox) {
		this.messageBox = messageBox;
	}

}
