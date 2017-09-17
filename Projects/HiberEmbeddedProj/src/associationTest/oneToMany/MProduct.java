package associationTest.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MProduct")
public class MProduct {

		@Id
		@GeneratedValue
		@Column(name="product_id")
		private int  id;
		
		@Column(name="product_name")
		private String productName;
		
		@ManyToOne
		@JoinColumn(name="category_id")
		private MCategory category;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getProductName() {
			return productName;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		public MCategory getCategory() {
			return category;
		}


		public void setCategory(MCategory category) {
			this.category = category;
		}
		
		
}
