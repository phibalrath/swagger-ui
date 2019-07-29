package com.tts.swagger.models;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ItemV2 {
	@ApiModelProperty(notes = "The name of the menu item")
	private String name;
	@ApiModelProperty(notes = "The description of the menu item")
	private String description;
	@ApiModelProperty(notes = "The category of the menu item (appetizer, entree, dessert, etc)")
	private String category;
	@ApiModelProperty(notes = "The ingredients used in the menu item")
	//private List<String> ingredients;
	 //@ApiModelProperty(notes = "The price of the menu item")
	private double price;
	 @ApiModelProperty(notes = "The creation date of the menu item")
	private Date createdDate;
	@ApiModelProperty(notes = "The last updated date of the menu item")
	private Date updatedDate;
	@ApiModelProperty(notes = "Does item contain Gluten? T/F")
	private boolean glutenFree;
	@ApiModelProperty(notes = "true/false if an item is Vegeterian")
	private boolean vegetarian;
	
}
