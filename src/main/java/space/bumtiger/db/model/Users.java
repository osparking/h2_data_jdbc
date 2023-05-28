package space.bumtiger.db.model;

import org.springframework.data.annotation.Id;

public record Users(@Id Integer id, 
		String lastname, String firstname) {
	public String fullname() {
		StringBuffer buffer = new StringBuffer(lastname);
		buffer.append(" ");
		buffer.append(firstname);
		return buffer.toString();
	}
	
}
