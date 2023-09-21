package ra.thuchanh2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    /* - Khong chua cac ky tu dac biet
    *  - phai dai hon 6 ky tu
    *  - khong chua cac ky tu viet hoa
    *  - cho phep dau gach duoi (_)
    *  */
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public  AccountExample() {

    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX) ;
        Matcher matcher = pattern.matcher(regex) ;
        return matcher.matches();
    }
}
