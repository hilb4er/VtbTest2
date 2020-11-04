package api_test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class dtoAccounts {
    Date closing_date ;
    int partial_withdraw_available;
    boolean isSalary;
    int transactions_total_amount;
    int type;
    String title;
    String design_url;
    int tariff_avg_month_balance;
    int refill_available;
    int account_id;
    int balance;
    String scheme_id;
    String title_small;
    String currency;
    int blocked_amount;
    String pan;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

}
