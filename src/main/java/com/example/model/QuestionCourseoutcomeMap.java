package com.example.model;
// Generated Jan 26, 2018 7:48:52 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * QuestionCourseoutcomeMap generated by hbm2java
 */
@Entity
@Table(name = "question_courseoutcome_map", catalog = "test")
public class QuestionCourseoutcomeMap implements java.io.Serializable {

	private Integer questionCourseoutcomeMapId;
	private CourseOutcome courseOutcome;
	private Question question;
	private double questionCourseoutcomeMapFactor;

	public QuestionCourseoutcomeMap() {
	}

	public QuestionCourseoutcomeMap(double questionCourseoutcomeMapFactor) {
		this.questionCourseoutcomeMapFactor = questionCourseoutcomeMapFactor;
	}

	public QuestionCourseoutcomeMap(CourseOutcome courseOutcome, Question question,
			double questionCourseoutcomeMapFactor) {
		this.courseOutcome = courseOutcome;
		this.question = question;
		this.questionCourseoutcomeMapFactor = questionCourseoutcomeMapFactor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_courseoutcome_map_id", unique = true, nullable = false)
	public Integer getQuestionCourseoutcomeMapId() {
		return this.questionCourseoutcomeMapId;
	}

	public void setQuestionCourseoutcomeMapId(Integer questionCourseoutcomeMapId) {
		this.questionCourseoutcomeMapId = questionCourseoutcomeMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "co_id")
	public CourseOutcome getCourseOutcome() {
		return this.courseOutcome;
	}

	public void setCourseOutcome(CourseOutcome courseOutcome) {
		this.courseOutcome = courseOutcome;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name = "question_courseoutcome_map_factor", nullable = false, precision = 22, scale = 0)
	public double getQuestionCourseoutcomeMapFactor() {
		return this.questionCourseoutcomeMapFactor;
	}

	public void setQuestionCourseoutcomeMapFactor(double questionCourseoutcomeMapFactor) {
		this.questionCourseoutcomeMapFactor = questionCourseoutcomeMapFactor;
	}

}
