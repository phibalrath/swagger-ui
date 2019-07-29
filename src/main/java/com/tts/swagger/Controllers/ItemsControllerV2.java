package com.tts.swagger.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.swagger.models.ItemV1;
import com.tts.swagger.models.ItemV2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Menuitems", description="Operations pertaining to Menu Items")
@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Successfully retrieved menu items"),
	    @ApiResponse(code = 401, message = "You are not authorized to view the menu items")
	})
@RequestMapping("/v2")
public class ItemsControllerV2 {
	@ApiOperation(value = "Get all menu items", response = ItemV1.class, 
            responseContainer = "List")
	@GetMapping("/items")
	public ResponseEntity<List<ItemV2>> getItems() {
		return new ResponseEntity<>(new ArrayList<ItemV2>(), HttpStatus.OK);
	}

}
