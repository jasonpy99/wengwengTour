package com.tour.account.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author <Auto generate>
 * @version 2015-07-15
 * @see com.tour.account.entity.Food
 */

public class Order implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private Long id;
	private Long type;
	private Long typeid;
	private Long userid;
	private String photo;
	private String name;
	private Double price;
	private Date cTime;
	private Date validDate;
	private Long number;
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getTypeid() {
		return typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getcTime() {
		return cTime;
	}

	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}
