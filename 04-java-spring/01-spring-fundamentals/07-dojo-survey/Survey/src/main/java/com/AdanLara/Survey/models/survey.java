package com.AdanLara.Survey.models;

public class survey {
		
		private String name;
		private String location;
		private String language;
		private String comment;
		
		public survey(String name, String location, String language, String comment) {
			this.location=location;
			this.name=name;
			this.language=language;
			this.comment= comment;
		}

		public String getName() {
			
			return name;
			
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
	
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getComment() {
			return comment;
		}

		public void setComments(String comment) {		
			this.comment = comment;
		}
		
	}

