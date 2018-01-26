package com.example.model;
// Generated Jan 26, 2018 7:48:52 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "test")
public class Course implements java.io.Serializable {

	private Integer courseId;
	private String courseCode;
	private String courseNameVn;
	private String courseNameEn;
	private String courseNameShort;
	private byte courseCredits;
	private String courseLinktoSyllabus;
	private String courseVersionCode;
	private Date corseIntroducedDate;
	private Date courseAppliedYear;
	private Byte courseAppliedSemester;
	private boolean courseIsused;
	private Set<CourseOutcomeVersion> courseOutcomeVersions = new HashSet<CourseOutcomeVersion>(0);
	private Set<CourseContent> courseContents = new HashSet<CourseContent>(0);
	private Set<UserCourseDevmap> userCourseDevmaps = new HashSet<UserCourseDevmap>(0);
	private Set<CourseTopicMap> courseTopicMaps = new HashSet<CourseTopicMap>(0);
	private Set<ProgramCourseMapping> programCourseMappings = new HashSet<ProgramCourseMapping>(0);
	private Set<CourseRelationship> courseRelationshipsForChildCourseId = new HashSet<CourseRelationship>(0);
	private Set<CourseAssignment> courseAssignments = new HashSet<CourseAssignment>(0);
	private Set<CourseAccessMode> courseAccessModes = new HashSet<CourseAccessMode>(0);
	private Set<Test> tests = new HashSet<Test>(0);
	private Set<CourseRelationship> courseRelationshipsForParentCourseId = new HashSet<CourseRelationship>(0);
	private Set<DeptCourseMap> deptCourseMaps = new HashSet<DeptCourseMap>(0);

	public Course() {
	}

	public Course(String courseCode, String courseNameVn, String courseNameEn, byte courseCredits,
			String courseVersionCode, boolean courseIsused) {
		this.courseCode = courseCode;
		this.courseNameVn = courseNameVn;
		this.courseNameEn = courseNameEn;
		this.courseCredits = courseCredits;
		this.courseVersionCode = courseVersionCode;
		this.courseIsused = courseIsused;
	}

