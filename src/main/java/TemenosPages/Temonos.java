package TemenosPages;

import TemenosPages.AppAuth.LoginClass;
import TemenosPages.AppAuth.LogoutClass;
import TemenosPages.Customers.IndCustomers.AmendIndCustomer;
import TemenosPages.Customers.IndCustomers.AuthorizeIndCustomer;
import TemenosPages.Customers.IndCustomers.CreateIndCustomer;
import TemenosPages.Teller.CashDepositForeign;
import TemenosPages.Teller.CashDepositLocal;
import TemenosPages.Teller.CashWithdrawalLocal;

public class Temonos {

    public LoginClass login = new LoginClass();
    public LogoutClass logout = new LogoutClass();

    public HomeMenuNav homeMenuNav = new HomeMenuNav();

    public CreateIndCustomer createIndCustomer = new CreateIndCustomer();

    public CashDepositLocal cashDepositLocalRecall = new CashDepositLocal();

    public CashWithdrawalLocal cashWithdrawalLocal = new CashWithdrawalLocal();
    public CashDepositForeign cashDepositForeignRecall = new CashDepositForeign();

    public AuthorizeIndCustomer authorizeIndCustomer = new AuthorizeIndCustomer();

    public AmendIndCustomer amendindCustomer = new AmendIndCustomer();


}
