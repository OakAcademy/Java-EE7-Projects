package beans;
import java.util.*;
public class MyWallet {

	String[] coins={"1C","1C","5C","25C", "25C"};
	String[] currencies={"$1","$1","$1","$5","$10","$10","$20"};
	String[] receipts={"gas-$42.50", "groceries-$35.26" ,"bookstore-$12.99"};
	public String[] getCoins() {
		return coins;
	}
	public String[] getCurrencies() {
		return currencies;
	}
	public String[] getReceipts() {
		return receipts;
	}
}
