package com.app.pojo;
// Generated 19 Jul, 2017 9:56:38 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", catalog = "tutesmessanger", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class Login implements java.io.Serializable {

	private Integer id;
	private Role role;
	private String username;
	private String password;
	private Set<Teacher> teachers = new HashSet<Teacher>(0);
	private Set<Student> students = new HashSet<Student>(0);

	public Login() {
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Login(Role role, String username, String password) {
		super();
		this.role = role;
		this.username = username;
		this.password = password;
	}

	public Login(Role role, String username, String password, Set<Teacher> teachers, Set<Student> students) {
		this.role = role;
		this.username = username;
		this.password = password;
		this.teachers = teachers;
		this.students = students;
	}

	
	

	@Override
	public String toString() {
		return "Login [id=" + id + ", role=" + role + ", username=" + username + ", password=" + password + "]";
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "username", unique = true, nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Teacher> getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
