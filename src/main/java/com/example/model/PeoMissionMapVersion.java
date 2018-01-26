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
 * PeoMissionMapVersion generated by hbm2java
 */
@Entity
@Table(name = "peo_mission_map_version", catalog = "test")
public class PeoMissionMapVersion implements java.io.Serializable {

	private Integer peoMissionMapVersionId;
	private PeoVersion peoVersion;
	private UnivMissionVersion univMissionVersion;
	private int peoMissionMapVersionCode;
	private Date peoMissionMapVersionDate;
	private boolean peoMissionMapVersionIsused;
	private Set<MissionPeoMap> missionPeoMaps = new HashSet<MissionPeoMap>(0);

	public PeoMissionMapVersion() {
	}

	public PeoMissionMapVersion(int peoMissionMapVersionCode, Date peoMissionMapVersionDate,
			boolean peoMissionMapVersionIsused) {
		this.peoMissionMapVersionCode = peoMissionMapVersionCode;
		this.peoMissionMapVersionDate = peoMissionMapVersionDate;
		this.peoMissionMapVersionIsused = peoMissionMapVersionIsused;
	}

	public PeoMissionMapVersion(PeoVersion peoVersion, UnivMissionVersion univMissionVersion,
			int peoMissionMapVersionCode, Date peoMissionMapVersionDate, boolean peoMissionMapVersionIsused,
			Set<MissionPeoMap> missionPeoMaps) {
		this.peoVersion = peoVersion;
		this.univMissionVersion = univMissionVersion;
		this.peoMissionMapVersionCode = peoMissionMapVersionCode;
		this.peoMissionMapVersionDate = peoMissionMapVersionDate;
		this.peoMissionMapVersionIsused = peoMissionMapVersionIsused;
		this.missionPeoMaps = missionPeoMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "peo_mission_map_version_id", unique = true, nullable = false)
	public Integer getPeoMissionMapVersionId() {
		return this.peoMissionMapVersionId;
	}

	public void setPeoMissionMapVersionId(Integer peoMissionMapVersionId) {
		this.peoMissionMapVersionId = peoMissionMapVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "peo_version_id")
	public PeoVersion getPeoVersion() {
		return this.peoVersion;
	}

	public void setPeoVersion(PeoVersion peoVersion) {
		this.peoVersion = peoVersion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "univ_mission_version_id")
	public UnivMissionVersion getUnivMissionVersion() {
		return this.univMissionVersion;
	}

	public void setUnivMissionVersion(UnivMissionVersion univMissionVersion) {
		this.univMissionVersion = univMissionVersion;
	}

	@Column(name = "peo_mission_map_version_code", nullable = false)
	public int getPeoMissionMapVersionCode() {
		return this.peoMissionMapVersionCode;
	}

	public void setPeoMissionMapVersionCode(int peoMissionMapVersionCode) {
		this.peoMissionMapVersionCode = peoMissionMapVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "peo_mission_map_version_date", nullable = false, length = 10)
	public Date getPeoMissionMapVersionDate() {
		return this.peoMissionMapVersionDate;
	}

	public void setPeoMissionMapVersionDate(Date peoMissionMapVersionDate) {
		this.peoMissionMapVersionDate = peoMissionMapVersionDate;
	}

	@Column(name = "peo_mission_map_version_isused", nullable = false)
	public boolean isPeoMissionMapVersionIsused() {
		return this.peoMissionMapVersionIsused;
	}

	public void setPeoMissionMapVersionIsused(boolean peoMissionMapVersionIsused) {
		this.peoMissionMapVersionIsused = peoMissionMapVersionIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peoMissionMapVersion")
	public Set<MissionPeoMap> getMissionPeoMaps() {
		return this.missionPeoMaps;
	}

	public void setMissionPeoMaps(Set<MissionPeoMap> missionPeoMaps) {
		this.missionPeoMaps = missionPeoMaps;
	}

}
