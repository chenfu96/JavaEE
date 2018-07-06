package cn.bjsxt.account2;
/**
 * ºÚµ•≤‚ ‘
 * @author acer
 *
 */
public class Agent {

	public static void main(String[] args) {
		Account checking = new CheckingAccount();
		Account saveing = new SavingAccount();
		checking.setOver(100000);
		test(saveing);
		test(checking);
	}
	public static void test(Account user){
		System.out.println(user.balances);
	}
}
