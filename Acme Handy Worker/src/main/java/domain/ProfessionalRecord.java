
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.URL;

public class ProfessionalRecord extends DomainEntity {

	private String				nameCompany;
	private Date				startDate;
	private Date				endDate;
	private String				role;
	private String				link;
	private Collection<String>	comments;


	public String getNameCompany() {
		return this.nameCompany;
	}

	public void setNameCompany(final String nameCompany) {
		this.nameCompany = nameCompany;
	}
	@Past
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}
	@Past
	//Opcional
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(final String role) {
		this.role = role;
	}
	@URL
	//Opcional
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}
	//Opcional

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

}
