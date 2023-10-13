package com.mahmud.mydoc.common.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@ToString
public abstract class BaseEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long componentId;
	@Column(unique=true, nullable = false, length = 128)
	private String uniqueCode;

	private Integer version;

	private Integer status;

	private Long createdBy;

	private Long lastUpdatedBy;
	
	
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Temporal(TemporalType.DATE)
	private Date lastUpdatedDate;
	
	@PrePersist
	private void onCreate() {

		createdDate = (createdDate != null) ? createdDate : new Date();
		lastUpdatedDate=(lastUpdatedDate != null) ? lastUpdatedDate : new Date();
		uniqueCode = (uniqueCode != null) ? uniqueCode : String.valueOf(UUID.randomUUID());
	}
	
	@PreUpdate
	 protected void onUpdate() {
		lastUpdatedDate = new Date();
	  }
	
}
