package de.femtopedia.studip.json;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ScheduledCourse {

	private int start;
	private int end;
	private String content;
	private String title;
	private String color;
	private String type;

}