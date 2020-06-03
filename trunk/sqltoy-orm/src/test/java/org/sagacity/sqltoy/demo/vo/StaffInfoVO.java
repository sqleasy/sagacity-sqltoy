/**
 * 
 */
package org.sagacity.sqltoy.demo.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zhong
 *
 */
@Entity(name = "")
@Table(name = "SYS_STAFF_INFO", schema = "")
public class StaffInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5297979866915758170L;

	@Id
	private String staffId;

	private String staffName;

	private Integer[] statusAry;

	/**
	 * @return the staffName
	 */
	public String getStaffName() {
		return staffName;
	}

	/**
	 * @param staffName the staffName to set
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/**
	 * @return the statusAry
	 */
	public Integer[] getStatusAry() {
		return statusAry;
	}

	/**
	 * @param statusAry the statusAry to set
	 */
	public void setStatusAry(Integer... statusAry) {
		this.statusAry = statusAry;
	}

}
