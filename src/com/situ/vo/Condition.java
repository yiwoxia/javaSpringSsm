package com.situ.vo;

import java.io.Serializable;

import com.situ.pojo.Banji;
import com.situ.pojo.Coures;
import com.situ.pojo.Student;

@SuppressWarnings("all")
public class Condition<T>  implements Serializable {

		private Integer pageIndex;
		private Integer pageSize;
		private Student student;
		private Banji banji;
		private Coures coures;
		private String cname;
		private String name;

		public Condition() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Condition(Integer pageIndex, Integer pageSize, Student student, Banji banji, Coures coures) {
			super();
			this.pageIndex = pageIndex;
			this.pageSize = pageSize;
			this.student = student;
			this.banji = banji;
			this.coures = coures;
		}

		
		
		public Condition(Integer pageIndex, Integer pageSize, Student student, Banji banji, Coures coures, String cname,
				String name) {
			super();
			this.pageIndex = pageIndex;
			this.pageSize = pageSize;
			this.student = student;
			this.banji = banji;
			this.coures = coures;
			this.cname = cname;
			this.name = name;
		}

		public Condition(Integer pageIndex, Integer pageSize, Coures coures) {
			super();
			this.pageIndex = pageIndex;
			this.pageSize = pageSize;
			this.coures = coures;
		}

		public Condition(Integer pageIndex, Integer pageSize, Banji banji) {
			super();
			this.pageIndex = pageIndex;
			this.pageSize = pageSize;
			this.banji = banji;
		}

		public Condition(Integer pageIndex, Integer pageSize, Student student) {
			super();
			this.pageIndex = pageIndex;
			this.pageSize = pageSize;
			this.student = student;
		}

		public Integer getPageIndex() {
			return pageIndex;
		}

		public void setPageIndex(Integer pageIndex) {
			this.pageIndex = pageIndex;
		}

		public Integer getPageSize() {
			return pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Banji getBanji() {
			return banji;
		}

		public void setBanji(Banji banji) {
			this.banji = banji;
		}

		public Coures getCoures() {
			return coures;
		}

		public void setCoures(Coures coures) {
			this.coures = coures;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Condition [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", student=" + student + ", banji="
					+ banji + ", coures=" + coures + ", cname=" + cname + ", name=" + name + "]";
		}

		

		

} 
