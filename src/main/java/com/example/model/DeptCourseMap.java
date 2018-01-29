// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DeptCourseMap generated by hbm2java
 */
@Entity
@Table(name = "dept_course_map", catalog = "test")
public class DeptCourseMap implements java.io.Serializable {

	private Integer deptCourseMapId;
	private Course course;
	private Department department;
	private Date deptCourseMapStartdate;
	private Date deptCourseMapEnddate;

	public DeptCourseMap() {
	}

	public DeptCourseMap(Date deptCourseMapStartdate) {
		this.deptCourseMapStartdate = deptCourseMapStartdate;
	}

	public DeptCourseMap(Course course, Department department, Date deptCourseMapStartdate, Date deptCourseMapEnddate) {
		this.course = course;
		this.department = department;
		this.deptCourseMapStartdate = deptCourseMapStartdate;
		this.deptCourseMapEnddate = deptCourseMapEnddate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "dept_course_map_id", unique = true, nullable = false)
	public Integer getDeptCourseMapId() {
		return this.deptCourseMapId;
	}

	public void setDeptCourseMapId(Integer deptCourseMapId) {
		this.deptCourseMapId = deptCourseMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dept_course_map_startdate", nullable = false, length = 10)
	public Date getDeptCourseMapStartdate() {
		return this.deptCourseMapStartdate;
	}

	public void setDeptCourseMapStartdate(Date deptCourseMapStartdate) {
		this.deptCourseMapStartdate = deptCourseMapStartdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dept_course_map_enddate", length = 10)
	public Date getDeptCourseMapEnddate() {
		return this.deptCourseMapEnddate;
	}

	public void setDeptCourseMapEnddate(Date deptCourseMapEnddate) {
		this.deptCourseMapEnddate = deptCourseMapEnddate;
	}

}
