package com.mahmud.mydoc.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public abstract class BaseModel {
	private Long componentId;
	private String uniqueCode;
	private Integer version;
	private Integer status;
	private Long createdBy;
	private Long lastUpdatedBy;
	private Date createdDate;
	private Date lastUpdatedDate;
}
