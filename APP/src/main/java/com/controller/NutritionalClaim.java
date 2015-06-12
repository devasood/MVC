package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NutritionalClaim {
		private enum NUTRITIONALCLAIM{
			fatFree,goodSourceOfFiber,lowFat,lowSodium,sugarFree
		}
		@Id @GeneratedValue
		private String nutritional_id;
		@Column
		private String nutritionalClaim;
		
		public String getContent() {
			return nutritionalClaim;
		}
		public void setContent(String content) {
			try{
				String temp=""+NUTRITIONALCLAIM.valueOf(content);
				this.nutritionalClaim = temp;
			
			}catch(Exception e)
			{e.printStackTrace();}
		}
		
		
}
