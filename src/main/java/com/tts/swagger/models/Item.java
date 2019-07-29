package com.tts.swagger.models;

import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Item {
	@ApiModelProperty(notes = "The name of the menu item")
	private String name;
	@ApiModelProperty(notes = "The description of the menu item")
	private String description;
	private String category;
	private List<String> ingredients;
	private double price;
	private Date createdDate;
	private Date updatedDate;
}
