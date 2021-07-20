package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date duodate;
	private Double amount;
	
	public Installment() {
	}

	public Installment(Date duodate, Double amount) {
		super();
		this.duodate = duodate;
		this.amount = amount;
	}

	public Date getDuodate() {
		return duodate;
	}

	public void setDuodate(Date duodate) {
		this.duodate = duodate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(duodate) + " - " + String.format("%.2f", amount);
	}

}
