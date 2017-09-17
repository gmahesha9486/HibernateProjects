package embeddedIdTest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class OrderDetPK implements Serializable {

		@Column(name="orderid")
		private int orderID;
		
		@Column(name="groupid")
		private int groupID;

		public int getOrderID() {
			return orderID;
		}

		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}

		public int getGroupID() {
			return groupID;
		}

		public void setGroupID(int groupID) {
			this.groupID = groupID;
		}
		
		
		
}
