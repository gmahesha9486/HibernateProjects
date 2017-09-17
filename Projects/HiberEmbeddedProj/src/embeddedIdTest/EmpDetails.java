package embeddedIdTest;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class EmpDetails {

		@Column(name="order_description")
		private String description;
		
		@Column(name="order_quantity")
		private int quantity;
		
		@Column(name="order_rate")
		private double rate;
		
		@EmbeddedId
		private OrderDetPK order;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getRate() {
			return rate;
		}

		public void setRate(double rate) {
			this.rate = rate;
		}

		public OrderDetPK getOrder() {
			return order;
		}

		public void setOrder(OrderDetPK order) {
			this.order = order;
		}
		
		
}
