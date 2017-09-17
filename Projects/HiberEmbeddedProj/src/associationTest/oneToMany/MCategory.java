package associationTest.oneToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="MCategory")
public class MCategory {

		@Id
		@GeneratedValue
		@Column(name="category_id")
		private int id;
		 
		@Column(name="category_name")
		private String categoryName;

		@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
		private Set<MProduct> product;
		 
		

		public Set<MProduct> getProduct() {
			return product;
		}

		public void setProduct(Set<MProduct> product) {
			this.product = product;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		
		
		
		
}
