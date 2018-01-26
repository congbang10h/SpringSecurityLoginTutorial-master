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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PeoComment generated by hbm2java
 */
@Entity
@Table(name = "peo_comment", catalog = "test")
public class PeoComment implements java.io.Serializable {

	private Integer peoCommentId;
	private Peo peo;
	private ProgramComment programComment;
	private ProgramDecision programDecision;
	private Date peoCommentDate;
	private Date peoCommentTime;
	private String peoCommentDesc;
	private Set<PeoCommentRelationship> peoCommentRelationshipsForChildPeoCommentId = new HashSet<PeoCommentRelationship>(
			0);
	private Set<PeoCommentRelationship> peoCommentRelationshipsForParentPeoCommentId = new HashSet<PeoCommentRelationship>(
			0);

	public PeoComment() {
	}

	public PeoComment(Date peoCommentDate, String peoCommentDesc) {
		this.peoCommentDate = peoCommentDate;
		this.peoCommentDesc = peoCommentDesc;
	}

	public PeoComment(Peo peo, ProgramComment programComment, ProgramDecision programDecision, Date peoCommentDate,
			Date peoCommentTime, String peoCommentDesc,
			Set<PeoCommentRelationship> peoCommentRelationshipsForChildPeoCommentId,
			Set<PeoCommentRelationship> peoCommentRelationshipsForParentPeoCommentId) {
		this.peo = peo;
		this.programComment = programComment;
		this.programDecision = programDecision;
		this.peoCommentDate = peoCommentDate;
		this.peoCommentTime = peoCommentTime;
		this.peoCommentDesc = peoCommentDesc;
		this.peoCommentRelationshipsForChildPeoCommentId = peoCommentRelationshipsForChildPeoCommentId;
		this.peoCommentRelationshipsForParentPeoCommentId = peoCommentRelationshipsForParentPeoCommentId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "peo_comment_id", unique = true, nullable = false)
	public Integer getPeoCommentId() {
		return this.peoCommentId;
	}

	public void setPeoCommentId(Integer peoCommentId) {
		this.peoCommentId = peoCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "peo_id")
	public Peo getPeo() {
		return this.peo;
	}

	public void setPeo(Peo peo) {
		this.peo = peo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_comment_id")
	public ProgramComment getProgramComment() {
		return this.programComment;
	}

	public void setProgramComment(ProgramComment programComment) {
		this.programComment = programComment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_decision_id")
	public ProgramDecision getProgramDecision() {
		return this.programDecision;
	}

	public void setProgramDecision(ProgramDecision programDecision) {
		this.programDecision = programDecision;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "peo_comment_date", nullable = false, length = 10)
	public Date getPeoCommentDate() {
		return this.peoCommentDate;
	}

	public void setPeoCommentDate(Date peoCommentDate) {
		this.peoCommentDate = peoCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "peo_comment_time", length = 8)
	public Date getPeoCommentTime() {
		return this.peoCommentTime;
	}

	public void setPeoCommentTime(Date peoCommentTime) {
		this.peoCommentTime = peoCommentTime;
	}

	@Column(name = "peo_comment_desc", nullable = false, length = 65535)
	public String getPeoCommentDesc() {
		return this.peoCommentDesc;
	}

	public void setPeoCommentDesc(String peoCommentDesc) {
		this.peoCommentDesc = peoCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peoCommentByChildPeoCommentId")
	public Set<PeoCommentRelationship> getPeoCommentRelationshipsForChildPeoCommentId() {
		return this.peoCommentRelationshipsForChildPeoCommentId;
	}

	public void setPeoCommentRelationshipsForChildPeoCommentId(
			Set<PeoCommentRelationship> peoCommentRelationshipsForChildPeoCommentId) {
		this.peoCommentRelationshipsForChildPeoCommentId = peoCommentRelationshipsForChildPeoCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peoCommentByParentPeoCommentId")
	public Set<PeoCommentRelationship> getPeoCommentRelationshipsForParentPeoCommentId() {
		return this.peoCommentRelationshipsForParentPeoCommentId;
	}

	public void setPeoCommentRelationshipsForParentPeoCommentId(
			Set<PeoCommentRelationship> peoCommentRelationshipsForParentPeoCommentId) {
		this.peoCommentRelationshipsForParentPeoCommentId = peoCommentRelationshipsForParentPeoCommentId;
	}

}
