/**
 * 
 */
package droolscourse;

import java.util.Date;

/**
 * @author SV864CC
 *
 */
public class CashFlow {
	private Date mvtDate;
	private double amount;
	private int type;
	private long accountNo;
	public Date getMvtDate() {
		return mvtDate;
	}
	public void setMvtDate(Date mvtDate) {
		this.mvtDate = mvtDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getAccount() {
		return accountNo;
	}
	public void setAccount(long account) {
		this.accountNo = account;
	}
	

}