package vttp2022.ssf.day18.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CartService {

	// Takes a CSV and convert to a List<String>
	public List<String> deserialize(String s) {
		String[] items = s.split(",");
		List<String> contents = new LinkedList<>();
		for (String i: items)
			contents.add(i);
		return contents;
	}

	public String serialize(List<String> c) {
		return String.join(",", c);
	}
}