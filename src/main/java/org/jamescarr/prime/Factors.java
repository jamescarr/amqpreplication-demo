package org.jamescarr.prime;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder={"results"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Factors implements Serializable{
	private static final long serialVersionUID = -8962029334226053241L;
	private List<Long> results;
	public Factors(){}
	public List<Long> getFactors() {
		return results;
	}


	public Factors(List<Long> factors) {
		this.results = factors;
	}

}
