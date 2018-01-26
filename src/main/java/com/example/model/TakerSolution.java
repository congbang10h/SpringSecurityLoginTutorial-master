package com.example.model;
// Generated Jan 26, 2018 7:48:52 PM by Hibernate Tools 4.3.5.Final

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

/**
 * TakerSolution generated by hbm2java
 */
@Entity
@Table(name = "taker_solution", catalog = "test")
public class TakerSolution implements java.io.Serializable {

	private Integer takerSolutionId;
	private Question question;
	private TakerTestMap takerTestMap;
	private Set<TakersolutionComponent> takersolutionComponents = new HashSet<TakersolutionComponent>(0);
	private Set<FilledElement> filledElements = new HashSet<FilledElement>(0);

	public TakerSolution() {
	}

	public TakerSolution(Question question, TakerTestMap takerTestMap,
			Set<TakersolutionComponent> takersolutionComponents, Set<FilledElement> filledElements) {
		this.question = question;
		this.takerTestMap = takerTestMap;
		this.takersolutionComponents = takersolutionComponents;
		this.filledElements = filledElements;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "taker_solution_id", unique = true, nullable = false)
	public Integer getTakerSolutionId() {
		return this.takerSolutionId;
	}

	public void setTakerSolutionId(Integer takerSolutionId) {
		this.takerSolutionId = takerSolutionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taker_test_map_id")
	public TakerTestMap getTakerTestMap() {
		return this.takerTestMap;
	}

	public void setTakerTestMap(TakerTestMap takerTestMap) {
		this.takerTestMap = takerTestMap;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "takerSolution")
	public Set<TakersolutionComponent> getTakersolutionComponents() {
		return this.takersolutionComponents;
	}

	public void setTakersolutionComponents(Set<TakersolutionComponent> takersolutionComponents) {
		this.takersolutionComponents = takersolutionComponents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "takerSolution")
	public Set<FilledElement> getFilledElements() {
		return this.filledElements;
	}

	public void setFilledElements(Set<FilledElement> filledElements) {
		this.filledElements = filledElements;
	}

}
