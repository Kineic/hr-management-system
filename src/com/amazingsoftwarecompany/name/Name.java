package com.amazingsoftwarecompany.name;

import java.io.Serializable;

public class Name implements Serializable {

		/**
	 *
	 */
	private static final long serialVersionUID = 1L;

		String title;
		String fName;
		String lName;
		
		public Name(String title, String fName, String lName) {
			super();
			this.title = title;
			this.fName = fName;
			this.lName = lName;
		}
		
		@Override
		public String toString() {
			return "Name [title=" + title + ", fName=" + fName + ", lName=" + lName + "]";
		}

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
}
