// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

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
 * CourseTopicMap generated by hbm2java
 */
@Entity
@Table(name = "course_topic_map", catalog = "test")
public class CourseTopicMap implements java.io.Serializable {

	private Integer courseTopicMapId;
	private Course course;
	private Topic topic;

	public CourseTopicMap() {
	}

	public CourseTopicMap(Course course, Topic topic) {
		this.course = course;
		this.topic = topic;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_topic_map_id", unique = true, nullable = false)
	public Integer getCourseTopicMapId() {
		return this.courseTopicMapId;
	}

	public void setCourseTopicMapId(Integer courseTopicMapId) {
		this.courseTopicMapId = courseTopicMapId;
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
	@JoinColumn(name = "topic_id")
	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
