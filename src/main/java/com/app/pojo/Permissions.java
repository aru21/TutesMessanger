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

/**
 * Permissions generated by hbm2java
 */
@Entity
@Table(name = "permissions", catalog = "tutesmessanger")
public class Permissions implements java.io.Serializable {

	private Integer id;
	private boolean authoriseStudent;
	private boolean authoriseTeacher;
	private boolean fillAttendance;
	private boolean fillSchedule;
	private boolean mailParent;
	private boolean mailStudent;
	private boolean mailTeacher;
	private boolean msgParent;
	private boolean msgStudent;
	private boolean msgTeacher;
	private boolean setExam;
	private boolean updateResults;
	private boolean alterInstituteStructure;
	private Set<Teacher> teachers = new HashSet<Teacher>(0);

	public Permissions() {
	}

	public Permissions(boolean authoriseStudent, boolean authoriseTeacher, boolean fillAttendance, boolean fillSchedule,
			boolean mailParent, boolean mailStudent, boolean mailTeacher, boolean msgParent, boolean msgStudent,
			boolean msgTeacher, boolean setExam, boolean updateResults, boolean alterInstituteStructure) {
		this.authoriseStudent = authoriseStudent;
		this.authoriseTeacher = authoriseTeacher;
		this.fillAttendance = fillAttendance;
		this.fillSchedule = fillSchedule;
		this.mailParent = mailParent;
		this.mailStudent = mailStudent;
		this.mailTeacher = mailTeacher;
		this.msgParent = msgParent;
		this.msgStudent = msgStudent;
		this.msgTeacher = msgTeacher;
		this.setExam = setExam;
		this.updateResults = updateResults;
		this.alterInstituteStructure = alterInstituteStructure;
	}

	public Permissions(boolean authoriseStudent, boolean authoriseTeacher, boolean fillAttendance, boolean fillSchedule,
			boolean mailParent, boolean mailStudent, boolean mailTeacher, boolean msgParent, boolean msgStudent,
			boolean msgTeacher, boolean setExam, boolean updateResults, boolean alterInstituteStructure,
			Set<Teacher> teachers) {
		this.authoriseStudent = authoriseStudent;
		this.authoriseTeacher = authoriseTeacher;
		this.fillAttendance = fillAttendance;
		this.fillSchedule = fillSchedule;
		this.mailParent = mailParent;
		this.mailStudent = mailStudent;
		this.mailTeacher = mailTeacher;
		this.msgParent = msgParent;
		this.msgStudent = msgStudent;
		this.msgTeacher = msgTeacher;
		this.setExam = setExam;
		this.updateResults = updateResults;
		this.alterInstituteStructure = alterInstituteStructure;
		this.teachers = teachers;
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

	@Column(name = "authorise_student", nullable = false)
	public boolean isAuthoriseStudent() {
		return this.authoriseStudent;
	}

	public void setAuthoriseStudent(boolean authoriseStudent) {
		this.authoriseStudent = authoriseStudent;
	}

	@Column(name = "authorise_teacher", nullable = false)
	public boolean isAuthoriseTeacher() {
		return this.authoriseTeacher;
	}

	public void setAuthoriseTeacher(boolean authoriseTeacher) {
		this.authoriseTeacher = authoriseTeacher;
	}

	@Column(name = "fill_attendance", nullable = false)
	public boolean isFillAttendance() {
		return this.fillAttendance;
	}

	public void setFillAttendance(boolean fillAttendance) {
		this.fillAttendance = fillAttendance;
	}

	@Column(name = "fill_schedule", nullable = false)
	public boolean isFillSchedule() {
		return this.fillSchedule;
	}

	public void setFillSchedule(boolean fillSchedule) {
		this.fillSchedule = fillSchedule;
	}

	@Column(name = "mail_parent", nullable = false)
	public boolean isMailParent() {
		return this.mailParent;
	}

	public void setMailParent(boolean mailParent) {
		this.mailParent = mailParent;
	}

	@Column(name = "mail_student", nullable = false)
	public boolean isMailStudent() {
		return this.mailStudent;
	}

	public void setMailStudent(boolean mailStudent) {
		this.mailStudent = mailStudent;
	}

	@Column(name = "mail_teacher", nullable = false)
	public boolean isMailTeacher() {
		return this.mailTeacher;
	}

	public void setMailTeacher(boolean mailTeacher) {
		this.mailTeacher = mailTeacher;
	}

	@Column(name = "msg_parent", nullable = false)
	public boolean isMsgParent() {
		return this.msgParent;
	}

	public void setMsgParent(boolean msgParent) {
		this.msgParent = msgParent;
	}

	@Column(name = "msg_student", nullable = false)
	public boolean isMsgStudent() {
		return this.msgStudent;
	}

	public void setMsgStudent(boolean msgStudent) {
		this.msgStudent = msgStudent;
	}

	@Column(name = "msg_teacher", nullable = false)
	public boolean isMsgTeacher() {
		return this.msgTeacher;
	}

	public void setMsgTeacher(boolean msgTeacher) {
		this.msgTeacher = msgTeacher;
	}

	@Column(name = "set_exam", nullable = false)
	public boolean isSetExam() {
		return this.setExam;
	}

	public void setSetExam(boolean setExam) {
		this.setExam = setExam;
	}

	@Column(name = "update_results", nullable = false)
	public boolean isUpdateResults() {
		return this.updateResults;
	}

	public void setUpdateResults(boolean updateResults) {
		this.updateResults = updateResults;
	}

	@Column(name = "alter_institute_structure", nullable = false)
	public boolean isAlterInstituteStructure() {
		return this.alterInstituteStructure;
	}

	public void setAlterInstituteStructure(boolean alterInstituteStructure) {
		this.alterInstituteStructure = alterInstituteStructure;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permissions")
	public Set<Teacher> getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

}
