package com.hcl.carservicing.carservice.dto;

import java.util.List;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ServiceCenterDTO {
	private Long Id;
	
    @NotNull(message = "Name is mandatory")
    @Size(min = 4, max = 30, message = "Name must be between 4 and 30 characters")
    private String name;

    @NotNull(message = "Address is mandatory")
    @Size(min = 10, max = 255, message = "Address must be between 10 and 255 characters")
    private String address;

    @NotNull(message = "Rating is mandatory")
    @DecimalMin(value = "0.0", inclusive = true, message = "Rating must be at least 0.0")
    @DecimalMax(value = "5.0", inclusive = true, message = "Rating must be at most 5.0")
    private Double rating;
    
    private List<ServiceRequestDTO> servicingRequests;
    
    private List<ServiceCenterServiceTypeDTO> serviceCenterServiceTypes;
    
    private List<DeliveryBoyDTO> deliveryBoys;

	public List<ServiceRequestDTO> getServicingRequests() {
		return servicingRequests;
	}

	public void setServicingRequests(List<ServiceRequestDTO> servicingRequests) {
		this.servicingRequests = servicingRequests;
	}

	public List<ServiceCenterServiceTypeDTO> getServiceCenterServiceTypes() {
		return serviceCenterServiceTypes;
	}

	public void setServiceCenterServiceTypes(List<ServiceCenterServiceTypeDTO> serviceCenterServiceTypes) {
		this.serviceCenterServiceTypes = serviceCenterServiceTypes;
	}

	public List<DeliveryBoyDTO> getDeliveryBoys() {
		return deliveryBoys;
	}

	public void setDeliveryBoys(List<DeliveryBoyDTO> deliveryBoys) {
		this.deliveryBoys = deliveryBoys;
	}

	private Boolean available = true;
    
    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
