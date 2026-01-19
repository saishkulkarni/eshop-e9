package com.jsp.shopping.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jsp.shopping.dto.ProductDto;
import com.jsp.shopping.dto.UserDto;
import com.jsp.shopping.entity.Product;
import com.jsp.shopping.entity.User;

@Mapper(componentModel = "spring")
public interface MyMapper {

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "role", ignore = true)
	@Mapping(target = "active", expression = "java(true)")
	User toUserEntity(UserDto dto);

	@Mapping(target = "createdTime", ignore = true)
	Product toProductEntity(ProductDto productDto);

	ProductDto toProductDto(Product product);

	List<ProductDto> toProductDtoList(List<Product> products);

}
