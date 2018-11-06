
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Sponsorship extends DomainEntity {

	private String		urlBanner;
	private String		linkTargetPage;
	private CreditCard	CreditCard;


	@NotNull
	@OneToOne(optional = false)
	public CreditCard getCreditCard() {
		return this.CreditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.CreditCard = creditCard;
	}
	//Getters
	@NotBlank
	@URL
	public String getUrlBanner() {
		return this.urlBanner;
	}
	@NotBlank
	@URL
	public String getLinkTargetPage() {
		return this.linkTargetPage;
	}

	//Setters
	public void setUrlBanner(final String url) {
		this.urlBanner = url;
	}
	public void setLinkTargetPage(final String link) {
		this.linkTargetPage = link;
	}

}
