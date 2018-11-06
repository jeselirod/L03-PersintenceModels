
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class ProfileSocialNetwork extends DomainEntity {

	private String	nickName;
	private String	nameSocialNetwork;
	private String	linkProfile;


	//Getters and Setters

	@NotBlank
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(final String nickName) {
		this.nickName = nickName;
	}

	@NotBlank
	public String getNameSocialNetwork() {
		return this.nameSocialNetwork;
	}

	public void setNameSocialNetwork(final String nameSocialNetwork) {
		this.nameSocialNetwork = nameSocialNetwork;
	}

	@NotBlank
	@URL
	public String getLinkProfile() {
		return this.linkProfile;
	}

	public void setLinkProfile(final String linkProfile) {
		this.linkProfile = linkProfile;
	}

}
