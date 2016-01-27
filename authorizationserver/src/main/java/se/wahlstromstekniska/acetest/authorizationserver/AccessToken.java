package se.wahlstromstekniska.acetest.authorizationserver;

import java.util.Date;

public class AccessToken {

	private String accessToken = "";
	private String audience = "";
	private Date issuedAt = null;
	private Date expirationTime = null;
	
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAudience() {
		return audience;
	}
	public void setAudience(String audience) {
		this.audience = audience;
	}
	public Date getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(Date issuedAt) {
		this.issuedAt = issuedAt;
	}
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	
	@Override
	public String toString() {
		return "AccessToken [audience=" + audience + ", issuedAt=" + issuedAt + ", expirationTime="
				+ expirationTime + ", accessToken=" + accessToken + ", ]";
	}
	
	
	
}