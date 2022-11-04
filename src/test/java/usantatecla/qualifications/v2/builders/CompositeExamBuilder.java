package usantatecla.qualifications.v2.builders;

import java.util.ArrayList;
import java.util.List;

import usantatecla.qualifications.v2.CompositeExam;
import usantatecla.qualifications.v2.Exam;

public class CompositeExamBuilder extends ExamBuilder {
	private List<Exam> exams;
	
	public CompositeExamBuilder() {
		super();
		this.exams = new ArrayList<Exam>();
	}
	
	public CompositeExamBuilder exam(Exam exam) {
		this.exams.add(exam);
		return this;
	}
	
	public CompositeExam build() {
		return new CompositeExam(name, rateBuilder.build(), exams);
	}

}
