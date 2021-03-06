// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProgramAccessMode generated by hbm2java
 */
@Entity
@Table(name = "program_access_mode", catalog = "test")
public class ProgramAccessMode implements java.io.Serializable {

	private Integer programAccessModeId;
	private EducationalProgram educationalProgram;
	private Previledge previledge;
	private User userByGrantorId;
	private User userByAccessorId;
	private Date programAccessModeGrantedDate;
	private Date programAccessModeValidStartdate;
	private Date programAccessModeValidEnddate;
	private Date programAccessModeValidStarttime;
	private Date programAccessModeValidEndtime;
	private boolean programAccessModeIsDisabled;
	private String programAccessModeDesc;
	private Set<ProgramComment> programComments = new HashSet<ProgramComment>(0);

	public ProgramAccessMode() {
	}

	public ProgramAccessMode(Date programAccessModeGrantedDate, Date programAccessModeValidStartdate,
			boolean programAccessModeIsDisabled) {
		this.programAccessModeGrantedDate = programAccessModeGrantedDate;
		this.programAccessModeValidStartdate = programAccessModeValidStartdate;
		this.programAccessModeIsDisabled = programAccessModeIsDisabled;
	}

	public ProgramAccessMode(EducationalProgram educationalProgram, Previledge previledge, User userByGrantorId,
			User userByAccessorId, Date programAccessModeGrantedDate, Date programAccessModeValidStartdate,
			Date programAccessModeValidEnddate, Date programAccessModeValidStarttime,
			Date programAccessModeValidEndtime, boolean programAccessModeIsDisabled, String programAccessModeDesc,
			Set<ProgramComment> programComments) {
		this.educationalProgram = educationalProgram;
		this.previledge = previledge;
		this.userByGrantorId = userByGrantorId;
		this.userByAccessorId = userByAccessorId;
		this.programAccessModeGrantedDate = programAccessModeGrantedDate;
		this.programAccessModeValidStartdate = programAccessModeValidStartdate;
		this.programAccessModeValidEnddate = programAccessModeValidEnddate;
		this.programAccessModeValidStarttime = programAccessModeValidStarttime;
		this.programAccessModeValidEndtime = programAccessModeValidEndtime;
		this.programAccessModeIsDisabled = programAccessModeIsDisabled;
		this.programAccessModeDesc = programAccessModeDesc;
		this.programComments = programComments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "program_access_mode_id", unique = true, nullable = false)
	public Integer getProgramAccessModeId() {
		return this.programAccessModeId;
	}

	public void setProgramAccessModeId(Integer programAccessModeId) {
		this.programAccessModeId = programAccessModeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edu_program_id")
	public EducationalProgram getEducationalProgram() {
		return this.educationalProgram;
	}

	public void setEducationalProgram(EducationalProgram educationalProgram) {
		this.educationalProgram = educationalProgram;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "previledge_id")
	public Previledge getPreviledge() {
		return this.previledge;
	}

	public void setPreviledge(Previledge previledge) {
		this.previledge = previledge;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grantor_id")
	public User getUserByGrantorId() {
		return this.userByGrantorId;
	}

	public void setUserByGrantorId(User userByGrantorId) {
		this.userByGrantorId = userByGrantorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accessor_id")
	public User getUserByAccessorId() {
		return this.userByAccessorId;
	}

	public void setUserByAccessorId(User userByAccessorId) {
		this.userByAccessorId = userByAccessorId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "program_access_mode_granted_date", nullable = false, length = 10)
	public Date getProgramAccessModeGrantedDate() {
		return this.programAccessModeGrantedDate;
	}

	public void setProgramAccessModeGrantedDate(Date programAccessModeGrantedDate) {
		this.programAccessModeGrantedDate = programAccessModeGrantedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "program_access_mode_valid_startdate", nullable = false, length = 10)
	public Date getProgramAccessModeValidStartdate() {
		return this.programAccessModeValidStartdate;
	}

	public void setProgramAccessModeValidStartdate(Date programAccessModeValidStartdate) {
		this.programAccessModeValidStartdate = programAccessModeValidStartdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "program_access_mode_valid_enddate", length = 10)
	public Date getProgramAccessModeValidEnddate() {
		return this.programAccessModeValidEnddate;
	}

	public void setProgramAccessModeValidEnddate(Date programAccessModeValidEnddate) {
		this.programAccessModeValidEnddate = programAccessModeValidEnddate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "program_access_mode_valid_starttime", length = 8)
	public Date getProgramAccessModeValidStarttime() {
		return this.programAccessModeValidStarttime;
	}

	public void setProgramAccessModeValidStarttime(Date programAccessModeValidStarttime) {
		this.programAccessModeValidStarttime = programAccessModeValidStarttime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "program_access_mode_valid_endtime", length = 8)
	public Date getProgramAccessModeValidEndtime() {
		return this.programAccessModeValidEndtime;
	}

	public void setProgramAccessModeValidEndtime(Date programAccessModeValidEndtime) {
		this.programAccessModeValidEndtime = programAccessModeValidEndtime;
	}

	@Column(name = "program_access_mode_is_disabled", nullable = false)
	public boolean isProgramAccessModeIsDisabled() {
		return this.programAccessModeIsDisabled;
	}

	public void setProgramAccessModeIsDisabled(boolean programAccessModeIsDisabled) {
		this.programAccessModeIsDisabled = programAccessModeIsDisabled;
	}

	@Column(name = "program_access_mode_desc", length = 65535)
	public String getProgramAccessModeDesc() {
		return this.programAccessModeDesc;
	}

	public void setProgramAccessModeDesc(String programAccessModeDesc) {
		this.programAccessModeDesc = programAccessModeDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programAccessMode")
	public Set<ProgramComment> getProgramComments() {
		return this.programComments;
	}

	public void setProgramComments(Set<ProgramComment> programComments) {
		this.programComments = programComments;
	}

}
