/**
 * 
 */
package com.example.cipherchatzy.Model;

import java.io.Serializable;

/**
 * @author Raj Kumar
 *
 */
public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

}
