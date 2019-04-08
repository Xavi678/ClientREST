package almata.daw.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {
	
	private String token;
	private Date data;
	
	public Token() {
		
	}
	public Token(String token, Date data) {
		super();
		this.token = token;
		this.data = data;
	}
	
	@JsonProperty("token")
	public String getId() {
		return token;
	}
	public void setId(String id) {
		this.token = id;
	}
	
	@JsonProperty("data")
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
