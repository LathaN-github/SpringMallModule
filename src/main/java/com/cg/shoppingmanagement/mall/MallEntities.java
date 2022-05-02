package com.cg.shoppingmanagement.mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MallEntities {
		@Id
	    private int Id;
		private String mallAdmin;
		private String mallName;
		private String location;
		private int shops_id;
		private String categories;
		
		private MallEntities() 
		{
			
		}
		public MallEntities(int id, String mallAdmin, String mallName, String location, int shops_id,
				String categories) {
			
			Id = id;
			this.mallAdmin = mallAdmin;
			this.mallName = mallName;
			this.location = location;
			this.shops_id = shops_id;
			this.categories = categories;
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getMallAdmin() {
			return mallAdmin;
		}
		public void setMallAdmin(String mallAdmin) {
			this.mallAdmin = mallAdmin;
		}
		public String getMallName() {
			return mallName;
		}
		public void setMallName(String mallName) {
			this.mallName = mallName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getShops_id() {
			return shops_id;
		}
		public void setShops_id(int shops_id) {
			this.shops_id = shops_id;
		}
		public String getCategories() {
			return categories;
		}
		public void setCategories(String categories) {
			this.categories = categories;
		}
		@Override
		public String toString()
		{
			return "MallEntities[mallAdmin=" +mallAdmin+",mallName=" +mallName+ ",location=" +location+",shops_id=" +shops_id+",categories=" +categories+"]";
		}
		
		
		

}
