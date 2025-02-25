package com.example.viewpropertyservice.dto;

import com.example.viewpropertyservice.entity.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class PropertyDTO {

    private int propertyId;
    private String propertyName;
    private String price;
    private String area;
    private int action;
    private int ageYears;
    private String furnishing;
    private Date availableFrom;
    private Date availableTo;
    private String parkingAvailability;
    private boolean isSold;
    private LocalDateTime createdAt;
    private List<Image> images;
    private List<SocietyAmenities> societyAmenities;
    private List<FlatAmenities> flatAmenities;
    private Category category;
    private Type type;
    private Address address;
    private OwnerDTO owner;

}