	public Course(String courseCode, String courseNameVn, String courseNameEn, String courseNameShort,
			byte courseCredits, String courseLinktoSyllabus, String courseVersionCode, Date corseIntroducedDate,
			Date courseAppliedYear, Byte courseAppliedSemester, boolean courseIsused,
			Set<CourseOutcomeVersion> courseOutcomeVersions, Set<CourseContent> courseContents,
			Set<UserCourseDevmap> userCourseDevmaps, Set<CourseTopicMap> courseTopicMaps,
			Set<ProgramCourseMapping> programCourseMappings,
			Set<CourseRelationship> courseRelationshipsForChildCourseId, Set<CourseAssignment> courseAssignments,
			Set<CourseAccessMode> courseAccessModes, Set<Test> tests,
			Set<CourseRelationship> courseRelationshipsForParentCourseId, Set<DeptCourseMap> deptCourseMaps) {
		this.courseCode = courseCode;
		this.courseNameVn = courseNameVn;
		this.courseNameEn = courseNameEn;
		this.courseNameShort = courseNameShort;
		this.courseCredits = courseCredits;
		this.courseLinktoSyllabus = courseLinktoSyllabus;
		this.courseVersionCode = courseVersionCode;
		this.corseIntroducedDate = corseIntroducedDate;
		this.courseAppliedYear = courseAppliedYear;
		this.courseAppliedSemester = courseAppliedSemester;
		this.courseIsused = courseIsused;
		this.courseOutcomeVersions = courseOutcomeVersions;
		this.courseContents = courseContents;
		this.userCourseDevmaps = userCourseDevmaps;
		this.courseTopicMaps = courseTopicMaps;
		this.programCourseMappings = programCourseMappings;
		this.courseRelationshipsForChildCourseId = courseRelationshipsForChildCourseId;
		this.courseAssignments = courseAssignments;
		this.courseAccessModes = courseAccessModes;
		this.tests = tests;
		this.courseRelationshipsForParentCourseId = courseRelationshipsForParentCourseId;
		this.deptCourseMaps = deptCourseMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_id", unique = true, nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "course_code", nullable = false, length = 20)
	public String getCourseCode() {
		return this.courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Column(name = "course_name_vn", nullable = false, length = 65535)
	public String getCourseNameVn() {
		return this.courseNameVn;
	}

	public void setCourseNameVn(String courseNameVn) {
		this.courseNameVn = courseNameVn;
	}

	@Column(name = "course_name_en", nullable = false, length = 65535)
	public String getCourseNameEn() {
		return this.courseNameEn;
	}

	public void setCourseNameEn(String courseNameEn) {
		this.courseNameEn = courseNameEn;
	}

	@Column(name = "course_name_short", length = 20)
	public String getCourseNameShort() {
		return this.courseNameShort;
	}

	public void setCourseNameShort(String courseNameShort) {
		this.courseNameShort = courseNameShort;
	}

	@Column(name = "course_credits", nullable = false)
	public byte getCourseCredits() {
		return this.courseCredits;
	}

	public void setCourseCredits(byte courseCredits) {
		this.courseCredits = courseCredits;
	}

	@Column(name = "course_linkto_syllabus", length = 65535)
	public String getCourseLinktoSyllabus() {
		return this.courseLinktoSyllabus;
	}

	public void setCourseLinktoSyllabus(String courseLinktoSyllabus) {
		this.courseLinktoSyllabus = courseLinktoSyllabus;
	}

	@Column(name = "course_version_code", nullable = false, length = 20)
	public String getCourseVersionCode() {
		return this.courseVersionCode;
	}

	public void setCourseVersionCode(String courseVersionCode) {
		this.courseVersionCode = courseVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "corse_introduced_date", length = 10)
	public Date getCorseIntroducedDate() {
		return this.corseIntroducedDate;
	}

	public void setCorseIntroducedDate(Date corseIntroducedDate) {
		this.corseIntroducedDate = corseIntroducedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "course_applied_year", length = 10)
	public Date getCourseAppliedYear() {
		return this.courseAppliedYear;
	}

	public void setCourseAppliedYear(Date courseAppliedYear) {
		this.courseAppliedYear = courseAppliedYear;
	}

	@Column(name = "course_applied_semester")
	public Byte getCourseAppliedSemester() {
		return this.courseAppliedSemester;
	}

	public void setCourseAppliedSemester(Byte courseAppliedSemester) {
		this.courseAppliedSemester = courseAppliedSemester;
	}

	@Column(name = "course_isused", nullable = false)
	public boolean isCourseIsused() {
		return this.courseIsused;
	}

	public void setCourseIsused(boolean courseIsused) {
		this.courseIsused = courseIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<CourseOutcomeVersion> getCourseOutcomeVersions() {
		return this.courseOutcomeVersions;
	}

	public void setCourseOutcomeVersions(Set<CourseOutcomeVersion> courseOutcomeVersions) {
		this.courseOutcomeVersions = courseOutcomeVersions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<CourseContent> getCourseContents() {
		return this.courseContents;
	}

	public void setCourseContents(Set<CourseContent> courseContents) {
		this.courseContents = courseContents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<UserCourseDevmap> getUserCourseDevmaps() {
		return this.userCourseDevmaps;
	}

	public void setUserCourseDevmaps(Set<UserCourseDevmap> userCourseDevmaps) {
		this.userCourseDevmaps = userCourseDevmaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<CourseTopicMap> getCourseTopicMaps() {
		return this.courseTopicMaps;
	}

	public void setCourseTopicMaps(Set<CourseTopicMap> courseTopicMaps) {
		this.courseTopicMaps = courseTopicMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<ProgramCourseMapping> getProgramCourseMappings() {
		return this.programCourseMappings;
	}

	public void setProgramCourseMappings(Set<ProgramCourseMapping> programCourseMappings) {
		this.programCourseMappings = programCourseMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseByChildCourseId")
	public Set<CourseRelationship> getCourseRelationshipsForChildCourseId() {
		return this.courseRelationshipsForChildCourseId;
	}

	public void setCourseRelationshipsForChildCourseId(Set<CourseRelationship> courseRelationshipsForChildCourseId) {
		this.courseRelationshipsForChildCourseId = courseRelationshipsForChildCourseId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<CourseAssignment> getCourseAssignments() {
		return this.courseAssignments;
	}

	public void setCourseAssignments(Set<CourseAssignment> courseAssignments) {
		this.courseAssignments = courseAssignments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<CourseAccessMode> getCourseAccessModes() {
		return this.courseAccessModes;
	}

	public void setCourseAccessModes(Set<CourseAccessMode> courseAccessModes) {
		this.courseAccessModes = courseAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<Test> getTests() {
		return this.tests;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseByParentCourseId")
	public Set<CourseRelationship> getCourseRelationshipsForParentCourseId() {
		return this.courseRelationshipsForParentCourseId;
	}

	public void setCourseRelationshipsForParentCourseId(Set<CourseRelationship> courseRelationshipsForParentCourseId) {
		this.courseRelationshipsForParentCourseId = courseRelationshipsForParentCourseId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<DeptCourseMap> getDeptCourseMaps() {
		return this.deptCourseMaps;
	}

	public void setDeptCourseMaps(Set<DeptCourseMap> deptCourseMaps) {
		this.deptCourseMaps = deptCourseMaps;
	}

}
