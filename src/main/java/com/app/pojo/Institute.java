package com.app.pojo;
// Generated 4 Aug, 2017 10:14:23 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Institute generated by hbm2java
 */
@Entity
@Table(name = "institute", catalog = "tutesmessanger", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Institute implements java.io.Serializable {

	private Integer id;
	private String name;
	private String address;
	private String contactno;
	private String email;
	private Set<Branch> branches = new HashSet<Branch>(0);
	private Set<Teacher> teachers = new HashSet<Teacher>(0);
	private Set<Student> students = new HashSet<Student>(0);

	public Institute() {
	}

	public Institute(String name) {
		this.name = name;
	}

	public Institute(String name, String address, String contactno, String email, Set<Branch> branches,
			Set<Teacher> teachers, Set<Student> students) {
		this.name = name;
		this.address = address;
		this.contactno = contactno;
		this.email = email;
		this.branches = branches;
		this.teachers = teachers;
		this.students = students;
	}

	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", address=" + address + ", contactno=" + contactno
				+ ", email=" + email + "]";
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

	@Column(name = "name", unique = true, nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "contactno", length = 15)
	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "institute")
	public Set<Branch> getBranches() {
		return this.branches;
	}

	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "institute")
	public Set<Teacher> getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "institute")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
