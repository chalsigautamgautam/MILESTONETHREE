package com.university.milestonethree.exception;

public class UniversityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UniversityNotFoundException(String id) {
		super(id);
	}
}

