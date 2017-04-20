package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
@NamedQueries({
	@NamedQuery(name = "user.findByUsername", query = "SELECT u FROM User u WHERE u.username = :uname"),
	@NamedQuery(name = "user.findAll", query = "SELECT u FROM User u")
})
public class User {
	
	//the primary key
		@Id
		@Column(name = "USERID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name="username", nullable=false, length=50, unique=true)
		private String username;
		
		@Column(name = "pw", length = 30, nullable = false)
		private String password;
		
		@Column(name="firstname")
		private String firstname;
		
		@Column(name="lastname")
		private String lastname;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(String username, String password, String firstname, String lastname) {
			super();
			this.username = username;
			this.password = password;
			this.firstname = firstname;
			this.lastname = lastname;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
					+ ", lastname=" + lastname + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((username == null) ? 0 : username.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
		}
		
		
	
	
}
