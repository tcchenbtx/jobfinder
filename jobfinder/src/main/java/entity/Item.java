package entity;

import java.util.Set;

import lombok.Getter;
import lombok.Builder;


@Getter
@Builder
public class Item {
	private String itemId;
	private String name;
	private String address;
	private Set<String> keywords;
	private String imageUrl;
	private String url;
}

