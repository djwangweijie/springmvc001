package com.wwj.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Person  implements  Serializable{
		private  int pid;
		private  String name;
		private  Date   bir;
		private  List<String> dognames;
		public List<String> getDognames() {
			return dognames;
		}
		public void setDognames(List<String> dognames) {
			this.dognames = dognames;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getBir() {
			return bir;
		}
		public void setBir(Date bir) {
			this.bir = bir;
		}
		
		
}
